<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.ExcluirAlunoDAO"%>
<%@page import="model.AlunoBean"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluindo...</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <%
            //Pegando o id do dado para excluir
            int id = Integer.parseInt(request.getParameter("id"));
            
            //Instanciando o excluir
            ExcluirAlunoDAO excluir = new ExcluirAlunoDAO();
            
            //Mensagem da notificação
            String msg = "";
            
            if (excluir.Excluir(id)) {
                msg = "Excluído com sucesso!";
            } else {
                msg = "Erro ao excluir registro.";
            }
        %>
        
        <!--Notificação com mensagem-->
        <script>
            alert("<%= msg %>");
            window.location.href = "ListarAluno.jsp"; 
        </script>
    </body>
</html>
