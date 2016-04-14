<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/fase.css" rel="stylesheet">
<html>
<body style="background-color: ${fase.colorBackground};">

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid" style="padding-top: 10px;">
			<div class="row"
				style="color: #eee; text-align: center; font-size: 14px;">
				<div class="col-xs-6 col-sm-3">
					<span>Fase ${idFase}</span>
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
						</c:forEach> <a data-original-title="Comprar mais vidas"
						type="button" class="btn btn-success fa fa-money"
						data-toggle="tooltip" data-placement="bottom" title=""></a>
					</span> <br>
				</div>
			</div>
		</div>
	</nav>

	<div class="col-md-12 container conteudo-centralizado ">
		<div class="timeline" id="page-top">
			<dl>
				<c:forEach begin="1" end="${etapa}" varStatus="loop">
					<c:if test="${loop.index % 2 == 0}">
						<dd class="pos-right clearfix">
							<div class="circ "></div>
							<div class="time" style="color: #fff;"></div>
							<div class="events">
								<div class="pull-left">
									<img class="events-object img-rounded"
										src="${fase.imgPerfilMonstro}">
								</div>
								<div class="events-body">
									<h4 class="events-heading">Etapa ${etapa - loop.index + 1}</h4>
									<p>${ enumQuestao }</p>
									<c:if test="${etapa - loop.index + 1 < etapa}">
										<button class="btn btn-primary btn-block" disabled
											style="color: #000">
											<i class="fa fa-3x fa-check" style="color: #23A566"> </i> <br>
											Parabéns acertou :)
										</button>
									</c:if>
									<c:if test="${etapa - loop.index + 1 >= etapa}">
										<a href="questao.html" class="btn btn-primary btn-block">Responder</a>
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
									<img class="events-object img-rounded"
										src="${fase.imgPerfilMonstro}">
								</div>
								<div class="events-body">
									<h4 class="events-heading">Etapa ${etapa - loop.index + 1}</h4>
									<p>${ enumQuestao }</p>
									<c:if test="${etapa - loop.index + 1 < etapa}">
										<button class="btn btn-primary btn-block" disabled
											style="color: #000">
											<i class="fa fa-3x fa-check" style="color: #23A566"> </i> <br>
											Parabéns acertou :)
										</button>
									</c:if>
									<c:if test="${etapa - loop.index + 1 >= etapa}">
										<a href="questao.html" class="btn btn-primary btn-block">Responder</a>
									</c:if>

									<hr>
								</div>
							</div>
						</dd>
					</c:if>
				</c:forEach>
			</dl>
		</div>
		<img src="${fase.imgMonstro}" class="img-responsive" align="middle"
			style="float: left;" />
	</div>



	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>

<script src="../js/jogo/fase.js"></script>

</body>

</html>