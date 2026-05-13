package DAO;

import java.sql.*;
import util.ConectarBD;
import model.PesquisaBean;

public class EditarDAO {
    Statement executar;
    PreparedStatement sql;
    Connection conexao;
    ResultSet lista;
    
    public boolean Editar(PesquisaBean p) throws ClassNotFoundException, SQLException{
        try {
            conexao = ConectarBD.conectar();
            sql = conexao.prepareStatement(
                "UPDATE pesquisa SET nome=?, email=?, p1=?, p2=?, p3=?, p4=? WHERE id=?"
            );

            sql.setString(1, p.getNome());
            sql.setString(2, p.getEmail());
            sql.setInt(3, p.getR1());
            sql.setInt(4, p.getR2());
            sql.setInt(5, p.getR3());
            sql.setInt(6, p.getR4());
            sql.setInt(7, p.getId());

            sql.executeUpdate();
            return true;
        }
        catch (SQLException e){
            System.out.println("Erro: " + e);
            return false;
        }
    }
}
