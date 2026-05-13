<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="util.ConectarBD"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Editar Registro | FitHouse </title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <div class="editar">
            <h1>Editar Aluno</h1>

            <%
                //Pegando o id do item
                int id = Integer.parseInt(request.getParameter("id"));

                //Conectando bd
                Connection conexao = ConectarBD.conectar();
                //Selecionando todos os dados do item pelo id
                PreparedStatement sql = conexao.prepareStatement("SELECT * FROM aluno WHERE id=?");
                sql.setInt(1, id); //Colocando o id do item
                ResultSet lista = sql.executeQuery();

                if (lista.next()) {
            %>

            <form method="POST" action="EditarConfirmarAluno.jsp">

                <input type="hidden" name="id" value="<%= lista.getInt("id") %>">

                <label>Nome: </label>
                <input type="text" name="nome" value="<%= lista.getString("nome") %>" required><br><br>

                <label>Idade: </label>
                <input type="number" name="idade" value="<%= lista.getInt("idade")  %>" required><br><br>

                <label>Peso (kg): </label>
                <input type="number" step="0.1" min="1" name="peso" value="<%= lista.getDouble("peso")  %>" required><br><br>

                <label>Altura (m): </label>
                <input type="number" step="0.01" min="1" name="altura" value="<%= lista.getDouble("altura")  %>" required><br><br>

                <label>Objetivo: </label>
                <input type="text" name="objetivo" value="<%= lista.getString("objetivo")  %>" required><br><br>

                <label>Frequência semanal: </label>
                <input type="number" min="1" max="7" name="frequencia" value="<%= lista.getInt("frequencia")  %>" required><br><br>

                <input type="submit" value="Salvar Alterações">

            </form>

            <%
                } else {
                    out.print("Registro não encontrado!");
                }
            %>

            <br>
            <a href="ListarAluno.jsp" class="botaoVoltar">Voltar</a>
        </div>
    </body>
</html>
