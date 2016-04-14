<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/questao.css" rel="stylesheet">

<html>
<body style="background-color: ${fase.colorBackground};">

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid" style="padding-top: 10px;">
			<div class="row" style="color: #eee; text-align: center;">
				<div class="col-xs-6 col-sm-3">
					<h5>Fase ${idFase} - Etapa ${etapa}</h5>
				</div>
				<div class="col-xs-6 col-sm-3">
					<h5>Bits: ${bits}</h5>
				</div>
				<div class="col-xs-6 col-sm-3">
					<h5>Pontuação: ${pontuacao}</h5>
				</div>
				<div class="col-xs-6 col-sm-3">
					<h5>
						Vida:
						<c:forEach begin="1" end="${vidas}" varStatus="loop">
							<i class="fa fa-heart"></i>
						</c:forEach>
						</h6>
				</div>

			</div>

		</div>
	</nav>

	<div class="container">
		<div class="margem-acima" id="page-top">
			<h3></h3>
			<hr>
		</div>

		<div class="panel panel-info">
			<div class="panel-body" style="border-color: #fff;">
				${questao.descricao}</div>
		</div>

		<div class="col-md-4">
			<div class="panel panel-default">
				<div class="panel-heading"
					style="background: #FAE6B3; color: #34495E;">Linhas de código
				</div>
				<div id="panelOpcoes" class="panel-body">
					<div class="title">
						Use as linhas de códigos abaixo para montar o algoritmo para a
						resposta. <br>
						<div class="panel-body-opcoes">
							<c:forEach var="bloco" varStatus="status"
								items="${questao.blocos}">

								<a id="${bloco.id_bloco}" class="list-group-item "
									onclick="adicionarOpcaoSelecionada(${bloco.id_bloco},'${bloco.descricao}',${bloco.id})">
									${bloco.descricao} </a>

							</c:forEach>
						</div>
					</div>
					<br>
				</div>
			</div>
		</div>

		<div class="col-md-8">
			<div class="panel panel-default">
				<div class="panel-heading"
					style="background: #eee; color: #34495E; padding: -1%;">
					Visualização do código</div>
				<div id="panelResposta" class="panel-body"
					style="background: #444; color: #fff;">

					<div class="col-md-4">início</div>
					<br>
					<div class="col-md-12">
						<div id="divResposta" class="panel-body-resposta"></div>
						<br>
					</div>
					<div class="col-md-4">fim</div>
					<div class="col-md-8">
						<button class="btn btn-danger btn-block" onclick="limparReposta()">Limpar
							Código</button>
						<br>
					</div>

				</div>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-md-4">
				<a class="btn btn-block btn-info " href="fase.html"><span>voltar</span></a>
			</div>
			<div class="col-md-8">
				<button class="btn btn-block btn-success" onclick="enviarResposta()">
					<span>Enviar Resposta</span>
				</button>
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