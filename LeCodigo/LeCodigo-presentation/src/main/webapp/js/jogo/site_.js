function btnCadastrarOnClick() {
 	document.getElementById("conteudoHome").style.display = 'none';
 	document.getElementById("conteudoDenuncieAnonimamente").style.display = 'none';

 	document.getElementById("conteudoCadastrar").style.display = 'initial';


}

function btnDenuncieAnonimamenteOnClick() {
 	document.getElementById("conteudoHome").style.display = 'none';
 	document.getElementById("conteudoCadastrar").style.display = 'none';


 	document.getElementById("conteudoDenuncieAnonimamente").style.display = 'initial';

}

function btnVoltarCadastrar() {
 	document.getElementById("conteudoHome").style.display = 'initial';
 	document.getElementById("conteudoCadastrar").style.display = 'none';

}

function btnVoltarDenuncieAnonimamente() {
 	document.getElementById("conteudoHome").style.display = 'initial';
 	document.getElementById("conteudoCadastrar").style.display = 'none';
 	 	document.getElementById("conteudoDenuncieAnonimamente").style.display = 'none';


}
