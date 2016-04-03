<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="styles/jogo/jogo.css" rel="stylesheet">
<link href="../styles/jogo/fases/fase0.css" rel="stylesheet">
<html>
<body>



	<div class="center-form">
		<h1>
			Le<br> Código
		</h1>

		<button data-original-title="Clique neste botão e irá iniciar o jogo"
			type="button" class="btn btn-primary btn-block btn-large"
			data-toggle="tooltip" data-placement="left" title="">Jogar</button>
		<br>

		<button
			data-original-title="Clique neste botão e irá visualizar as instruções do jogo"
			type="button" class="btn btn-primary btn-block" data-toggle="tooltip"
			data-placement="left" title="">Instruções</button>
		<br>

		<button data-original-title="Clique neste botão para sair do jogo"
			type="button" class="btn btn-primary btn-block" data-toggle="tooltip"
			data-placement="left" title="">Sair</button>
		<br>

	</div>



	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>
	<script src="../js/jogo/jogo.js"></script>

</body>


</html>