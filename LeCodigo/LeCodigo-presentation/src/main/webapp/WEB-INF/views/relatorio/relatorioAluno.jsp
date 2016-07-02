<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<div style="margin-top: 3%;">
	<h4 class="cor-branco texto-centralizado ">Relatório dos alunos</h4>
	<div class="container">
		<div class="panel panel-info">

			<div class="panel-heading">Alunos</div>
			<!-- Table -->
			<table class="table">
				<thead>
					<tr style="text-aling: center">
						<th class="col-md-3">Id</th>
						<th class="col-md-6">Nome</th>
						<th class="col-md-3"></th>
					</tr>
				</thead>
				<c:forEach items="${lstJogador }" var="usuario">
					<tbody>
						<tr>
							<td class="col-md-3">${usuario.id }</td>
							<td class="col-md-6">${usuario.nome }</td>
							<td class="col-md-3">
								<button type="button" class="btn btn-primary btn-lg"
									data-toggle="modal" data-target="#relatorioAluno" onclick="getJogador'${usuario.id }')">Veja
									o relatório</button>
							</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
	</div>
</div>

<!-- Modal -->
<div class="modal fade" id="relatorioAluno" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" style="color: black;" id="myModalLabel">Relatório</h4>
			</div>
			<div class="modal-body">

				<div class="panel">

					<ul class="nav nav-tabs nav-justified">
						<li><a href="#geral" data-toggle="tab"
							class="cor-branco texto-centralizado"> <i
								class="fa fa-pie-chart" aria-hidden="true"></i> <br>G
						</a></li>

						<li><a href="#fase" data-toggle="tab"
							class="cor-branco texto-centralizado"> <i
								class="fa fa-bar-chart" aria-hidden="true"></i> <br>F
						</a></li>
						<li><a href="#fase1" data-toggle="tab"
							class="cor-branco texto-centralizado"> <i
								class="fa fa-bar-chart" aria-hidden="true"></i> <br>F1
						</a></li>
						<li><a href="#fase2" data-toggle="tab"
							class="cor-branco texto-centralizado"> <i
								class="fa fa-bar-chart" aria-hidden="true"></i> <br>F2
						</a></li>
						<li><a href="#fase3" data-toggle="tab"
							class="cor-branco texto-centralizado"> <i
								class="fa fa-bar-chart" aria-hidden="true"></i> <br>F3
						</a></li>
					</ul>

					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in" id="geral">
							<div class="row">
								<div class="col-xs-12 col-sm-12">
									<h4 class="cor-toolbar texto-centralizado">Dados gerais</h4>
								</div>
								<div class="col-xs-12">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Relação</div>
										<div class="panel-body" style="border-color: #fff;">

											<div class="col-xs-12 col-sm-4">&nbsp;</div>
											<div class="col-xs-12 col-sm-4">
												<canvas id="chartHistorico" width="100" height="100"></canvas>
											</div>
											<div class="col-xs-12 col-sm-4">&nbsp;</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="tab-pane fade" id="fase">

							<div class="row">
								<div class="col-xs-12 col-sm-12">
									<h4 class="cor-toolbar texto-centralizado">Dados gerais de
										cada fase</h4>
								</div>


								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Fase 1</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartFase1" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Fase 2</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartFase2" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Fase 3</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartFase3" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="tab-pane fade" id="fase1">

							<div class="row">
								<div class="col-xs-12 col-sm-12">
									<h4 class="cor-toolbar texto-centralizado">Dados gerais de
										cada tema da 1ª fase</h4>
								</div>

								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Tipos e
											Atribuição de variaveis</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartTipoAtribuicao" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">if/else</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartIfElse" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Switch/case
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
								<div class="col-xs-12 col-sm-12">
									<h4 class="cor-toolbar texto-centralizado">Dados gerais de
										cada tema da 2ª fase</h4>
								</div>

								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">For</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartFor" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">While</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartWhile" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">do While</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartDoWhile" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="tab-pane fade" id="fase3">

							<div class="row">
								<div class="col-xs-12 col-sm-12">
									<h4 class="cor-toolbar texto-centralizado">Dados gerais de
										cada tema da 3ª fase</h4>
								</div>

								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Troca de
											variaveis</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartTrocaDeVariaveis" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Ordenação
											simples</div>
										<div class="panel-body" style="border-color: #fff;">
											<canvas id="chartOrdenacao" width="100" height="100"></canvas>
										</div>
									</div>
								</div>
								<div class="col-xs-12 col-sm-4">
									<div class="panel">
										<div class="panel-heading"
											style="background: #FAE6B3; color: #34495E;">Funções</div>
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
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>

			</div>
		</div>
	</div>
</div>
<script src="../js/lstJogador[id].js"></script>

