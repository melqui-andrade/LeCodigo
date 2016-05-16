<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/home.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />

<style rel="stylesheet">
body {
	background: url("../images/background/background2.png") no-repeat center
		top fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>


<html>
<body>


	<div class="col-md-12 container">
		<div class="row">
			<h1 style="text-align: center">
				Le<br> Código
			</h1>
			<h2 style="text-align: center">Bem vindo, Professor</h2>
		</div>
		<div class="col-md-4">&nbsp;</div>
		<div class="col-md-4" style="background-color: #eee; padding: 2%;">
			<a href="/LeCodigo-presentation/fase/transicaoFase.html"
				data-original-title="Clique neste botão e irá iniciar o jogo"
				type="button" class="btn btn-info btn-block btn-lg"
				data-toggle="tooltip" data-placement="left" title=""><span>Jogar</span></a>
			<br> <a href="/LeCodigo-presentation/home/cadastrar.html"
				data-original-title="Clique neste botão e irá cadastrar novos usuários"
				type="button" class="btn btn-info  btn-block btn-lg"
				data-toggle="tooltip" data-placement="left" title=""><span>Cadastrar</span></a>
			<br> <a href="/LeCodigo-presentation/home/ranking.html"
				data-original-title="Clique neste botão e irá visualizar o Ranking do jogo"
				type="button" class="btn btn-info  btn-block btn-lg"
				data-toggle="tooltip" data-placement="left" title=""><span>Relatório</span></a>
			<br> <a href="/LeCodigo-presentation/home/home.html"
				data-original-title="Clique neste botão para sair do jogo"
				type="button" class="btn btn-info  btn-block btn-lg"
				data-toggle="tooltip" data-placement="left" title=""><span>Sair</span></a>
			<br>
		</div>
		<div class="col-md-4">&nbsp;</div>
	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>


</body>

</html>