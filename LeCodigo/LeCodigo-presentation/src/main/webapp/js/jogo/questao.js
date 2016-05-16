var contador = 999;
var resposta = "";
var respostaEnunciado = "";

function adicionarOpcaoSelecionada(id, descricao) {
	var opcao = "<a id='" + contador + "' class='panel-terminal mouse_mao' name='" + id
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
	piscarEt();
	var div = "divResposta";
	var elemento = document.getElementById(div).innerHTML = null;

}

function removerLinhaResposta(idName) {
	var div = "divResposta";
	var node = document.getElementById(idName);
	if (node.parentNode) {
	  node.parentNode.removeChild(node);
	}
	

}

function enviarResposta() {
	var div = "divResposta";
	var divResposta = document.getElementById(div);
	var quantidadeDeFilhosDaDiv = divResposta.childElementCount;
	resposta="";
	respostaEnunciado="";
	for (var i = 0; i < quantidadeDeFilhosDaDiv; i++) {
		if (i == quantidadeDeFilhosDaDiv - 1) {
			resposta += divResposta.children[i].name;
			
		} else {
			resposta += divResposta.children[i].name + "-";
		}
		respostaEnunciado+=divResposta.children[i].innerText +"<br>";
	}
	if (resposta != "") {
		document.getElementById("modalFooter").innerHTML ="";
		document.getElementById("modalFooter").innerHTML +="<button type='button' class='btn btn-info'"+ "data-dismiss='modal'"+"'>Voltar</button>";		
		document.getElementById("modalFooter").innerHTML +="<button type='button' class='btn btn-primary' onclick='confirmarResposta()' id='btnConfirmar'>Enviar</button>";
		document.getElementById("modalMensagem").innerHTML ="";
		document.getElementById("modalTitulo").innerHTML = "Olá terráqueo...";
		document.getElementById("modalMensagem").innerHTML = "Deseja enviar esta resposta?<br><br>";
		document.getElementById("modalMensagem").innerHTML += respostaEnunciado;
		document.getElementById("et_status").src = "../images/et/et_verde_pensativo.png";
		
		
	} else {
		document.getElementById("modalFooter").innerHTML ="";
		document.getElementById("modalFooter").innerHTML +="<button type='button' class='btn btn-info'"+ "data-dismiss='modal'"+"'>Voltar</button>";		
		document.getElementById("modalTitulo").innerHTML = "Owww terráqueo...";
		document.getElementById("modalMensagem").innerHTML = "Você não informou a resposta<br>Selecione os blocos para montar sua resposta :)";
		document.getElementById("et_status").src = "../images/et/et_verde_triste.png";
		resposta="";
	}
	

}

function feedbackQuestaoErrada(){
	document.getElementById("modalFooter").innerHTML ="";
	document.getElementById("modalFooter").innerHTML +="<button type='button' class='btn btn-info'"+ "data-dismiss='modal'"+"'>Voltar</button>";		
	document.getElementById("modalTitulo").innerHTML = "Owww terráqueo...";
	document.getElementById("modalMensagem").innerHTML = "Infelizmente você errou a questão, reveja seu código, você pode encontrar a solução ! :)";
	document.getElementById("et_status").src = "../images/et/et_verde_triste.png";
	$('#myModal').modal('toggle');
	resposta="";
}

function feedbackQuestaoCerta(){
	document.getElementById("modalFooter").innerHTML ="";
	document.getElementById("modalFooter").innerHTML +="<button type='button' class='btn btn-success' onclick='proximaEtapa()'"+"'>Ok</button>";		
	document.getElementById("modalTitulo").innerHTML = "Parabéns terráqueo ! :D";
	document.getElementById("modalMensagem").innerHTML = "Você acertou a questão, está pronto para seguir para a próxima etapa :) :)";
	document.getElementById("et_status").src = "../images/et/et_verde_feliz.png";
	
	resposta="";
}

function confirmarResposta(){
	window.location = "questao.html?resposta=" + resposta;
	resposta="";
	
}

function proximaEtapa(){
	window.location = "fase.html";
	resposta="";
	
}

function btnVoltarModal(){
	$('#myModal').modal('hide');
}


function btnVoltarQuestaoOnClick(){
	window.location = "fase.html";
}


document.getElementById("opcoes").style.maxHeight = "320px"
document.getElementById("blocosOpcoes").style.maxHeight = "240px"
var opcoes = document.getElementById("opcoes").clientHeight + "px";
// var respostas = document.getElementById("respostas");

document.getElementById("respostas").style.height = opcoes;
document.getElementById("respostas").style.maxHeight = opcoes;
var respostas = document.getElementById("respostas").clientHeight;

opcoes = document.getElementById("blocosOpcoes").clientHeight + "px";
// var respostas = document.getElementById("respostas");

document.getElementById("divResposta").style.height = opcoes;
document.getElementById("divResposta").style.maxHeight = opcoes;




function piscarEt() {
	setTimeout(etNormal, 500);
	setTimeout(etPisca, 250);
	setTimeout(etNormal, 500);
}

function etNormal() {
	document.getElementById("et_").src = "../images/et/et_verde_normal.png";
}

function etPisca() {
	document.getElementById("et_").src = "../images/et/et_verde_pisca.png";
}

function pularQuestao() {
	document.getElementById("modalFooter").innerHTML ="";
	document.getElementById("modalFooter").innerHTML +="<button type='button' class='btn btn-info'"+ "data-dismiss='modal'"+"'>Voltar</button>";		
	document.getElementById("modalFooter").innerHTML +="<button type='button' class='btn btn-primary' onclick='confirmarPulo()' id='btnConfirmar'>Pular Questão</button>";
	document.getElementById("modalMensagem").innerHTML ="";
	document.getElementById("modalTitulo").innerHTML = "Olá terráqueo...";
	document.getElementById("modalMensagem").innerHTML = "Deseja pular essa questão?<br>Custo X bits<br<br>";
	document.getElementById("et_status").src = "../images/et/et_verde_pensativo.png";
}

function confirmarPulo(){
	window.location = "questao.html?resposta=pulou";
	resposta="";
}