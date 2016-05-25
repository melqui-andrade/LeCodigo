<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/fase.css" rel="stylesheet">
<style rel="stylesheet">
body {
	background: url("../images/background/background.png") no-repeat center
		top fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>
<html>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid" style="padding-top: 10px;">
			<div class="row"
				style="color: #eee; text-align: center; font-size: 14px;">
				<div class="col-xs-6 col-sm-2 span-header">
				
					<span>Fase ${idFase}</span>
					<br>
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
							<i class="fa fa-heart"></i>
						</c:forEach> <c:if test="${vidas <3}">

							<c:forEach begin="1" end="${3-vidas}" varStatus="loop">
								<i class="fa fa-heart-o"></i>
							</c:forEach>

						</c:if> 
						
						<c:if test="${bits >= 2*idFase+1 && vidas < 3}">
							<a data-original-title="Comprar mais vidas" type="button" onclick="comprarVida()"
						data-toggle="modal" data-target="#myModal"
						class="btn btn-success fa fa-btc" data-toggle="tooltip"
						data-placement="bottom" title="">
						</a>
						</c:if>
						<c:if test="${!(bits >= 2*idFase+1 && vidas < 3)}">
							<a data-original-title="Comprar mais vidas" type="button" onclick="comprarVida()"
						disabled data-toggle="modal" data-target="#myModal"
						class="btn btn-success fa fa-btc" data-toggle="tooltip"
						data-placement="bottom" title="">
						</a>
						</c:if>
						
						<a href="/LeCodigo-presentation/home/home.html"
					data-original-title="Sair do jogo"
					type="button" class="btn btn-info fa fa-sign-out  " data-toggle="tooltip"
					data-placement="bottom" title=""></a>
					</span>
				</div>
			</div>
		</div>
	</nav>
	<div class="row container">

		<div id="div_timeline" class="row">
			<div class="col-md-2">
				&nbsp;
			</div>
			<div class="col-md-4">&nbsp;</div>
			<div class="col-md-6 container ">
				<div class="timeline" id="page-top">
					<dl>
						<c:forEach begin="1" end="${etapa}" varStatus="loop">
							<c:if test="${loop.index % 2 == 0}">
								<dd class="pos-right clearfix">
									<div class="circ "></div>
									<div class="time" style="color: #fff;"></div>
									<div class="events">
										<div class="pull-left">
											<c:if test="${etapa - loop.index + 1 < etapa}">
												<img class="events-object img-rounded"
													src="../images/et/et_verde_little_sumiu.png">
											</c:if>
											<c:if test="${etapa - loop.index + 1 >= etapa}">
												<img class="events-object img-rounded"
													src="../images/et/et_verde_normal.png">
											</c:if>
										</div>
										<div class="events-body">
											<h4 class="events-heading">Etapa ${etapa - loop.index + 1}</h4>
											<p>${ enumQuestao }</p>
											<c:if test="${etapa - loop.index + 1 < etapa}">
												<button class="btn btn-primary btn-block" disabled
													style="color: #000">
													<i class="fa fa-2x fa-check" style="color: #23A566"> </i>
													Parabéns acertou :)
												</button>
											</c:if>
											<c:if test="${etapa - loop.index + 1 >= etapa}">
												<a href="questao.html" class="btn btn-primary btn-block">
													<i class="fa fa-share" aria-hidden="true"></i> Responder
												</a>
											</c:if>
											<hr>
										</div>
									</div>
								</dd>
							</c:if>
							<c:if test="${loop.index % 2 != 0}">
								<dd class="pos-left clearfix">
									<div class="circ "></div>
									<div class="time" style="color: #fff;"></div>
									<div class="events">
										<div class="pull-left">
											<c:if test="${etapa - loop.index + 1 < etapa}">
												<img class="events-object img-rounded"
													src="../images/et/et_verde_little_sumiu.png">
											</c:if>
											<c:if test="${etapa - loop.index + 1 >= etapa}">
												<img class="events-object img-rounded"
													src="../images/et/et_verde_little.png">
											</c:if>
										</div>
										<div class="events-body">
											<h4 class="events-heading">Etapa ${etapa - loop.index + 1}</h4>
											<p>${ enumQuestao }</p>
											<c:if test="${etapa - loop.index + 1 < etapa}">
												<button class="btn btn-primary btn-block" disabled
													style="color: #000">
													<i class="fa fa-2x fa-check" style="color: #23A566"> </i>
													Parabéns acertou :)
												</button>
											</c:if>
											<c:if test="${etapa - loop.index + 1 >= etapa}">
												<a href="questao.html" class="btn btn-primary btn-block">
													<i class="fa fa-share" aria-hidden="true"></i> Responder
												</a>
											</c:if>

											<hr>
										</div>
									</div>
								</dd>
							</c:if>
						</c:forEach>
					</dl>
				</div>
			
			</div>
		</div>
	</div>


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

	<script src="../js/jogo/questao.js"></script>
	<script src="../js/jogo/fase.js"></script>

</body>

</html>