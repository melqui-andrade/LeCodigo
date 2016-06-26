<div style="margin-top: 6%;">
	<h4 class="cor-branco texto-centralizado ">
		Fase <span class="numeroDaFase">${idFase}</span>
	</h4>
	<p class="texto-centralizado texto-light cor-branco">Atribuição de
		váriaveis, tipos de variáveis,estrutura de condição (if-else,
		Switch-case)</p>
	<img src="../images/et/et_verde_normal.png" class="img-responsive"
		id="et_" style="float: left;" />
</div>

<script>
	//TODO: DEPOIS QUE TIRAR O BOTAO TEMPORAIO POE TIRAR ESSA FUNCAO
	function et_normal() {
		document.getElementById("et_").src = "../images/et/et_verde_normal.png";
	}
	function et_feliz() {
		document.getElementById("et_").src = "../images/et/et_verde_feliz.png";
	}
	setInterval(et_normal, 500);
	setInterval(et_feliz, 200);
	setInterval(et_normal, 500);
	window.setTimeout("location.href='/LeCodigo-presentation/fase/fase.html'",
			5000);
	function voltar() {
		window.setTimeout(
				"location.href='/LeCodigo-presentation/home/login.html'", 500);
	}
</script>
