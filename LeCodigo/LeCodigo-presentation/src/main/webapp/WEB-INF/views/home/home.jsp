<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/fase0.css" rel="stylesheet">
<html>
<body>

	<div class="col-md-4">&nbsp;</div>

	<div class="col-md-4">
		<h1>
			Le<br> Código
		</h1>

		<button data-original-title="Clique neste botão e irá iniciar o jogo"
			type="button" class="btn btn-primary btn-block btn-large"
			data-toggle="tooltip" data-placement="left" title="">
			<h5>Jogar</h5>
		</button>
		<br>

		<button
			data-original-title="Clique neste botão e irá visualizar as instruções do jogo"
			type="button" class="btn btn-primary btn-block" data-toggle="tooltip"
			data-placement="left" title="">
			<h5>Instruções</h5>
		</button>
		<br>

		<button
			data-original-title="Clique neste botão e irá visualizar as instruções do jogo"
			type="button" class="btn btn-primary btn-block" data-toggle="tooltip"
			data-placement="left" title="">
			<h5>Ranking</h5>
		</button>
		<br>

		<button data-original-title="Clique neste botão para sair do jogo"
			type="button" class="btn btn-primary btn-block" data-toggle="tooltip"
			data-placement="left" title="">
			<h5>Sair</h5>
		</button>
		<br>
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
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});

		(function() {
			document.body.style.background = "#47CEAC url('../images/background/grid.png')  repeat right top";

		})();
	</script>


</body>

</html>