<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.InserirAlunoDAO"%>
<%@page import="model.AlunoBean"%>

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
            int idade = Integer.parseInt(request.getParameter("idade"));
            double peso = Double.parseDouble(request.getParameter("peso"));
            double altura = Double.parseDouble(request.getParameter("altura"));
            String objetivo = request.getParameter("objetivo");
            int frequencia = Integer.parseInt(request.getParameter("frequencia"));

            //Instanciando o model
            AlunoBean aluno = new AlunoBean();

            //Encapsulando
            aluno.setNome(nome);
            aluno.setIdade(idade);
            aluno.setPeso(peso);
            aluno.setAltura(altura);
            aluno.setObjetivo(objetivo);
            aluno.setFrequencia(frequencia);
            
            //Mensagem da notifição
            String msg = "";

            //Instanciando para inserir os dados no banco
            InserirAlunoDAO inserir = new InserirAlunoDAO();
            if (inserir.Inserir(aluno)) {
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
