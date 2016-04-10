function adicionarOpcaoSelecionada(id, descricao) {
	var opcao = "<a id='" + id + "' class='list-group-item' > " + descricao
			+ " </a>";
	var div = "divResposta";
	var elemento = document.getElementById(div).innerHTML += opcao;
}

function removerOpcaoResposta(id) {
	var div = "divResposta";
	var elemento = document.getElementById(id).remove();
}

function limparReposta() {
	var div = "divResposta";
	var elemento = document.getElementById(div).innerHTML = null;
}

(function() {	
	var panelResposta = document.getElementById("panelResposta");
	var panelOpcoes = document.getElementById("panelOpcoes").style.width = panelResposta.style.width;

})();