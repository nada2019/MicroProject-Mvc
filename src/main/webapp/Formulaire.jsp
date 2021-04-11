<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="\MicroProjet\\css\style.css" rel="stylesheet">
<title>Formulaire</title>
</head>
<body>

   <div align="center">
  <h1>Client Register Form</h1>
  <form action="register" method="post">
   <table style="with: 80%">
    <tr>
     <td>Nom</td>
     <td><input type="text" name="FirstName" /></td>
    </tr>
    <tr>
     <td>Prenom</td>
     <td><input type="text" name="LastName" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="Email" /></td>
    </tr>
    <tr>
     <td>Mot de passe</td>
     <td><input type="password" name="Password" /></td>
    </tr>
    <tr>
     <td>Addresse</td>
     <td><input type="text" name="Adress" /></td>
    </tr>
    <tr>
     <td>Ville</td>
     <td><input type="text" name="Ville" /></td>
    </tr>
     <tr>
     <td>Code Postal</td>
     <td><input type="text" name="CodePostal" /></td>
    </tr>
     <tr>
     <td>telephone</td>
     <td><input type="text" name="PhoneNumber" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>