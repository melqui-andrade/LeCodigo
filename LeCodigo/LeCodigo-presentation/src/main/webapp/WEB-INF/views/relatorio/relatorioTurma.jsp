<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/home.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />

<style rel="stylesheet">
body {
	background: url("../images/background/background2.png") no-repeat center
		top fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}

.tab-content {
	border-color: #fff;
	border-style: solid;
	border-width: 2px;
}
</style>
<html>
<body>
	<div class="col-md-12 container ">
		<div class="row">
			<h1 style="text-align: center">LeCódigo</h1>
			<h2 style="text-align: center">Relatório Turma</h2>
			<br>
			<div class="row">
				<div class="col-md-2">

					<a href="relatorio.html"
						data-original-title="Clique neste botão e irá iniciar o jogo"
						type="button" class="btn btn-primary btn-block "
						style="text-align: left;" data-placement="left" title="">Voltar</a>
					<br>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="panel">
						<ul id="myTab1" class="nav nav-tabs nav-justified">
							<li class="active"><a href="#geral" data-toggle="tab">Geral</a></li>
							<li class=""><a href="#fase" data-toggle="tab">Fases</a></li>
							<li class=""><a href="#fase1" data-toggle="tab">Fase 1</a></li>
							<li class=""><a href="#fase2" data-toggle="tab">Fase 2</a></li>
							<li class=""><a href="#fase3" data-toggle="tab">Fase 3</a></li>

						</ul>
						<div id="myTabContent" class="tab-content">

							<div class="tab-pane fade active in" id="geral">
								<div class="row">
									<div class="col-md-12">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">Relação
												Acertos, Erros e Pulos das questões</div>
											<div class="panel-body" style="border-color: #fff;">

												<div class="col-md-4">&nbsp;</div>
												<div class="col-md-4">
													<canvas id="chartHistorico" width="100" height="100"></canvas>
												</div>
												<div class="col-md-4">&nbsp;</div>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="tab-pane fade" id="fase">

								<div class="row">
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												Fase 1<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartFase1" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												Fase 2<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartFase2" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												Fase 3<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartFase3" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="tab-pane fade" id="fase1">

								<div class="row">
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												Tipos e Atribuição de variaveis<br> Acertos, Erros e
												Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartTipoAtribuicao" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												if/else<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartIfElse" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												Switch/case<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartSwitchCase" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="tab-pane fade" id="fase2">

								<div class="row">
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												For<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartFor" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												While<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartWhile" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												do While<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartDoWhile" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="tab-pane fade" id="fase3">

								<div class="row">
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												Troca de variaveis<br> Acertos, Erros e Pulos das
												questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartTrocaDeVariaveis" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												Ordenação simples<br> Acertos, Erros e Pulos das
												questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartOrdenacao" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading"
												style="background: #FAE6B3; color: #34495E;">
												Funções<br> Acertos, Erros e Pulos das questões
											</div>
											<div class="panel-body" style="border-color: #fff;">
												<canvas id="chartFuncoes" width="100" height="100"></canvas>
											</div>
										</div>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="../js/jogo/relatorio.js"></script>

	<script language="javascript">
		// Dados GLOBAl
		var acertos = '${certo}';
		var erros = '${erro}';
		var pulos = '${pulo}';
		// DADOS DA FASE 1
		var acertosF1 = '${questoesCertasF1}';
		var errosF1 = '${questoesErradasF1}';
		var pulosF1 = '${questoesPulouF1}';
		// DADOS DA FASE 2
		var acertosF2 = '${questoesCertasF2}';
		var errosF2 = '${questoesErradasF2}';
		var pulosF2 = '${questoesPulouF2}';
		// DADOS DA FASE 3
		var acertosF3 = '${questoesCertasF3}';
		var errosF3 = '${questoesErradasF3}';
		var pulosF3 = '${questoesPulouF3}';

		// DADOS DA QUESTOES TIPO DE VARIAVEIS
		var acertosTiposVariaveis = '${tiposVariaveisCerto}';
		var errosTiposVariaveis = '${tiposVariaveisErrado}';
		var pulosTiposVariaveis = '${tiposVariaveisPulo}';
		
		// DADOS DA QUESTOES IF E ELSE 
		var acertosIF_ELSE = '${ifElseCerto}';
		var errosIF_ELSE = '${ifElseErrado}';
		var pulosIF_ELSE = '${ifElseErrado}';
		
		// DADOS DA QUESTOES SWITCH E CASE 
		var acertosSWITCH = '${switchCerto}';
		var errosSWITCH = '${switchErrado}';
		var pulosSWITCH = '${switchPulo}';
		// DADOS DA QUESTOES FOR 
		
		var acertosFOR = '${forCerto}';
		var errosFOR = '${forErrado}';
		var pulosFOR = '${forPulo}';
		
		// DADOS DA QUESTOES WHILE 
		var acertosWHILE = '${whileCerto}';
		var errosWHILE = '${whileErrado}';
		var pulosWHILE = '${whilePulo}';
		
		// DADOS DA QUESTOES DO WHILE 
		var acertosDO_WHILE = '${doWhileCerto}';
		var errosDO_WHILE = '${doWhileErrado}';
		var pulosDO_WHILE = '${doWhilePulo}';
		
		// DADOS DA QUESTOES TROCA DE VARIAVEIS 
		var acertosTROCA_VARIAVEIS = '${troca_variaveisCerto}';
		var errosTROCA_VARIAVEIS = '${troca_variaveisErrado}';
		var pulosTROCA_VARIAVEIS = '${troca_variaveisPulo}';
		
		// DADOS DA QUESTOES ORDENACAO SIMPLES 
		var acertosORDENACAO_SIMPLES = '${ordenacaoCerto}';
		var errosORDENACAO_SIMPLES = '${ordenacaoErrado}';
		var pulosORDENACAO_SIMPLES = '${ordenacaoPulo}';
		
		// DADOS DA QUESTOES FUNCOES 
		var acertosFUNCOES = '${funcoesCerto}';
		var errosFUNCOES = '${funcoesErrado}';
		var pulosFUNCOES = '${funcoesPulo}';

		// GERAL
		carregaVariaveisHistoricoGeral(acertos, erros, pulos);
		
		// RESUMO DAS FASES
		carregaVariaveisHistoricoF1(acertosF1, errosF1, pulosF1);
		carregaVariaveisHistoricoF2(acertosF2, errosF2, pulosF2);
		carregaVariaveisHistoricoF3(acertosF3, errosF3, pulosF3);

		// RESUMO DA FASE 1 
		carregaVariaveisHistorico_if_else(acertosIF_ELSE, errosIF_ELSE, pulosIF_ELSE);
		carregaVariaveisHistorico_tipo_atribuicao(acertosTiposVariaveis, errosTiposVariaveis, pulosTiposVariaveis);
		carregaVariaveisHistorico_switch_case(acertosSWITCH, errosSWITCH, pulosSWITCH);
		
		// RESUMO DA FASE 2
		carregaVariaveisHistorico_for(acertosFOR, errosFOR, pulosFOR);
		carregaVariaveisHistorico_while(acertosWHILE, errosWHILE, pulosWHILE);
		carregaVariaveisHistorico_do_While(acertosDO_WHILE, errosDO_WHILE,pulosDO_WHILE);
		
		// RESUMO DA FASE 3
		carregaVariaveisHistorico_troca_de_variaveis(acertosTROCA_VARIAVEIS, errosTROCA_VARIAVEIS, pulosTROCA_VARIAVEIS);
		carregaVariaveisHistorico_ordenacao(acertosORDENACAO_SIMPLES, errosORDENACAO_SIMPLES, pulosORDENACAO_SIMPLES);
		carregaVariaveisHistorico_funcoes(acertosFUNCOES, errosFUNCOES,	pulosFUNCOES);
	</script>

</body>

</html>