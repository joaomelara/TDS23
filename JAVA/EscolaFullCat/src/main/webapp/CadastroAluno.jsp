<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Aluno</title>
</head>
<body>

<div>
<form method ="post" action ="AlunoServlet">
<fieldset><legend>Cadastro Aluno</legend>
<label>Matrícula</label><input type="text" id="matricula" name="matricula" value="${aluno.matricula}" placeholder="Digite sua Matrícula"><br>
<label>Nome:</label><input type="text" id="nome" name="nome" value="${aluno.nome}" placeholder="Digite seu Nome"><br>
<label>Email:</label><input type="text" id="email" name="email" value="${aluno.email}" placeholder="Digite seu Email"><br>
<label>Telefone:</label><input type="text" id="" name="telefone" value="${aluno.telefone}" placeholder="Digite seu Telefone"><br>
<label>Sata::</label><input type="text" id="dataCadastro" name="dataCadastro" value="${aluno.dataCadastro}" placeholder="Digite sua data de Cadastro"><br>

<label>Escolha uma ação</label>

<select name="acao" required>
<option selected value = "incluir">Incluir </option>
<option selected value = "alterar">Alterar </option>
<option selected value = "excluir">Excluir </option>
<option selected value = "consultar">Consultar </option>
</select>

<input type="submit" value="Enviar">
<input type="reset" value="Limpor"><br>
</fieldset>

</form>

</div>

</body>
</html>