<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion des Contacts</title>
</head>
<body>
<h1>Bienvenue dans la Gestion des Contacts</h1>
<form action="Contacts" method="post">
 
   Nom: <input type="text" name="name" required><br>
   Prenom:<input type="text" name="Prenom" required><br>
   Adresse_Mail:<input type="email" name="email" required><br>
   <input type="submit" value="Ajouter un Contact">

</form>

<a href="Contacts">Voir les Contacts</a>
</body>
</html>