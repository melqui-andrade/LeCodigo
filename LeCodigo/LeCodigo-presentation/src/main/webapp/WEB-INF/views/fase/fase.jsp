<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/fase1.css" rel="stylesheet">
<html>
<body style="background: ${fase.colorBackground}">

	<nav class="navbar navbar-inverse">
		<div class="container-fluid" style="padding-top: 10px;">

			<div class="row" style="color: #eee; text-align: center;">
				<div class="col-md-4">
					<h5>Bits: ${bits}</h5>
				</div>
				<div class="col-md-4">
					<h5>Pontuação: ${pontuacao}</h5>
				</div>
				<div class="col-md-4">
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

	<div class="col-md-4">&nbsp;</div>

	<div class="col-md-4">
		<div class="timeline">
			<dl>
				<c:forEach begin="1" end="${etapa}" varStatus="loop">
					<c:if test="${loop.index % 2 == 0}">
						<dd class="pos-right clearfix">
							<div class="circ "></div>
							<div class="time" style="color: #fff;"></div>
							<div class="events">
								<div class="pull-right">
									<img class="events-object img-rounded"
										src="../images/monster1_little.png">
								</div>
								<div class="events-body">
									<h4 class="events-heading">Etapa ${etapa - loop.index + 1}</h4>
									<p><!-- Enunciado da questao --></p>
									<c:if test="${etapa - loop.index + 1 < etapa}">
										<button class="btn btn-primary btn-block" disabled>
										<i class="fa fa-like" style="color: #fff"> </i>
										Parabéns acertou :)</button>
									</c:if>
									<c:if test="${etapa - loop.index + 1 >= etapa}">
										<a  href="questao.html?id="${etapa} >Responder</a>
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
										src="../images/monster1_little.png">
								</div>
								<div class="events-body">
									<h4 class="events-heading">Etapa ${etapa - loop.index + 1}</h4>
									<p><!-- Enunciado da questao --></p>
									<c:if test="${etapa - loop.index + 1 < etapa}">
										<button class="btn btn-primary btn-block" disabled>
										<i class="fa fa-like" style="color: #fff"> </i>
										Parabéns acertou :)</button>
									</c:if>
									<c:if test="${etapa - loop.index + 1 >= etapa}">
										<a href="questao.html?id=${etapa}" class="btn btn-primary btn-block">Responder</a>
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


	<div class="col-md-4">
		<div style="position: fixed; bottom: 0; right: 0; z-index: 999">
			<img src="${fase.imgMonstro}" class="img-responsive" />
		</div>
	</div>


	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>

	<script>
		(function() {
			document.body.style.background = " url('../images/background/grid.png')  repeat right top";

		})();
	</script>


</body>

</html>