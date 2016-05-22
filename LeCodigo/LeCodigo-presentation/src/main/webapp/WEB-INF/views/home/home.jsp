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


	<div class="col-md-12 container ">
		<div class="row">
			<h1 style="text-align: center">LeCódigo</h1>
			<h2 style="text-align: center"></h2>
			<br>
			<div class="row">
				<div class="col-md-4">&nbsp;</div>
				<div class="col-md-4" style="background-color: #eee; padding: 2%;">
					<a href="/LeCodigo-presentation/home/login.html"
						data-original-title="Realizar login"
						type="button" class="btn btn-info btn-block btn-lg"
						data-toggle="tooltip" data-placement="left" title=""><span>Login</span></a>
					<br> <a href="/LeCodigo-presentation/home/instrucoes.html"
						data-original-title="Visualizar as instruções do jogo"
						type="button" class="btn btn-info  btn-block btn-lg"
						data-toggle="tooltip" data-placement="left" title=""><span>Instruções</span></a>

					<br> <a href="/LeCodigo-presentation/home/ranking.html"
						data-original-title="Visualizar o Ranking do jogo"
						type="button" class="btn btn-info  btn-block btn-lg"
						data-toggle="tooltip" data-placement="left" title=""><span>Ranking</span></a>
					<br>
				</div>
				<div class="col-md-4">&nbsp;</div>
			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>


</body>

</html>