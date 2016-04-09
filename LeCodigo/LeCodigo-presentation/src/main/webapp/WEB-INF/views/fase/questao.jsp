<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>


<link href="../styles/jogo/fases/questao.css" rel="stylesheet">
<html>
<body
	style="background-color: ${fase.colorBackground}; background-image: url('../images/background/grid.png');   background-repeat: repeat; background-position: right top; ">

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid" style="padding-top: 10px;">

			<div class="row"
				style="color: #eee; text-align: center; font-size: 14px;">
				<div class="col-xs-6 col-sm-4">
					<h5>Bits: ${bits}</h5>
				</div>
				<div class="col-xs-6 col-sm-4">
					<h5>Pontuação: ${pontuacao}</h5>
				</div>
				<div class="col-xs-6 col-sm-4">
					<h5>
						Vida:
						<c:forEach begin="1" end="${vidas}" varStatus="loop">
							<i class="fa fa-heart"></i>
						</c:forEach>
					</h5>
				</div>

			</div>

		</div>
	</nav>

	<div class="container">
		<div class="" id="page-top">
			<h3>ETAPA 1 - Questão 1</h3>
			<hr>

		</div>

		<div class="panel panel-info">

			<div class="panel-body" style="border-color: #fff;">Como
				deve-se verificar se um número qualquer é par ou impar? Organize
				blocos para estabelecer a ordem que considerar correta.</div>
		</div>


		<div class="col-md-4">
			<div class="panel panel-default">
				<div class="panel-heading" style="background: #FAE6B3; color: #fff;">
					<h6 class=" ">Linhas de código</h6>
				</div>
				<div class="panel-body panel-body-questao">
					<div class="title">
						Use as linhas de códigos abaixo para montar o algoritmo para a
						resposta. <br>
						<div class="selecter  multiple" tabindex="0">
							<select name="selecter_multiple"
								class="selecter_5 selecter-element" multiple="multiple"
								tabindex="-1">
								<option value="1">1-int numero; String resposta;</option>
								<option value="2">2-if(numero){</option>
								<option value="3">3-resposta = "O número é par";}</option>
								<option value="4">4-else{ resposta = "O número é
									impar";}</option>
								<option value="5">5-if(numero%3==0){</option>
								<option value="6">6-if(numero%2==0){</option>
							</select>
							<div class="selecter-options">
								<span class="selecter-item" data-value="1">1-int numero;
									String resposta;</span> <span class="selecter-item " data-value="2">2-if(numero){</span>
								<span class="selecter-item " data-value="3">3-resposta =
									"O número é par";}</span> <span class="selecter-item" data-value="4">4-else{
									resposta = "O número é impar";}</span> <span class="selecter-item"
									data-value="5">5-if(numero%3==0){</span> <span
									class="selecter-item" data-value="6">6-if(numero%2==0){</span>
							</div>
						</div>
					</div>
					<br>

					<div class="col-md-12" style="text-align: center;">

						<button class="btn btn-block btn-primary">Adicionar</button>
					</div>
				</div>


			</div>

		</div>

		<div class="col-md-8">
			<div class="panel panel-default">
				<div class="panel-heading"
					style="background: #eee; color: #fff; padding: -1%;">
					<h6 class="">Visualização do código</h6>

				</div>
				<div class="panel-body panel-body-questao"
					style="background: #444; color: #fff;">
					Algoritmo: Par ou Impar? <br> <br> início <br>
					<div class="col-md-12">
						<div class="" style="text-align: left;">
							<a href="#" class="list-group-item ">int numero; String
								resposta; </a> <a href="#" class="list-group-item ">if(numero%2==0){
							</a> <a href="#" class="list-group-item ">resposta = "O número é
								par";} </a> <a href="#" class="list-group-item ">else{ resposta
								= "O número é impar";} </a>
						</div>

						<br>
					</div>
					<div class="col-md-4">fim</div>
					<div class="col-md-4">
						<button class="btn btn-danger btn-block">Limpar Código</button>
						<br>
					</div>
					<div class="col-md-4">
						<button class="btn btn-block btn-warning">Remover Linha</button>
						<br>
					</div>
				</div>
			</div>
			<div class="row">
				<button class="btn btn-block btn-success btn-large">
					<h5>Enviar Resposta</h5>
				</button>
				<br>
			</div>
		</div>

	</div>



	<div class="col-xs-6 col-sm-4">
		<div class=".col-sm-5 .col-sm-offset-2 .col-md-6 .col-md-offset-0">
			<img src="${fase.imgMonstro}" class="img-responsive" align="middle"
				style="float: left;" />
		</div>
	</div>


	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>




</body>

</html>