<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/home.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />

<html>
<body style="background-color: #22214d;">


	<div class="col-md-12 container conteudo-centralizado ">
		<div class="row">
			<h1>
				LeCódigo - Relatório
			</h1>
		</div>

		<a href="/LeCodigo-presentation/relatorio/relatorioAluno.html"
			data-original-title="Clique neste botão e irá iniciar o jogo"
			type="button" class="btn btn-primary btn-block btn-lg"
			data-toggle="tooltip" data-placement="left" title=""><span>Aluno</span></a>
		<br> <a href="/LeCodigo-presentation/relatorio/relatorioTurma.html"
			data-original-title="Clique neste botão e irá visualizar as instruções do jogo"
			type="button" class="btn btn-primary btn-block btn-lg"
			data-toggle="tooltip" data-placement="left" title=""><span>Turma</span></a>
		
		<br> <a href="#"
			data-original-title="Clique neste botão para sair do jogo"
			type="button" class="btn btn-primary btn-block btn-lg"
			data-toggle="tooltip" data-placement="left" title=""><span>Sair</span></a>
		<br>
	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>


</body>

</html>