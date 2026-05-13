package DAO;

import java.sql.*;
import util.ConectarBD;
import model.AlunoBean;

public class EditarAlunoDAO {
    Statement executar;
    PreparedStatement sql;
    Connection conexao;
    ResultSet lista;
    
    public boolean Editar(AlunoBean a) throws ClassNotFoundException, SQLException{
        try {
            conexao = ConectarBD.conectar();
            sql = conexao.prepareStatement(
                "UPDATE aluno SET nome=?, idade=?, peso=?, altura=?, objetivo=?, frequencia=? WHERE id=?"
            );

            sql.setString(1, a.getNome());
            sql.setInt(2, a.getIdade());
            sql.setDouble(3, a.getPeso());
            sql.setDouble(4, a.getAltura());
            sql.setString(5, a.getObjetivo());
            sql.setInt(6, a.getFrequencia());
            sql.setInt(7, a.getId());

            sql.executeUpdate();
            return true;
        }
        catch (SQLException e){
            System.out.println("Erro: " + e);
            return false;
        }
    }
}
