<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.EditarAlunoDAO"%>
<%@page import="model.AlunoBean"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizando...</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <%
            //Pegando os dados do forms
            int id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            int idade = Integer.parseInt(request.getParameter("idade"));
            double peso = Double.parseDouble(request.getParameter("peso"));
            double altura = Double.parseDouble(request.getParameter("altura"));
            String objetivo = request.getParameter("objetivo");
            int frequencia = Integer.parseInt(request.getParameter("frequencia"));
            
            //Encapsulando os dados de volta
            AlunoBean aluno = new AlunoBean();
            aluno.setId(id);
            aluno.setNome(nome);
            aluno.setIdade(idade);
            aluno.setPeso(peso);
            aluno.setAltura(altura);
            aluno.setObjetivo(objetivo);
            aluno.setFrequencia(frequencia);
            
            //Instanciando o editar
            EditarAlunoDAO editar = new EditarAlunoDAO();

            //Mensagem da notificação
            String msg = "";
            
            if (editar.Editar(aluno)) {
                msg = "Registro atualizado com sucesso!";
            } else {
                msg = "Erro ao atualizar o registro.";
            }
        %>
        
        <!--Notificação com mensagem-->
        <script>
            alert("<%= msg %>");
            window.location.href = "ListarAluno.jsp"; 
        </script>
    </body>
</html>
