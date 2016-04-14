<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/transicao.css" rel="stylesheet">
<html>
<body style="background-color: ${fase.colorBackground};">

	<div class="col-md-12 container conteudo-centralizado ">
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
		<div class="col-md-4">

			<img src="${fase.imgMonstro}" class="img-responsive" id="et_"
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

		function et_normal() {
			document.getElementById("et_").src = "../images/et/et_verde_normal.png";
			
		}

		function et_feliz() {
			document.getElementById("et_").src = "../images/et/et_verde_feliz.png";

		}
		setInterval(et_normal, 500);
		setInterval(et_feliz, 200);
		setInterval(et_normal, 500);

		window.setTimeout("location.href='fase.html'", 5000);
	</script>


</body>

</html>