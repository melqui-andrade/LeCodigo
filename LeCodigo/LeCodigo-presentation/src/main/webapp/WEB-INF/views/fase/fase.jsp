<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>


<link href="../styles/jogo/fases/fase1.css" rel="stylesheet">
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

	<div class="col-md-4">&nbsp;</div>
	
	<div class="col-md-4">	
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
								<div class="events-body" style="width: 100px;">
									<h4 class="events-heading">Etapa ${etapa - loop.index + 1}</h4>
									<p>
										<!-- Enunciado da questao -->
									</p>
									<c:if test="${etapa - loop.index + 1 < etapa}">
										<button class="btn btn-primary btn-block" disabled>
											<i class="fa fa-like" style="color: #fff"> </i> Parabéns
											acertou :)
										</button>
									</c:if>
									<c:if test="${etapa - loop.index + 1 >= etapa}">
										<a href="questao.html?id=" ${etapa}>Responder</a>
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
								<div class="events-body"  style="width: 100px;">
									<h4 class="events-heading">Etapa ${etapa - loop.index + 1}</h4>
									<p>
										<!-- Enunciado da questao -->
									</p>
									<c:if test="${etapa - loop.index + 1 < etapa}">
										<button class="btn btn-primary btn-block" disabled>
											<i class="fa fa-like" style="color: #fff"> </i> Parabéns
											acertou :)
										</button>
									</c:if>
									<c:if test="${etapa - loop.index + 1 >= etapa}">
										<a href="questao.html?id=${etapa}"
											class="btn btn-primary btn-block">Responder</a>
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
		<img src="${fase.imgMonstro}" class="img-responsive" align="middle"
			style="float: left;" />
	</div>

	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>



</body>

</html>