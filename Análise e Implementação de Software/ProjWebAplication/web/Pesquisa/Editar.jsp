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
            <h1>Editar Pesquisa</h1>

            <%
                //Pegando o id do item
                int id = Integer.parseInt(request.getParameter("id"));

                //Conectando bd
                Connection conexao = ConectarBD.conectar();
                //Selecionando todos os dados do item pelo id
                PreparedStatement sql = conexao.prepareStatement("SELECT * FROM pesquisa WHERE id=?");
                sql.setInt(1, id); //Colocando o id do item
                ResultSet lista = sql.executeQuery();

                if (lista.next()) {
            %>

            <form method="POST" action="EditarConfirmar.jsp">

                <input type="hidden" name="id" value="<%= lista.getInt("id") %>">

                <label>Nome:  </label>
                <input type="text" name="nome" value="<%= lista.getString("nome") %>"><br><br>

                <label>Email:  </label>
                <input type="text" name="email" value="<%= lista.getString("email") %>"><br><br>

                <label>1. Qualidade:  </label>
                <input type="number" name="r1" min="1" max="5" value="<%= lista.getInt("p1") %>"><br><br>

                <label>2. Limpeza:  </label>
                <input type="number" name="r2" min="1" max="5" value="<%= lista.getInt("p2") %>"><br><br>

                <label>3. Suporte:  </label>
                <input type="number" name="r3" min="1" max="5" value="<%= lista.getInt("p3") %>"><br><br>

                <label>4. Satisfação:  </label>
                <input type="number" name="r4" min="1" max="5" value="<%= lista.getInt("p4") %>"><br><br>

                <input type="submit" value="Salvar Alterações">

            </form>

            <%
                } else {
                    out.print("Registro não encontrado!");
                }
            %>

            <br>
            <a href="Listar.jsp" class="botaoVoltar">Voltar</a>
        </div>
    </body>
</html>
