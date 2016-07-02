<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<div style="margin-top: 3%;">
	<h4 class="cor-branco texto-centralizado ">Relatório dos alunos</h4>


	<div class="container">
		<!-- 
		<div class="" style="margin-bottom: 20px;">
			<input type="text" class="form-control"
				placeholder="Pesquisar por nome do aluno" />
		</div>
		 -->
		<div class="panel panel-info">

			<div class="panel-heading" style="padding-left: 5%;">Alunos</div>
			<!-- Table -->
			<table class="table" id="pesquisaBD">
				<thead>
					<tr style="text-align: left">
						<th class="col-xs-6 col-sm-6"
							style="text-align: left; padding-left: 5%;">Nome</th>
						<th class="col-xs-6 col-sm-6">Ação</th>
					</tr>
				</thead>
				<c:forEach items="${lstJogador }" var="usuario" varStatus="i">
					<tbody>
						<tr style="text-align: left;">
							<td class="col-xs-6 col-sm-6" style="padding-left: 5%;">${usuario.nome }</td>
							<td class="col-xs-6 col-sm-6">
								<button type="button" class="btn btn-primary btn-block"
									data-toggle="modal" data-target="#relatorioAluno"
									onclick="getJogador('${i.index}')">Ver o relatório</button>
							</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>

			<table class="table" id="pesquisa">
				<thead>
					<tr style="text-align: left">
						<th class="col-xs-6 col-sm-6"
							style="text-align: left; padding-left: 5%;">Nome</th>
						<th class="col-xs-6 col-sm-6">Ação</th>
					</tr>
				</thead>
				<tbody>
					<tr style="text-align: left;">
						<td class="col-xs-6 col-sm-6" style="padding-left: 5%;">${usuario.nome }</td>
						<td class="col-xs-6 col-sm-6">
							<button type="button" class="btn btn-primary btn-block"
								data-toggle="modal" data-target="#relatorioAluno"
								onclick="getJogador('${i.index}')">Ver o relatório</button>
						</td>
					</tr>
				</tbody>

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
				<h4 class="modal-title" style="color: black;" id="modalTitulo">Relatório</h4>
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
				<button type="button" class="btn btn-info" data-dismiss="modal">Fechar</button>

			</div>
		</div>
	</div>
</div>
<script src="../js/relatorio.js"></script>


