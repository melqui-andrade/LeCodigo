<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/questao.css" rel="stylesheet">

<html>
<body style="background-color: #22214d;" class="teste">

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid" style="padding-top: 10px;">

			<div class="row"
				style="color: #eee; text-align: center; font-size: 14px;">
				<div class="col-xs-6 col-sm-2">
					<span>Fase ${idFase} - Etapa ${etapa} </span>
				</div>
				<div class="col-xs-6 col-sm-3">
					<span>Bits: ${bits}</span>
				</div>
				<div class="col-xs-6 col-sm-3">
					<span>Pontuação: ${pontuacao}</span>
				</div>
				<div class="col-xs-6 col-sm-4">
					<span> Vida: <c:forEach begin="1" end="${vidas}"
							varStatus="loop">
							<span class="fa fa-heart"></span>
						</c:forEach> <c:if test="${vidas <3}">

							<c:forEach begin="1" end="${3-vidas}" varStatus="loop">
								<span class="fa fa-heart-o"></span>
							</c:forEach>

						</c:if> <a data-original-title="Comprar mais vidas" type="button"
						class="btn btn-success fa fa-btc" data-toggle="tooltip"
						data-placement="bottom" title=""></a>
						<a href="/LeCodigo-presentation/home/home.html"
					data-original-title="Sair do jogo"
					type="button" class="btn btn-info fa fa-sign-out  " data-toggle="tooltip"
					data-placement="bottom" title=""></a>
					</span>
				</div>
			</div>
		</div>
	</nav>

	<div class="margem">

		<div class="row">
			<div class="panel">
				<div class="panel-body" style="border-color: #fff;">
					${questao.descricao}</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading"
						style="background: #FAE6B3; color: #34495E;">Linhas de
						código</div>
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

			<div class="col-md-6" id="divOpcoes">
				<div class="panel panel-default">
					<div class="panel-heading"
						style="background: #eee; color: #34495E; padding: -1%;">
						Visualização do código</div>
					<div id="respostas" class="panel-body "
						style="background: #444; color: #fff;">


						início <br>

						<div class="col-md-12">
							<div id="divResposta" class="panel-body-resposta"></div>
							<br>
						</div>

						fim <br>


					</div>
				</div>
			</div>

			<div class="col-md-2" id="divET">
				<img src="../images/et/et_verde_normal.png" class="img-responsive" align="middle"
					id="et_" style="float: left;" />
			</div>
		</div>



		<div class="row"
			>
			<div class="col-md-2">
				<button class="btn btn-block btn-info "
					onclick="btnVoltarQuestaoOnClick()">
					<i class="fa fa-reply" aria-hidden="true"></i> Voltar
				</button>
			</div>

			<div class="col-md-2">
				<c:if test="${bits >= 2*idFase+1}">
					<button class="btn btn-block btn-info " onclick="pularQuestao()"
						data-toggle="modal" data-target="#myModal">
						<i class="fa fa-retweet" aria-hidden="true"></i> Pular
					</button>
				</c:if>

				<c:if test="${bits < 2*idFase+1}">
					<button class="btn btn-block btn-info " onclick="pularQuestao()"
						disabled data-toggle="modal" data-target="#myModal">
						<i class="fa fa-retweet" aria-hidden="true"></i> Pular
					</button>
				</c:if>
			</div>

			<div class="col-md-6">
				<button class="btn btn-block btn-success" onclick="enviarResposta()"
					data-toggle="modal" data-target="#myModal">
					<i class="fa fa-paper-plane" aria-hidden="true"></i> Enviar
					Resposta
				</button>
			</div>

			<div class="col-md-2">
				<button class="btn btn-danger btn-block" onclick="limparReposta()">
					<i class="fa fa-times" aria-hidden="true"></i> Limpar Código
				</button>
			</div>
		</div>

	</div>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="modalTitulo"></h4>
				</div>
				<div class="modal-body">
					<h6 id="modalMensagem"></h6>
					<img src="" class="img-responsive" align="middle" id="et_status"
						style="float: left;" /> <br>
				</div>
				<div id="modalFooter" class="modal-footer"></div>
			</div>
		</div>
	</div>



	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>

	<!-- QUESTAO -->
	<script src="../js/jogo/questao.js"></script>
	<script src="../js/jogo/fase.js"></script>

	<c:if test="${status_resposta == true}">
		<button onclick="feedbackQuestaoCerta()" data-toggle="modal"
			data-target="#myModal" id="status_true" style="display: none;"></button>
		<script>
			$('#status_true').click();			
			</script>
	</c:if>
	<c:if test="${status_resposta == false}">
		<button onclick="feedbackQuestaoErrada()" data-toggle="modal"
			data-target="#myModal" id="status_false" style="display: none;"></button>
		<script>
			$('#status_false').click();
		</script>
	</c:if>
</body>


</html>