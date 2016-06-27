<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<div style="padding-bottom: 3%; padding-top: 1%;">
	<div id="div_timeline" class="row">
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
											<i class="fa fa-check" style="color: #23A566"> </i> <br>
											Parabéns acertou :)
										</button>
									</c:if>
									<c:if test="${etapa - loop.index + 1 >= etapa}">
										<a href="questao.html" class="btn btn-primary btn-block">
											<i class="fa fa-share" aria-hidden="true"></i> <br>
											Responder
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
											<i class="fa fa-check" style="color: #23A566"> </i> <br>
											Parabéns acertou :)
										</button>
									</c:if>
									<c:if test="${etapa - loop.index + 1 >= etapa}">
										<a href="questao.html" class="btn btn-primary btn-block">
											<i class="fa fa-share" aria-hidden="true"></i> <br>
											Responder
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
<script src="../js/questao.js"></script>
<script src="../js/fase.js"></script>

<script>
	function voltar() {
		window.setTimeout(
				"location.href='/LeCodigo-presentation/home/login.html'", 500);
	}
</script>