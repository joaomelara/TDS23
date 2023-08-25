<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>
</head>
<body>
<header>
<nav class = "navbar navbar-expand-md navbar-dark"
style = "background-color:tomato"
>
<div>
<a href="" class = "navbar-brand"> Aplicação de user</a>

</div>
<ul class = "navbar-nav">
<li><a href="<%=request.getContextPath() %>/list"
class = "nav-link">Usuarios</a><li>

</ul>
</nav>

</header>

<br>
<div class = "caontainer col-md-5">
<div class = "card">
<div class= "card-body">
<c:if test = "${usuario != null }">
<form action = "update" method = "post">
</c:if>
<c:if test "${usuario == null }>
<form action = "insert" method= "post">
</c:if>
<caption>
<h2>
<c:if test "${usuario != null }">
Edit User
</c:if>
<c:if test "${usuario == null }">
Add new user
</c:if>
</h2>
</caption>
<c:if test "${usuario !=null }">
<input type = "hidden" name = "id" value="<c:out value '${usuario.id }'/>" />
</c:if>
<fieldset class = "form-group">
<label>Nome do usuario</label> <input type="text"
value = "<c:out value = '${usuario.name}'/> class = "form-control"
name = "name" required = "required">
</fieldset>

<fieldset class = "form-group">
<label>Email</label> <input type="text"
value = "<c:out value = '${usuario.email}'/> class = "form-control"
name = "name" required = "required">
</fieldset>

<fieldset class = "form-group">
<label>Pais</label> <input type="text"
value = "<c:out value = '${usuario.pais}'/> class = "form-control"
name = "name" required = "required">
</fieldset>

<button type = "submit" class = "btn btn-success">Salvar</button>
</form>

</div>
</div>
</div>
</body>
</html>