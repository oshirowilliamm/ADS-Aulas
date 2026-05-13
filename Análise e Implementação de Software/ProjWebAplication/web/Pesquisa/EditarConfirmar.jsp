<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.EditarDAO"%>
<%@page import="model.PesquisaBean"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Atualizando...</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <%
            //Pegando os dados do forms
            int id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            int r1 = Integer.parseInt(request.getParameter("r1"));
            int r2 = Integer.parseInt(request.getParameter("r2"));
            int r3 = Integer.parseInt(request.getParameter("r3"));
            int r4 = Integer.parseInt(request.getParameter("r4"));
            
            //Encapsulando os dados de volta
            PesquisaBean pesq = new PesquisaBean();
            pesq.setId(id);
            pesq.setNome(nome);
            pesq.setEmail(email);
            pesq.setR1(r1);
            pesq.setR2(r2);
            pesq.setR3(r3);
            pesq.setR4(r4);
            
            //Instanciando o editar
            EditarDAO editar = new EditarDAO();

            //Mensagem da notificação
            String msg = "";
            
            if (editar.Editar(pesq)) {
                msg = "Registro atualizado com sucesso!";
            } else {
                msg = "Erro ao atualizar o registro.";
            }
        %>
        
        <!--Notificação com mensagem-->
        <script>
            alert("<%= msg %>");
            window.location.href = "Listar.jsp"; 
        </script>
    </body>
</html>
