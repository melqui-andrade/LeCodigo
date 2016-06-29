<div style="padding-top: 5%; margin-top: 25%;">
	<a href="/LeCodigo-presentation/home/login.html"
		data-original-title="Realizar login" type="button"
		class="btn btn-info btn-block btn-lg" data-toggle="tooltip"
		data-placement="top" title=""><span>Login</span></a> <br> <a
		href="/LeCodigo-presentation/home/instrucoes.html"
		data-original-title="Visualizar as instruções do jogo" type="button"
		class="btn btn-info  btn-block btn-lg" data-toggle="tooltip"
		data-placement="top" title=""><span>Instruções</span></a> <br> <a
		href="/LeCodigo-presentation/home/ranking.html"
		data-original-title="Visualizar o Ranking do jogo" type="button"
		class="btn btn-info  btn-block btn-lg" data-toggle="tooltip"
		data-placement="top" title=""><span>Ranking</span></a> <br>
</div>

<script>
	document.getElementById("botaoVoltar").innerHTML = "";
	document.getElementById("botaoSair").innerHTML = "";
	function voltar() {
		window.setTimeout(
				"location.href='/LeCodigo-presentation/home/login.html'", 500);
	}
</script>