<script language="javascript">
	document.getElementById("pesquisa").remove();

	function voltar() {
		window
				.setTimeout(
						"location.href='/LeCodigo-presentation/relatorio/relatorio.html'",
						500);
	}
	function sair() {
		window.setTimeout(
				"location.href='/LeCodigo-presentation/home/home.html'", 500);
	}

	var data = '${lstJogadorJson}';
	var jogador = jQuery.parseJSON(data);

	function getJogador(id) {

		var jog = jogador[id];

		var nome = jog.nome;

		document.getElementById("modalTitulo").innerHTML = "Relatório de "
				+ nome;

		// Dados GLOBAl
		var acertos = jog.relatorio._geral.qtdRespostaCerta;
		var erros = jog.relatorio._geral.qtdRespostaErrada;
		var pulos = jog.relatorio._geral.qtdRespostaPulada;
		// DADOS DA FASE 1
		var acertosF1 = jog.relatorio._tipos_atribuicao_de_variaveis.qtdRespostaCerta
				+ jog.relatorio._if_else.qtdRespostaCerta
				+ jog.relatorio._switch_case.qtdRespostaCerta;
		var errosF1 = jog.relatorio._tipos_atribuicao_de_variaveis.qtdRespostaErrada
				+ jog.relatorio._if_else.qtdRespostaErrada
				+ jog.relatorio._switch_case.qtdRespostaErrada;
		var pulosF1 = jog.relatorio._tipos_atribuicao_de_variaveis.qtdRespostaPulada
				+ jog.relatorio._if_else.qtdRespostaPulada
				+ jog.relatorio._switch_case.qtdRespostaPulada;
		// DADOS DA FASE 2
		var acertosF2 = jog.relatorio._for.qtdRespostaCerta
				+ jog.relatorio._while.qtdRespostaCerta
				+ jog.relatorio._do_while.qtdRespostaCerta;
		var errosF2 = jog.relatorio._for.qtdRespostaErrada
				+ jog.relatorio._while.qtdRespostaErrada
				+ jog.relatorio._do_while.qtdRespostaErrada;
		var pulosF2 = jog.relatorio._for.qtdRespostaPulada
				+ jog.relatorio._while.qtdRespostaPulada
				+ jog.relatorio._do_while.qtdRespostaPulada;
		// DADOS DA FASE 3
		var acertosF3 = jog.relatorio._ordenacao.qtdRespostaCerta
				+ jog.relatorio._contadores.qtdRespostaCerta
				+ jog.relatorio._funcoes.qtdRespostaCerta;
		var errosF3 = jog.relatorio._ordenacao.qtdRespostaErrada
				+ jog.relatorio._contadores.qtdRespostaErrada
				+ jog.relatorio._funcoes.qtdRespostaErrada;
		var pulosF3 = jog.relatorio._ordenacao.qtdRespostaPulada
				+ jog.relatorio._contadores.qtdRespostaPulada
				+ jog.relatorio._funcoes.qtdRespostaPulada;

		// DADOS DA QUESTOES TIPO DE VARIAVEIS
		var acertosTiposVariaveis = jog.relatorio._tipos_atribuicao_de_variaveis.qtdRespostaCerta;
		var errosTiposVariaveis = jog.relatorio._tipos_atribuicao_de_variaveis.qtdRespostaErrada;
		var pulosTiposVariaveis = jog.relatorio._tipos_atribuicao_de_variaveis.qtdRespostaPulada;

		// DADOS DA QUESTOES IF E ELSE 
		var acertosIF_ELSE = jog.relatorio._if_else.qtdRespostaCerta;
		var errosIF_ELSE = jog.relatorio._if_else.qtdRespostaErrada;
		var pulosIF_ELSE = jog.relatorio._if_else.qtdRespostaPulada;

		// DADOS DA QUESTOES SWITCH E CASE 
		var acertosSWITCH = jog.relatorio._switch_case.qtdRespostaCerta;
		var errosSWITCH = jog.relatorio._switch_case.qtdRespostaErrada;
		var pulosSWITCH = jog.relatorio._switch_case.qtdRespostaPulada;
		// DADOS DA QUESTOES FOR 

		var acertosFOR = jog.relatorio._for.qtdRespostaCerta;
		var errosFOR = jog.relatorio._for.qtdRespostaErrada;
		var pulosFOR = jog.relatorio._for.qtdRespostaPulada;

		// DADOS DA QUESTOES WHILE 
		var acertosWHILE = jog.relatorio._while.qtdRespostaCerta;
		var errosWHILE = jog.relatorio._while.qtdRespostaErrada;
		var pulosWHILE = jog.relatorio._while.qtdRespostaPulada;

		// DADOS DA QUESTOES DO WHILE 
		var acertosDO_WHILE = jog.relatorio._do_while.qtdRespostaCerta;
		var errosDO_WHILE = jog.relatorio._do_while.qtdRespostaErrada;
		var pulosDO_WHILE = jog.relatorio._do_while.qtdRespostaPulada;

		// DADOS DA QUESTOES TROCA DE VARIAVEIS 
		var acertosTROCA_VARIAVEIS = jog.relatorio._contadores.qtdRespostaCerta;
		var errosTROCA_VARIAVEIS = jog.relatorio._contadores.qtdRespostaErrada;
		var pulosTROCA_VARIAVEIS = jog.relatorio._contadores.qtdRespostaPulada;

		// DADOS DA QUESTOES ORDENACAO SIMPLES 
		var acertosORDENACAO_SIMPLES = jog.relatorio._ordenacao.qtdRespostaCerta;
		var errosORDENACAO_SIMPLES = jog.relatorio._ordenacao.qtdRespostaErrada;
		var pulosORDENACAO_SIMPLES = jog.relatorio._ordenacao.qtdRespostaPulada;

		// DADOS DA QUESTOES FUNCOES 
		var acertosFUNCOES = jog.relatorio._funcoes.qtdRespostaCerta;
		var errosFUNCOES = jog.relatorio._funcoes.qtdRespostaErrada;
		var pulosFUNCOES = jog.relatorio._funcoes.qtdRespostaPulada;

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

	function pesquisar(nome) {

	}
</script>