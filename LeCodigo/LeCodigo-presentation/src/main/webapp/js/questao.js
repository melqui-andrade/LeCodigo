var contador = 999;
var resposta = "";
var respostaEnunciado = "";

document.getElementById("opcoes").style.maxHeight = "320px"
document.getElementById("blocosOpcoes").style.maxHeight = "240px"
var opcoes = document.getElementById("opcoes").clientHeight + "px";

document.getElementById("respostas").style.height = opcoes;
document.getElementById("respostas").style.maxHeight = opcoes;
var respostas = document.getElementById("respostas").clientHeight;

opcoes = document.getElementById("blocosOpcoes").clientHeight + "px";

document.getElementById("divResposta").style.height = opcoes;
document.getElementById("divResposta").style.maxHeight = opcoes;

document.getElementById("blocosOpcoes").style.height = opcoes;
document.getElementById("blocosOpcoes").style.maxHeight = opcoes;

function adicionarOpcaoSelecionada(id, descricao) {
	var opcao = "<a id='" + contador
			+ "' class='panel-terminal mouse_mao' name='" + id
			+ "' onclick='removerLinhaResposta(" + contador + ")'> </a>";
	var div = "divResposta";
	document.getElementById(div).innerHTML += opcao;
	var descricao = document.getElementById(id).innerHTML;
	var opcao = document.getElementById(contador).innerHTML = (descricao.trim());
	document.getElementById(id).remove();
	contador++;
}

function removerOpcaoResposta(id) {
	document.getElementById(id).remove();
}

function limparReposta() {
	window.setTimeout("location.href='/LeCodigo-presentation/fase/questao.html'",
			500);
}

function removerLinhaResposta(idName) {
	var node = document.getElementById(idName);
	var descricao = ($.trim(node.innerHTML));
	var opcao = "<a id=" + node.name + " class='list-group-item'"
			+ " onclick='adicionarOpcaoSelecionada(" + node.name + ")'> </a>";
	var divOpcoes = "blocosOpcoes";
	document.getElementById(idName).remove();
	document.getElementById(divOpcoes).innerHTML += opcao;
	document.getElementById(node.name).innerHTML = descricao.trim();
}

var modalFooter = document.getElementById("modalFooter");
var modalMensagem = document.getElementById("modalMensagem");
var modalTitulo = document.getElementById("modalTitulo");
var et_status = document.getElementById("et_status");

function enviarResposta() {
	var div = "divResposta";
	var divResposta = document.getElementById(div);
	var quantidadeDeFilhosDaDiv = divResposta.childElementCount;
	resposta = "";
	respostaEnunciado = "";
	for (var i = 0; i < quantidadeDeFilhosDaDiv; i++) {
		if (i == quantidadeDeFilhosDaDiv - 1) {
			resposta += divResposta.children[i].name;

		} else {
			resposta += divResposta.children[i].name + "-";
		}
		respostaEnunciado += divResposta.children[i].innerText + "<br>";
	}
	if (resposta != "") {
		modalFooter.innerHTML = "<div class='row' id='footerModal'></div>";
		modalFooter.innerHTML += "<button type='button' class='btn btn-info'"
				+ "data-dismiss='modal'" + "'>Voltar</button>";
		modalFooter.innerHTML += "<button type='button' class='btn btn-primary' onclick='confirmarResposta()' id='btnConfirmar'>Enviar</button>";
		modalTitulo.innerHTML = "Olá terráqueo...";
		modalMensagem.innerHTML = "";
		modalMensagem.innerHTML = "Deseja enviar esta resposta?<br><br>";
		modalMensagem.innerHTML += respostaEnunciado;
		et_status.src = "../images/et/et_verde_pensativo.png";

	} else {
		modalFooter.innerHTML = "<div class='row' id='footerModal'></div>";
		modalFooter.innerHTML += "<button type='button' class='btn btn-info'"
				+ "data-dismiss='modal'" + "'>Voltar</button>";
		modalTitulo.innerHTML = "Owww terráqueo...";
		modalMensagem.innerHTML = "Você não informou a resposta<br>Selecione os blocos para montar sua resposta :)";
		et_status.src = "../images/et/et_verde_triste.png";
		resposta = "";
	}

}

function feedbackQuestaoErrada() {
	modalFooter.innerHTML = "<div class='row' id='footerModal'></div>";
	modalFooter.innerHTML += "<button type='button' class='btn btn-info'"
			+ "data-dismiss='modal'" + "'>Voltar</button>";
	modalTitulo.innerHTML = "Owww terráqueo...";
	modalMensagem.innerHTML = "Infelizmente você errou a questão, reveja seu código, você pode encontrar a solução ! :)";
	et_status.src = "../images/et/et_verde_triste.png";
	resposta = "";
}

function feedbackQuestaoCerta() {
	modalFooter.innerHTML = "<div class='row' id='footerModal'></div>";
	modalFooter.innerHTML += "<button type='button' class='btn btn-success' onclick='proximaEtapa()'"
			+ "'>Ok</button>";
	modalTitulo.innerHTML = "Parabéns terráqueo ! :D";
	modalMensagem.innerHTML = "Você acertou a questão, está pronto para seguir para a próxima etapa :) :)";
	et_status.src = "../images/et/et_verde_feliz.png";
	resposta = "";
}

function confirmarResposta() {
	window.location = "questao.html?resposta=" + resposta;
	resposta = "";
}

function proximaEtapa() {
	window.location = "fase.html";
	resposta = "";
}

function btnVoltarModal() {
	$('#modalAviso').modal('hide');
}

function pularQuestao() {
	modalFooter.innerHTML = "<div class='row' id='footerModal'></div>";
	modalFooter.innerHTML += "<button type='button' class='btn btn-info'"
			+ "data-dismiss='modal'" + "'>Voltar</button>";
	modalFooter.innerHTML += "<button type='button' class='btn btn-primary' onclick='confirmarPulo()' id='btnConfirmar'>Pular Questão</button>";
	modalTitulo.innerHTML = "Olá terráqueo...";
	modalMensagem.innerHTML = "";
	modalMensagem.innerHTML = "Deseja pular essa questão?<br>Custo X bits<br<br>";
	et_status.src = "../images/et/et_verde_pensativo.png";
}

function confirmarPulo() {
	window.location = "questao.html?resposta=pulou";
	resposta = "";
}

function comprarVida() {
	modalFooter.innerHTML = "<div class='row' id='footerModal'></div>";
	modalFooter.innerHTML += "<button type='button' class='btn btn-info'"
			+ "data-dismiss='modal'" + "'>Voltar</button>";
	modalFooter.innerHTML += "<button type='button' class='btn btn-primary' onclick='confirmarVida()' id='btnConfirmar'>Comprar Vida</span></button>";
	modalTitulo.innerHTML = "Olá terráqueo... Deseja comprar uma vida?";
	modalMensagem.innerHTML = "";
	modalMensagem.innerHTML = "</span><br<br>";
	et_status.src = "../images/et/et_verde_pensativo.png";
}

function confirmarVida() {
	window.location = "vida.html?";
	resposta = "";
}