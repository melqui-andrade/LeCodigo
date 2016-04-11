function adicionarOpcaoSelecionada(id, descricao) {

	var opcao = "<a id='"+id+"' class='list-group-item' > "+descricao+" </a>";
	var div = "divResposta";
	var elemento = document.getElementById(div).innerHTML += opcao;// = "<a id='"+id+"' class='list-group-item' > "+descricao+" </a>";
	

}

function limparReposta(){
	var div = "divResposta";
	var elemento = document.getElementById(div).innerHTML = null;
}