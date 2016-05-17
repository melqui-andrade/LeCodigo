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
			<h2 style="text-align: center">Oww Terráqueo..</h2>
			<br>
			<div class="row">
				<div class="col-md-2">

					<a href="/LeCodigo-presentation/home/home.html"
						data-original-title="Clique neste botão e irá iniciar o jogo"
						type="button" class="btn btn-primary btn-block "
						data-toggle="tooltip" data-placement="left" title=""><span>Sair</span></a>
				</div>
			</div>
			<br>

			<div class="panel panel-info col-md-8" style="padding: 6%;">
				<!-- Default panel contents -->
				
					<p>
						Você perdeu.. :(
						Mas você pode começar novamente <br> Continue a
						exercitar questões, use a criatividade 
					</p>

				
			
			</div>
				<div class="col-md-4" >
					<img src="../images/et/et_verde_triste.png" class="img-responsive"
					  />
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