<%@ include file="/WEB-INF/views/includeTags.jsp"%>
<link href="../styles/questao.css" rel="stylesheet">

<div style="padding-bottom: 3%; padding-top: 3%;">
	<div class="panel">
		<div class="panel-body" style="border-color: #fff;">
			${questao.descricao}</div>
	</div>

	<div class="row">
		<div class="col-xs-12 col-sm-6">
			<div class="panel ">
				<div class="panel-heading fundo-amarelo cor-preto">Linhas de
					código</div>
				<div id="opcoes" class="panel-body">
					<div class="title">
						Use as linhas de códigos abaixo para montar o algoritmo para a
						resposta. <br>
						<div id="blocosOpcoes" class="panel-body-opcoes">
							<c:forEach var="bloco" varStatus="status"
								items="${questao.blocos}">

								<a id="${bloco.id_bloco}" class="list-group-item "
									onclick="adicionarOpcaoSelecionada(${bloco.id_bloco})">
									${bloco.descricao} </a>



							</c:forEach>
						</div>
						<br>
					</div>
					<br>
				</div>
			</div>
		</div>

		<div class="col-xs-12 col-sm-6" id="divOpcoes">
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
	</div>

	<nav class="navbar navbar-inverse navbar-fixed-bottom">
		<div class="container-fluid"
			style="padding-top: 5px; padding-bottom: 5px;">
			<div class="row"
				style="color: #eee; text-align: center; font-size: 14px;">

				<div class="col-xs-3 col-sm-3">
					<h4 class="texto-negrito cor-branco"
						data-original-title="Comprar mais vidas" data-toggle="tooltip"
						data-placement="top" title="">
						<c:if test="${bits >= 2*idFase+1 && vidas < 3}">
							<a class="cor-info" onclick="comprarVida()" data-toggle="modal"
								data-target="#modalAviso"> <i class="fa fa-btc"
								aria-hidden="true"></i>
							</a>
						</c:if>
						<c:if test="${!(bits >= 2*idFase+1 && vidas < 3)}">
							<a class="cor-disable fa fa-btc"> </a>
						</c:if>
					</h4>
				</div>

				<div class="col-xs-3 col-sm-3">
					<h4 class="texto-negrito cor-branco"
						data-original-title="Pular Questão" data-toggle="tooltip"
						data-placement="top" title="">
						<c:if test="${bits >= 2*idFase+1}">
							<a class="cor-warning" onclick="pularQuestao()"
								data-toggle="modal" data-target="#modalAviso"> <i
								class="fa fa-retweet" aria-hidden="true"></i>
							</a>
						</c:if>
						<c:if test="${bits < 2*idFase+1}">
							<a class="cor-disable fa fa-retweet"> </a>
						</c:if>
					</h4>
				</div>
				<div class="col-xs-3 col-sm-3">
					<h4 class="texto-negrito cor-branco"
						data-original-title="Enviar Resposta" data-toggle="tooltip"
						data-placement="top" title="">
						<a class="cor-success" onclick="enviarResposta()"
							data-toggle="modal" data-target="#modalAviso"> <i
							class="fa fa-paper-plane" aria-hidden="true"></i>
						</a>
					</h4>
				</div>

				<div class="col-xs-3 col-sm-3">
					<h4 class="texto-negrito cor-branco"
						data-original-title="Limpar Código" data-toggle="tooltip"
						data-placement="top" title="">
						<a class="cor-danger" onclick="limparReposta()"> <i
							class="fa fa-times" aria-hidden="true"></i>
						</a>
					</h4>
				</div>

			</div>
		</div>
	</nav>
	<!-- Modal -->
	<div class="modal fade" id="modalAviso" tabindex="-1" role="dialog"
		aria-labelledby="modalAvisoLabel">
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

					<div class="col-xs-4 col-sm-4">
						<img src="" class="img-responsive" align="middle" id="et_status"
							style="float: left;" /> <br>
					</div>
					<div class="col-xs-8 col-sm-8">
						<h6 id="modalMensagem"></h6>
					</div>
				</div>
				<div id="modalFooter" class="modal-footer"></div>
			</div>
		</div>
	</div>
	
	<!-- QUESTAO -->
	<script src="../js/questao.js"></script>

	<c:if test="${status_resposta == true}">
		<button onclick="feedbackQuestaoCerta()" data-toggle="modal"
			data-target="#modalAviso" id="status_true" style="display: none;"></button>
		<script>
			$('#status_true').click();			
			</script>
	</c:if>
	<c:if test="${status_resposta == false}">
		<button onclick="feedbackQuestaoErrada()" data-toggle="modal"
			data-target="#modalAviso" id="status_false" style="display: none;"></button>
		<script>
			$('#status_false').click();
		</script>
	</c:if>

</div>
<script>
function voltar() {
	window.setTimeout("location.href='/LeCodigo-presentation/fase/fase.html'",
			500);
}
function sair() {
	window.setTimeout(
			"location.href='/LeCodigo-presentation/home/home.html'", 500);
}
</script>