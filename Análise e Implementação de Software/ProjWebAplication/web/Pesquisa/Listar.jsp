<%@page import="util.ConectarBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista da Pesquisa | FitHouse</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <div class="lista">
            <a href="Cadastro.html" class="botaoVoltar"> Voltar </a>
            
           <h1>Lista da Pesquisa</h1>
           <table>
               <thead>
                   <tr>
                       <th>Nome</th><!-- comment -->
                       <th>Email</th><!-- comment -->
                       <th>Qualidade</th><!-- comment -->
                       <th>Limpeza</th>
                       <th>Suporte</th>
                       <th>Satisfação</th>
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
                       sql=conexao.prepareStatement("select * from pesquisa");
                       lista=sql.executeQuery();
                       
                       while (lista.next()){
                           
                            String nome=lista.getString("nome");
                            String email=lista.getString("email");
                            int resp1=lista.getInt("p1");
                            int resp2=lista.getInt("p2");
                            int resp3=lista.getInt("p3");
                            int resp4=lista.getInt("p4");
                       
                       %>
                       <tr>
                            <td><%= nome %></td>
                            <td><%= email %></td>
                            <td><%= resp1 %></td>
                            <td><%= resp2 %></td>
                            <td><%= resp3 %></td>
                            <td><%= resp4 %></td>
                            
                            <td> <a href="Editar.jsp?id=<%= lista.getInt("id") %>" class="botaoEditar"> Editar </a></td>
                            <td> <a href="Excluir.jsp?id=<%= lista.getInt("id") %>" class="botaoExcluir" > Excluir </a></td>
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