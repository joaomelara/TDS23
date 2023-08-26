<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Usuario</title>
</head>
<body>
	
	<header>
		<nav class="navbar navbar-expand-md navbar-dakr" style="background-color: tomato">
		<div>
			<a href="" class="navbar-brand"> Aplicação de Usuario App </a>
		</div>
	
		<ul class="navbar-nav">
			<li><a href="<%=request.getContextPath()%>/list" class="nav-link"> Usuarios </a></li>
		</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
					<form action="update" method="post">				
				<caption>
					<h2>
						<c:if test="${usuario != null}">
						Edit User
						</c:if>
					</h2>
				</caption>
				
				
				<c:if test="${usuario != null}">
				<input type="hidden" name="id" value="<c:out value='${usuario.id}' />" />
				</c:if>
				
				<fieldset class="form-group">
					<label>Nome do Usuario</label> <input type="text" value="<c:out value='${usuario.name}'/>" class="form-control" name="name" required="required">
				</fieldset>
			
				<fieldset class="form-group">
					<label>Email</label> <input type="text" value="<c:out value='${usuario.email}'/>" class="form-control" name="email">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Pais</label> <input type="text" value="<c:out value='${usuario.pais}' /> " class="form-control" name="pais">
				</fieldset>
				
				<button type="submit" class="btn btn-success">Editar</button>
		</form>
		
		</div>
		</div>
	
	</div>
	
</body>
</html>