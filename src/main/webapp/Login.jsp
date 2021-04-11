<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="\MicroProjet\\css\style.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

     <div align="center">
		<h1>Login Formulaire</h1>
		<form action="login" method="post">
			<table style="with: 100%">
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Mot de passe</td>
					<td><input type="password" name="password" /></td>
				</tr>

			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>