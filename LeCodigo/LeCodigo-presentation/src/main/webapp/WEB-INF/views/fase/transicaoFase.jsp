<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/transicao.css" rel="stylesheet">
<html>
<body
	style="background-color: ${fase.colorBackground};">
	<div class="col-md-4">&nbsp;</div>
	<div class="col-md-4">
		<h1>
			Le<br> Código
		</h1>
		<p>
			Atribuição de váriaveis, tipos de variáveis,<br> estrutura de
			condição (if-else, Switch-case)
		</p>
		<h4>
			Fase <span class="numeroDaFase">${idFase}</span>
		</h4>
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
			
		window.setTimeout("location.href='fase.html'",5000);
	</script>


</body>

</html>