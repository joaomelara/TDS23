<%@ page language="java" contentType="text/html; text/css; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8" />
        <title>cadastro</title>
        <link rel = "stylesheet" href = "style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    </head>
  
 <body>      
    <header class="cabecalho">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark" >
      <a class="navbar-left" href="#"><img style="max-width:100px; margin-top: -7px;" src="imagens/logop.png" alt="" ></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="CadastroAluno.jsp">Cadastro</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="menu.jsp">Busca</a>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>
  </header>

  <section class="fundo2">
    
    <div class="signup">
				
      <form method="post" action="AlunoServlet" class="bao">
        <br><br>
          
    
        <div class="gamer">
				
					<form method="post" action="AlunoServlet" class="gamerform">
            <br><br>
              
            <h1 class="titulo2">Cadastro Aluno Atom</h1>
            <div class="baoDiv">
            <br><label>Nome: </label><br><input class="baoText" type="text" value="" id="nome" name="nome" value="${aluno.nome}" placeholder="Digite seu Nome."><br>
            <br><label>E-mail: </label><br><input class="baoText" type="text" value="" id="email" name="email" value="${aluno.email}" placeholder="Digite seu E-mail."><br>
            <br><label>Telefone: </label><br><input class="baoText" class="bao" type="text" value="" class="telefone" id="telefone" name="telefone" value="${aluno.telefone}" placeholder="Digite seu Telefone."><br>
            <br><label>Data: </label><br><input class="baoText" type="text" value="" id="Data" class="data" name="Data" value="${aluno.Data}" placeholder="Digite a Data."><br>
            <br><br><input value="Cadastre" class="baoSubmit" type="submit"><br><br> 
          </div>
				<br><br>
			</div>
    </form>
    
  </div>
</form>
    </div>
  
    </form>
</section> 
  <footer class="w-100 py-4 flex-shrink-0">
    <div class="container py-4">
        <div class="row gy-4 gx-5">
            <div class="col-lg-4 col-md-6">
                <h5 class="h1 text-white">Escola Atom.</h5>
                <p class="small text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>
                <p class="small text-muted mb-0">&copy; Copyrights. All rights reserved. <a class="text-primary" href="#">Bootstrapious.com</a></p>
            </div>
            <div class="col-lg-2 col-md-6">
                <h5 class="text-white mb-3">Quick links</h5>
                <ul class="list-unstyled text-muted">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Get started</a></li>
                    <li><a href="#">FAQ</a></li>
                </ul>
            </div>
            <div class="col-lg-2 col-md-6">
                <h5 class="text-white mb-3">Quick links</h5>
                <ul class="list-unstyled text-muted">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Get started</a></li>
                    <li><a href="#">FAQ</a></li>
                </ul>
            </div>
            <div class="col-lg-4 col-md-6">
                <h5 class="text-white mb-3">Newsletter</h5>
                <p class="small text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>
                <form action="#">
                    <div class="input-group mb-3">
                        <input class="form-control" type="text" placeholder="Recipient's username" aria-label="Recipient's username" aria-describedby="button-addon2">
                        <button class="btn btn-primary" id="button-addon2" type="button"><i class="fas fa-paper-plane"></i></button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</footer>
</body>
    
  
</html>