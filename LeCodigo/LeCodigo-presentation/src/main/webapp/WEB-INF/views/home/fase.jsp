<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/fase1.css" rel="stylesheet">
<html>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid" style="padding-top: 10px;">

			<div class="row" style="color: #eee; text-align: center;">
				<div class="col-md-4">
					<h5>Bits: 0000</h5>
				</div>
				<div class="col-md-4">
					<h5>Pontuação: 0000</h5>
				</div>
				<div class="col-md-4">
					<h5>
						Vida:

						<i class="fa fa-heart"></i>
						 <i class="fa fa-heart"></i> 
						 <i class="fa fa-heart"></i>
					</h5>
				</div>

			</div>

		</div>
	</nav>

	<div class="col-md-4">&nbsp;</div>

	<div class="col-md-4">
		<div class="timeline">
			<dl>
				<dd class="pos-left clearfix">
					<div class="circ"></div>
					<div class="time" style="color: #fff;">Status: respondido ou
						a responder</div>
					<div class="events">
						<div class="pull-left">
							<img class="events-object img-rounded"
								src="../images/monster1_little.png">
						</div>
						<div class="events-body">
							<h4 class="events-heading">Etapa 5</h4>
							<p>Questão 5</p>
							<button class="btn btn-primary">Responder questão</button>
							<hr>
						</div>
					</div>
				</dd>

				<dd class="pos-right clearfix">
					<div class="circ"></div>
					<div class="time" style="color: #fff;">Status: respondido ou
						a responder</div>
					<div class="events">
						<div class="pull-left">
							<img class="events-object img-rounded"
								src="../images/monster1_little.png">
						</div>
						<div class="events-body">
							<h4 class="events-heading">Etapa 4</h4>
							<p>Questão 4</p>
							<button class="btn btn-primary">Responder questão</button>
							<hr>
						</div>
					</div>
				</dd>
				<dd class="pos-left clearfix">
					<div class="circ"></div>
					<div class="time" style="color: #fff;">Status: respondido ou
						a responder</div>
					<div class="events">
						<div class="pull-left">
							<img class="events-object img-rounded"
								src="../images/monster1_little.png">
						</div>
						<div class="events-body">
							<h4 class="events-heading">Etapa 3</h4>
							<p>Questão 3</p>
							<button class="btn btn-primary">Responder questão</button>
							<hr>
						</div>
					</div>
				</dd>
				<dd class="pos-right clearfix">
					<div class="circ"></div>
					<div class="time" style="color: #fff;">Status: respondido ou
						a responder</div>
					<div class="events">
						<div class="pull-left">
							<img class="events-object img-rounded"
								src="../images/monster1_little.png">
						</div>
						<div class="events-body">
							<h4 class="events-heading">Etapa 2</h4>
							<p>Questão 2</p>
							<button class="btn btn-primary">Responder questão</button>
							<hr>
						</div>
					</div>
				</dd>
				<dd class="pos-left clearfix">
					<div class="circ"></div>
					<div class="time" style="color: #fff;">Status: respondido ou
						a responder</div>
					<div class="events">
						<div class="pull-left">
							<img class="events-object img-rounded"
								src="../images/monster1_little.png">
						</div>
						<div class="events-body">
							<h4 class="events-heading">Etapa 1</h4>
							<p>Questão1</p>
							<button class="btn btn-primary">Responder questão</button>
							<hr>
						</div>
					</div>
				</dd>

			</dl>
		</div>
	</div>

	</div>

	<div class="col-md-4">
		<div style="position: fixed; bottom: 0; right: 0; z-index: 999">
			<img src="../images/monster1.png" class="img-responsive" />
		</div>
	</div>


	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>

	<script>
		(function() {
			document.body.style.background = "#F2BB82 url('../images/background/grid.png')  repeat right top";

		})();
	</script>


</body>

</html>