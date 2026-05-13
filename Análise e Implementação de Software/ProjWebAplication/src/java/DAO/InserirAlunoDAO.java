package DAO;

import java.sql.*;
import util.ConectarBD;
import model.AlunoBean;

public class InserirAlunoDAO {
    Statement executar;
    PreparedStatement sql;
    Connection conexao;
    ResultSet lista;
    
    public boolean Inserir(AlunoBean a) throws ClassNotFoundException, SQLException{
        try{  
          conexao = ConectarBD.conectar();
          sql =conexao.prepareStatement("INSERT INTO aluno (nome, idade, peso, altura, objetivo, frequencia) VALUES (?,?,?,?,?,?)");
          sql.setString(1, a.getNome());
          sql.setInt(2, a.getIdade());
          sql.setDouble(3,a.getPeso());
          sql.setDouble(4,a.getAltura());
          sql.setString(5,a.getObjetivo());
          sql.setInt(6,a.getFrequencia());
          
          sql.executeUpdate();
          return true;
        }
        catch (SQLException e){
            System.out.println("Erro: "+e);
            return false;
        }
    }
}
