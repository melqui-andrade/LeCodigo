<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/home.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />

<html>
<body
	style="background-color: #22214d;">

	<div class="col-md-4">&nbsp;</div>
	<div class="col-md-4 container ">
		<div class="row">
			<h1>
				Le<br> Código
			</h1>
		</div>
		<div class="row">
			<a href="/LeCodigo-presentation/fase/transicaoFase.html"
				data-original-title="Clique neste botão e irá iniciar o jogo"
				type="button" class="btn btn-primary btn-block"
				data-toggle="tooltip" data-placement="left" title="">
				<p>Jogar</p>
			</a> <br>
		</div>
		<div class="row">
			<a href="#"
				data-original-title="Clique neste botão e irá visualizar as instruções do jogo"
				type="button" class="btn btn-primary btn-block"
				data-toggle="tooltip" data-placement="left" title="">
				<p>Instruções</p>
			</a> <br>
		</div>
		<div class="row">
			<a href="#"
				data-original-title="Clique neste botão e irá visualizar o Ranking do jogo"
				type="button" class="btn btn-primary btn-block"
				data-toggle="tooltip" data-placement="left" title="">
				<p>Ranking</p>
			</a> <br>
		</div>
		<div class="row">
			<a href="#"
				data-original-title="Clique neste botão para sair do jogo"
				type="button" class="btn btn-primary btn-block"
				data-toggle="tooltip" data-placement="left" title="">
				<p>Sair</p>
			</a> <br>
		</div>
	</div>
	<div class="col-md-4">&nbsp;</div>

	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>


</body>

</html>