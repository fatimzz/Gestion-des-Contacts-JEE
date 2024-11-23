<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="ModelContact.Contact" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Contacts</title>
</head>
<body>

<h1>Liste des Contacts</h1>
    <Table border="2">
       <tr>
          
          <th>Nom</th>
          <th>Prenom</th>
          <th>Adresse mail</th>
       
       </tr>
    <% 
   List<Contact> Contacts= (List<Contact>) request.getAttribute("Contacts");
      
    if(Contacts != null ){
    	
    	for(Contact contact : Contacts){
    		%>	
    <tr> 
       <td><%= contact.getNom() %></td>
       <td><%= contact.getPrenom() %></td>
       <td><%= contact.getAdresse_Mail() %></td>
    </tr>
   <%
    	}
    } else {
   
   %>
   <tr>
      <td colspan="5"> Aucun Contact trouvé.</td>
   </tr>
    
   <% } %> 
    </Table>
    
   <a href="AfficheContact.jsp">Ajouter un nouveau contact</a>
</body>
</html>