<script>
	function voltar() {
		window
				.setTimeout(
						"location.href='/LeCodigo-presentation/relatorio/lstJogador[id].html'",
						500);
	}
	/*
	// Dados GLOBAl
	var acertos ;
	var erros ;
	var pulos ;
	// DADOS DA FASE 1
	var acertosF1 ;
	var errosF1;
	var pulosF1 ;
	// DADOS DA FASE 2
	var acertosF2 ;
	var errosF2 ;
	var pulosF2 ;
	// DADOS DA FASE 3
	var acertosF3 ;
	var errosF3 ;
	var pulosF3 ;

	// DADOS DA QUESTOES TIPO DE VARIAVEIS
	var acertosTiposVariaveis ;
	var errosTiposVariaveis;
	var pulosTiposVariaveis;

	// DADOS DA QUESTOES IF E ELSE 
	var acertosIF_ELSE;
	var errosIF_ELSE ;
	var pulosIF_ELSE ;

	// DADOS DA QUESTOES SWITCH E CASE 
	var acertosSWITCH ;
	var errosSWITCH ;
	var pulosSWITCH ;
	// DADOS DA QUESTOES FOR 

	var acertosFOR;
	var errosFOR;
	var pulosFOR ;

	// DADOS DA QUESTOES WHILE 
	var acertosWHILE;
	var errosWHILE;
	var pulosWHILE ;

	// DADOS DA QUESTOES DO WHILE 
	var acertosDO_WHILE;
	var errosDO_WHILE ;
	var pulosDO_WHILE ;

	// DADOS DA QUESTOES TROCA DE VARIAVEIS 
	var acertosTROCA_VARIAVEIS ;
	var errosTROCA_VARIAVEIS ;
	var pulosTROCA_VARIAVEIS ;

	// DADOS DA QUESTOES ORDENACAO SIMPLES 
	var acertosORDENACAO_SIMPLES ;
	var errosORDENACAO_SIMPLES ;
	var pulosORDENACAO_SIMPLES ;

	// DADOS DA QUESTOES FUNCOES 
	var acertosFUNCOES ;
	var errosFUNCOES;
	var pulosFUNCOES ;	
	*/
	
	function getJogador(id){
		
		// Dados GLOBAl
		var acertos = '${lstJogador[id]._geral.qtdRespostaCerta}';
		var erros = '${lstJogador[id]._geral.qtdRespostaErrada}';
		var pulos = '${lstJogador[id]._geral.qtdRespostaPulada}';
		// DADOS DA FASE 1
		var acertosF1 = '${lstJogador[id]._tipos_atribuicao_de_variaveis.qtdRespostaCerta + lstJogador[id]._if_else.qtdRespostaCerta + lstJogador[id]._switch_case.qtdRespostaCerta} ';
		var errosF1 = '${lstJogador[id]._tipos_atribuicao_de_variaveis.qtdRespostaErrada + lstJogador[id]._if_else.qtdRespostaErrada + lstJogador[id]._switch_case.qtdRespostaErrada} ';
		var pulosF1 = '${lstJogador[id]._tipos_atribuicao_de_variaveis.qtdRespostaPulada + lstJogador[id]._if_else.qtdRespostaPulada + lstJogador[id]._switch_case.qtdRespostaPulada} ';
		// DADOS DA FASE 2
		var acertosF2 = '${lstJogador[id]._for.qtdRespostaCerta + lstJogador[id]._while.qtdRespostaCerta + lstJogador[id]._do_while.qtdRespostaCerta} ';
		var errosF2 = '${lstJogador[id]._for.qtdRespostaErrada + lstJogador[id]._while.qtdRespostaErrada + lstJogador[id]._do_while.qtdRespostaErrada} ';
		var pulosF2 = '${lstJogador[id]._for.qtdRespostaPulada + lstJogador[id]._while.qtdRespostaPulada + lstJogador[id]._do_while.qtdRespostaPulada} ';
		// DADOS DA FASE 3
		var acertosF3 = '${lstJogador[id]._ordenacao.qtdRespostaCerta + lstJogador[id]._contadores.qtdRespostaCerta + lstJogador[id]._funcoes.qtdRespostaCerta} ';
		var errosF3 = '${lstJogador[id]._ordenacao.qtdRespostaErrada + lstJogador[id]._contadores.qtdRespostaErrada + lstJogador[id]._funcoes.qtdRespostaErrada} ';
		var pulosF3 = '${lstJogador[id]._ordenacao.qtdRespostaPulada + lstJogador[id]._contadores.qtdRespostaPulada + lstJogador[id]._funcoes.qtdRespostaPulada} ';

		// DADOS DA QUESTOES TIPO DE VARIAVEIS
		var acertosTiposVariaveis = '${lstJogador[id]._tipos_atribuicao_de_variaveis.qtdRespostaCerta}';
		var errosTiposVariaveis = '${lstJogador[id]._tipos_atribuicao_de_variaveis.qtdRespostaErrada}';
		var pulosTiposVariaveis = '${lstJogador[id]._tipos_atribuicao_de_variaveis.qtdRespostaPulada}';

		// DADOS DA QUESTOES IF E ELSE 
		var acertosIF_ELSE = '${lstJogador[id]._if_else.qtdRespostaCerta}';
		var errosIF_ELSE = '${lstJogador[id]._if_else.qtdRespostaErrada}';
		var pulosIF_ELSE = '${lstJogador[id]._if_else.qtdRespostaPulada}';

		// DADOS DA QUESTOES SWITCH E CASE 
		var acertosSWITCH = '${lstJogador[id]._switch_case.qtdRespostaCerta}';
		var errosSWITCH = '${lstJogador[id]._switch_case.qtdRespostaErrada}';
		var pulosSWITCH = '${lstJogador[id]._switch_case.qtdRespostaPulada}';
		// DADOS DA QUESTOES FOR 

		var acertosFOR = '${lstJogador[id]._for.qtdRespostaCerta}';
		var errosFOR = '${lstJogador[id]._for.qtdRespostaErrada}';
		var pulosFOR = '${lstJogador[id]._for.qtdRespostaPulada}';

		// DADOS DA QUESTOES WHILE 
		var acertosWHILE = '${lstJogador[id]._while.qtdRespostaCerta}';
		var errosWHILE = '${lstJogador[id]._while.qtdRespostaErrada}';
		var pulosWHILE = '${lstJogador[id]._while.qtdRespostaPulada}';

		// DADOS DA QUESTOES DO WHILE 
		var acertosDO_WHILE = '${lstJogador[id]._do_while.qtdRespostaCerta}';
		var errosDO_WHILE = '${lstJogador[id]._do_while.qtdRespostaErrada}';
		var pulosDO_WHILE = '${lstJogador[id]._do_while.qtdRespostaPulada}';

		// DADOS DA QUESTOES TROCA DE VARIAVEIS 
		var acertosTROCA_VARIAVEIS = '${lstJogador[id]._contadores.qtdRespostaCerta}';
		var errosTROCA_VARIAVEIS = '${lstJogador[id]._contadores.qtdRespostaErrada}';
		var pulosTROCA_VARIAVEIS = '${lstJogador[id]._contadores.qtdRespostaPulada}';

		// DADOS DA QUESTOES ORDENACAO SIMPLES 
		var acertosORDENACAO_SIMPLES = '${lstJogador[id]._ordenacao.qtdRespostaCerta}';
		var errosORDENACAO_SIMPLES = '${lstJogador[id]._ordenacao.qtdRespostaErrada}';
		var pulosORDENACAO_SIMPLES = '${lstJogador[id]._ordenacao.qtdRespostaPulada}';

		// DADOS DA QUESTOES FUNCOES 
		var acertosFUNCOES = '${lstJogador[id]._funcoes.qtdRespostaCerta}';
		var errosFUNCOES = '${lstJogador[id]._funcoes.qtdRespostaErrada}';
		var pulosFUNCOES = '${lstJogador[id]._funcoes.qtdRespostaPulada}';		
		
		// GERAL
		carregaVariaveisHistoricoGeral(acertos, erros, pulos);

		// RESUMO DAS FASES
		carregaVariaveisHistoricoF1(acertosF1, errosF1, pulosF1);
		carregaVariaveisHistoricoF2(acertosF2, errosF2, pulosF2);
		carregaVariaveisHistoricoF3(acertosF3, errosF3, pulosF3);

		// RESUMO DA FASE 1 
		carregaVariaveisHistorico_if_else(acertosIF_ELSE, errosIF_ELSE,
				pulosIF_ELSE);
		carregaVariaveisHistorico_tipo_atribuicao(acertosTiposVariaveis,
				errosTiposVariaveis, pulosTiposVariaveis);
		carregaVariaveisHistorico_switch_case(acertosSWITCH, errosSWITCH,
				pulosSWITCH);

		// RESUMO DA FASE 2
		carregaVariaveisHistorico_for(acertosFOR, errosFOR, pulosFOR);
		carregaVariaveisHistorico_while(acertosWHILE, errosWHILE, pulosWHILE);
		carregaVariaveisHistorico_do_While(acertosDO_WHILE, errosDO_WHILE,
				pulosDO_WHILE);

		// RESUMO DA FASE 3
		carregaVariaveisHistorico_troca_de_variaveis(acertosTROCA_VARIAVEIS,
				errosTROCA_VARIAVEIS, pulosTROCA_VARIAVEIS);
		carregaVariaveisHistorico_ordenacao(acertosORDENACAO_SIMPLES,
				errosORDENACAO_SIMPLES, pulosORDENACAO_SIMPLES);
		carregaVariaveisHistorico_funcoes(acertosFUNCOES, errosFUNCOES,
				pulosFUNCOES);
	}
	
	
	
	
	
</script>