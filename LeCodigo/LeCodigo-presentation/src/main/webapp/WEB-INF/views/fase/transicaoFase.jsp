<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/fase1.css" rel="stylesheet">
<html>
<body
	style="background: url('../images/background/background2.png') fixed no-repeat;  background-size: 100% 100%; -webkit-background-size: 100% 100%; -o-background-size: 100% 100%; -khtml-background-size: 100% 100%; -moz-background-size: 100% 100%;">

	<div class="col-md-4">&nbsp;</div>

	<div class="col-md-4">
		<h1>
			Le<br> Código
		</h1>

		<h2>
			Atribuição de váriaveis, tipos de variáveis,<br> estrutura de
			condição (if-else, Switch-case)
		</h2>

		<h3>
			Fase <span class="numeroDaFase">${idFase}</span>
		</h3>
	</div>

	<div class="col-md-4">
		<div style="position: fixed; bottom: 0; right: 0; z-index: 999">
			<img src="${fase.imgMonstro}" class="img-responsive" align="middle"
				style="float: left;" />
		</div>
	</div>


	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div class="scroll-top page-scroll visible-xs visble-sm">
		<a class="btn btn-primary" href="#page-top"><i
			class="fa fa-chevron-up"></i></a>
	</div>

	<script>
		//TODO: DEPOIS QUE TIRAR O BOTAO TEMPORAIO POE TIRAR ESSA FUNCAO
		
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
			
		window.setTimeout("location.href='fase.html'",1000);
	</script>


</body>

</html>