package DAO;

import util.ConectarBD;
import model.AlunoBean;
import java.sql.*;

public class ExcluirAlunoDAO {
    Statement executar;
    PreparedStatement sql;
    Connection conexao;
    ResultSet lista;
    
    public boolean Excluir(int id) throws ClassNotFoundException, SQLException{
        try{
            conexao = ConectarBD.conectar();

            sql = conexao.prepareStatement("DELETE FROM aluno WHERE id = ?");
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
