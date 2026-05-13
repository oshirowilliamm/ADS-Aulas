<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.InserirDAO"%>
<%@page import="model.PesquisaBean"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrando...</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <%
            //Buscando os dados no formulário
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            int r1 = Integer.parseInt(request.getParameter("r1"));
            int r4 = Integer.parseInt(request.getParameter("r2"));
            int r3 = Integer.parseInt(request.getParameter("r3"));
            int r2 = Integer.parseInt(request.getParameter("r4"));

            //Instanciando o model
            PesquisaBean pesq = new PesquisaBean();

            //Encapsulando
            pesq.setNome(nome);
            pesq.setEmail(email);
            pesq.setR1(r1);
            pesq.setR2(r2);
            pesq.setR3(r3);
            pesq.setR4(r4);
            
            //Mensagem da notifição
            String msg = "";

            //Instanciando para inserir os dados no banco
            InserirDAO inserir = new InserirDAO();
            if (inserir.Inserir(pesq)) {
                msg = "Dados inseridos com sucesso!";
            } else {
                msg = "Erro ao inserir os dados.";
            }

        %> 
        
        <!--Notificação com mensagem-->
        <script>
            alert("<%= msg %>");
            window.location.href = "../index.html"; 
        </script>
    </body>
</html>
