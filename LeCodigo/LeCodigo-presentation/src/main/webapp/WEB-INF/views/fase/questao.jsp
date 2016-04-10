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

			<div class="panel-body" style="border-color: #fff;">
				${questao.descricao}</div>
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
						<c:forEach var="bloco" varStatus="status"
							items="${questao.blocos}">
							<div class="" style="text-align: left;">
								<a id="${bloco.id}" class="list-group-item "
									onclick="adicionarOpcaoSelecionada(${bloco.id},'${bloco.descricao}')">
									${bloco.descricao} </a>
							</div>
						</c:forEach>
					</div>
					<br>					
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
						<div id="divResposta">
						
						</div>
						<br>
					</div>
					<div class="col-md-4">fim</div>
					<div class="col-md-4">
						<button class="btn btn-danger btn-block" onclick="limparReposta()">Limpar Código</button>
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