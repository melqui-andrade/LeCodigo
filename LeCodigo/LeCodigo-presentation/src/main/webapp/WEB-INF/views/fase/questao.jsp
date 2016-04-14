<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/questao.css" rel="stylesheet">

<html>
<body style="background-color: ${fase.colorBackground};" class="teste">

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid" style="padding-top: 10px;">

			<div class="row"
				style="color: #eee; text-align: center; font-size: 14px;">
				<div class="col-xs-6 col-sm-3">
					<span>Fase ${idFase} - Etapa ${etapa} </span>
				</div>
				<div class="col-xs-6 col-sm-3">
					<span>Bits: ${bits}</span>
				</div>
				<div class="col-xs-6 col-sm-3">
					<span>Pontuação: ${pontuacao}</span>
				</div>
				<div class="col-xs-6 col-sm-3">
					<span> Vida: <c:forEach begin="1" end="${vidas}"
							varStatus="loop">
							<i class="fa fa-heart"></i>
						</c:forEach>
					</span>
				</div>
			</div>
		</div>
	</nav>

	<div class="margem">

		<div class="panel panel-info">
			<div class="panel-body" style="border-color: #fff;">
				${questao.descricao}</div>
		</div>

		<div class="col-md-4">
			<div class="panel panel-default">
				<div class="panel-heading"
					style="background: #FAE6B3; color: #34495E;">Linhas de código
				</div>
				<div id="opcoes" class="panel-body">
					<div class="title">
						Use as linhas de códigos abaixo para montar o algoritmo para a
						resposta. <br>
						<div id="blocosOpcoes" class="panel-body-opcoes">
							<c:forEach var="bloco" varStatus="status"
								items="${questao.blocos}">

								<a id="${bloco.id_bloco}" class="list-group-item "
									onclick="adicionarOpcaoSelecionada(${bloco.id_bloco},'${bloco.descricao}',${bloco.id})">
									${bloco.descricao} </a>

							</c:forEach>
						</div>
						<br>
					</div>
					<br>
				</div>
			</div>
		</div>

		<div class="col-md-6">
			<div class="panel panel-default">
				<div class="panel-heading"
					style="background: #eee; color: #34495E; padding: -1%;">
					Visualização do código</div>
				<div id="respostas" class="panel-body "
					style="background: #444; color: #fff;" onload="ajustarTamanho()">


					início <br>

					<div class="col-md-12">
						<div id="divResposta" class="panel-body-resposta"></div>
						<br>
					</div>

					fim <br>


				</div>
			</div>
		</div>
		<div class="col-md-2">
			<div class=".col-sm-5 .col-sm-offset-2 .col-md-6 .col-md-offset-0">
				<img src="${fase.imgMonstro}" class="img-responsive" align="middle" id="et_"
					style="float: left;" />
			</div>

			<button class="btn btn-danger btn-block" onclick="limparReposta()">Limpar
				Código</button>
			<br>

		</div>

		<br>
		<div class="row">
			<div class="col-md-4">
				<a class="btn btn-block btn-info " href="fase.html"><span>voltar</span></a>
			</div>
			<br>
			<div class="col-md-6">
				<button class="btn btn-block btn-success" onclick="enviarResposta()">
					<span>Enviar Resposta</span>
				</button>
			</div>
		</div>
	</div>

	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>

	<!-- QUESTAO -->
	<script src="../js/questao.js"></script>
</body>

</html>