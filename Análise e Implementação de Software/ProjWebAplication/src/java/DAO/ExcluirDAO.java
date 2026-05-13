package DAO;

import util.ConectarBD;
import model.PesquisaBean;
import java.sql.*;

public class ExcluirDAO {
    Statement executar;
    PreparedStatement sql;
    Connection conexao;
    ResultSet lista;
    
    public boolean Excluir(int id) throws ClassNotFoundException, SQLException{
        try{
            conexao = ConectarBD.conectar();

            sql = conexao.prepareStatement("DELETE FROM pesquisa WHERE id = ?");
            sql.setInt(1, id);

            sql.executeUpdate();

            return true;
        }
        catch (SQLException e) {
            System.out.println("Erro: " + e);
            return false;
        }
    }
}
