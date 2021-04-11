<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link href="\MicroProjet\\css\style.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

 <form action="Article" method="get">
       
<p style="color:white;">  Choisir le genre<select id="" name=""></p>
<option>Choisir le genre</option>

        
  <input type="submit"  name="action" value="valider"/>      
  </form>

<c:set var="i" value="valider" />
<c:if test="${action==i}">
<div class="styleform">
<table border="1">
<tr><th>CodeArtice<th>designation<th>Prix<th>Categorie<th>Stock
<c:forEach var="item2" items="${list2}">

<tr><th><c:out value="${item2.getCodeArt()}"/>
	<th><c:out value="${item2.getDesig()}"/>
    <th><c:out value="${item2.getPrix()}"/>
    <th><c:out value="${item2.getCateg()}"/>
    <th><c:out value="${item2.getStock()}"/>
</c:forEach>
</table>
</div>
</c:if>
  
</body>
</html>