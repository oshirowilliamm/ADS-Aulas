<%@page import="util.ConectarBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista dos Alunos | FitHouse</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <div class="lista">
            <a href="CadastroAluno.html" class="botaoVoltar"> Voltar </a>
            
           <h1>Lista dos Alunos</h1>
           <table>
               <thead>
                   <tr>
                       <th>Nome</th><!-- comment -->
                       <th>Idade</th><!-- comment -->
                       <th>Peso</th><!-- comment -->
                       <th>Altura</th>
                       <th>Objetivo</th>
                       <th>Frequência</th>
                       <th colspan="2">Ações</th>
                   </tr>
               </thead>  
               <tbody>
                   <%
                     try{  
                       PreparedStatement sql;
                       ResultSet lista;
                       Connection conexao;
                       conexao=ConectarBD.conectar();
                       sql=conexao.prepareStatement("select * from aluno");
                       lista=sql.executeQuery();
                       
                       while (lista.next()){
                           
                            String nome = lista.getString("nome");
                            int idade = lista.getInt("idade");
                            double peso = lista.getDouble("peso");
                            double altura = lista.getDouble("altura");
                            String objetivo = lista.getString("objetivo");
                            int frequencia = lista.getInt("frequencia");
                       
                       %>
                       <tr>
                            <td><%= nome %></td>
                            <td><%= idade %></td>
                            <td><%= peso %></td>
                            <td><%= altura %></td>
                            <td><%= objetivo %></td>
                            <td><%= frequencia %>/sem</td>
                            
                            <td><a href="EditarAluno.jsp?id=<%= lista.getInt("id") %>" class="botaoEditar">Editar</a></td>
                            <td><a href="ExcluirAluno.jsp?id=<%= lista.getInt("id") %>" class="botaoExcluir">Excluir</a></td>
                       </tr>
                       <% 
                           }// fecha o while
                           } catch (Exception e){
                               out.println("<tr><td colspan='6'>Erro: "+ e.getMessage()+ "</td></tr>");
                           }

                       %>
    
               </tbody>
           </table>
        </div>
    </body>
</html>
