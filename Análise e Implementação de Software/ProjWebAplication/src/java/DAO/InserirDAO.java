package DAO;

import java.sql.*;
import util.ConectarBD;
import model.PesquisaBean;

public class InserirDAO {
    Statement executar;
    PreparedStatement sql;
    Connection conexao;
    ResultSet lista;
    
    public boolean Inserir(PesquisaBean p) throws ClassNotFoundException, SQLException{
        try{  
          conexao = ConectarBD.conectar();
          sql =conexao.prepareStatement("INSERT INTO pesquisa (nome,email,p1,p2,p3,p4) VALUES (?,?,?,?,?,?)");
          sql.setString(1, p.getNome());
          sql.setString(2, p.getEmail());
          sql.setInt(3,p.getR1());
          sql.setInt(4,p.getR2());
          sql.setInt(5,p.getR3());
          sql.setInt(6,p.getR4());
          
          sql.executeUpdate();
          return true;
        }
        catch (SQLException e){
            System.out.println("Erro: "+e);
            return false;
        }
    }
}
