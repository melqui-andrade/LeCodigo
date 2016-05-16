<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/home.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />

<html>
<body style="background-color: #22214d;">


	<div class="col-md-12 container ">
		
	<div class="row">
			<h1 style="text-align: center">LeCódigo</h1>
			<h2 style="text-align: center">Ranking</h2>
			<br>
			<div class="row">
				<div class="col-md-2">

					<a href="/LeCodigo-presentation/home/home.html"
						data-original-title="Clique neste botão e irá iniciar o jogo"
						type="button" class="btn btn-primary btn-block "
						data-toggle="tooltip" data-placement="left" title=""><span>Voltar</span></a>
				</div>
			</div>
			<br>
			

		</div>


	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>


</body>

</html>