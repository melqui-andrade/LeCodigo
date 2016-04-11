var contador = 999;

function adicionarOpcaoSelecionada(id, descricao) {
	var opcao = "<a id='" + id + "' class='list-group-item' name='" + contador
			+ "' onclick='removerLinhaResposta(" + contador + ")'> "
			+ descricao + " </a>";
	var div = "divResposta";
	var elemento = document.getElementById(div).innerHTML += opcao;
	contador++;
}

function removerOpcaoResposta(id) {
	var div = "divResposta";
	var elemento = document.getElementById(id).remove();
}

function limparReposta() {
	var div = "divResposta";
	var elemento = document.getElementById(div).innerHTML = null;
}

function removerLinhaResposta(idName) {
	var div = "divResposta";
	var divPai = document.getElementById(div);
	document.getElementsByName(idName).id = idName;
	var divFilho = document.getElementById(idName);
	return (elem=document.getElementById(idName)).parentNode.removeChild(elem);
	//divPai.removeChild(divFilho);

}

function enviarResposta() {
	var div = "divResposta";
	var divResposta = document.getElementById(div);
	var resposta = "";
	var quantidadeDeFilhosDaDiv = divResposta.childElementCount;
	for (var i = 0; i < quantidadeDeFilhosDaDiv; i++) {
		if (i == quantidadeDeFilhosDaDiv - 1) {
			resposta += divResposta.children[i].id;
		} else {
			resposta += divResposta.children[i].id + "-";
		}
	}
	window.location = "questao.html?resposta=" + resposta;

	alert(resposta);
}

(function() {

})();