<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/home.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />
<link href="../styles/jogo/fases/questao.css" rel="stylesheet">

<style rel="stylesheet">
body {
	background: url("../images/background/background2.png") no-repeat center
		top fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}

h4 {
	color: #444;
}

.panel-fase {
	background: url("../images/background/background.png") no-repeat center
		top fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>
<html>
<body style="background-color: #22214d;">


	<div class="col-md-12 container ">

		<div class="row">
			<h1 style="text-align: center">LeCódigo</h1>
			<h2 style="text-align: center">Instruções</h2>
			<br>
			<div class="row">
				<div class="col-md-2">
					<a href="/LeCodigo-presentation/home/home.html"
						data-original-title="Voltar para página incial"
						type="button" class="btn btn-primary btn-block "
						data-toggle="tooltip" data-placement="bottom" title=""><span>Voltar</span></a>
				</div>
			</div>
			<br>
			<div class="panel">
				<div class="panel-heading"
					style="background: #FAE6B3; color: #34495E;">Como o jogo
					Funciona?</div>
				<div class="panel-body" style="border-color: #fff;">
					<p>
						LeCodigo é um jogo para auxiliar no estudo a algoritmos.<br>
						O objetivo do jogo é responder corretamente as questões que serão
						apresentadas. O jogo é dividido em 3 fases, cada fase contém 5
						etapas. Cada etapa possui uma questão descrevendo situações do
						mundo real com alguma problemática a ser resolvida. Ao iniciar o
						jogo, é apresentada uma linha de tempo, onde o jogador deverá
						responder questões da 1ª Fase do jogo. Para avançar para a 2ª fase
						o jogador deverá acertar as 5 etapas da 1ª fase, e assim com a
						fase subsequente.<br>
					</p>
				</div>
			</div>

			<div class="panel">
				<div class="panel-body" style="border-color: #fff;">
					<p>
						Os temas de algoritmos são divididos entre as fases:<br> <span
							class="negrito">* Na Fase 1:</span> Serão apresentadas questões
						sobre atribuição de variáveis, tipos de variáveis e estruturas de
						condição (if-else, switch-case);<br> <span class="negrito">*
							Na Fase 2:</span> Serão apresentadas questões sobre estrutura de
						repetição (For, While, Do While);<br> <span class="negrito">*
							Na Fase 3:</span> Serão apresentadas questões sobre troca de Variáveis,
						ordenação simples e Funções simples.<br>
					</p>
				</div>
			</div>

			<div class="panel">
				<div class="panel-body" style="border-color: #fff;">
					<p>
						Como recompensa por acertar as perguntas o jogador irá ganha uma
						moeda, chamada "bit".<br>Em cada fase, as perguntas
						respondidas corretamente valem inicialmente uma quantidade de bit.
						Cada resposta errada diminuirá 1 bit a ser recebido, o valor
						mínimo de bit a ser ganho é 1.<br> Sendo que, uma questão
						correta vale:<br> <span class="negrito">* Na Fase 1:</span> 3
						bits;<br> <span class="negrito">* Na Fase 2:</span> 5 bits;<br>
						<span class="negrito">* Na Fase 3:</span> 7 bits<br>
					</p>
				</div>
			</div>


			<hr />
<h3 style="color: #fff;"> Tela - Fase </h3>
			<div class="panel-fase">
				<div class="panel-body" style="border-color: #fff;">

					<nav class="navbar navbar-inverse ">
						<div class="container-fluid" style="padding-top: 10px;">

							<div class="row"
								style="color: #eee; text-align: center; font-size: 14px;">
								<div class="col-xs-6 col-sm-2"
									data-original-title="Indicação da Fase atual do jogador bem como a etapa atual para questão"
									data-toggle="tooltip" data-placement="bottom" title="">
									<span>Fase x - Etapa y </span>
								</div>
								<div class="col-xs-6 col-sm-3"
									data-original-title="Quantidade de bits (moedas) para utilizar como recurso de compra de vidas"
									data-toggle="tooltip" data-placement="bottom" title="">
									<span>Bits: z</span>
								</div>
								<div class="col-xs-6 col-sm-3"
									data-original-title="Pontuação do jogador no decorrer das partidas"
									data-toggle="tooltip" data-placement="bottom" title="">
									<span>Pontuação: w</span>
								</div>
								<div class="col-xs-6 col-sm-4">
									<span> Vida: <span class="fa fa-heart"
										data-original-title="Vida disponível" data-toggle="tooltip"
										data-placement="bottom" title=""></span> <span
										class="fa fa-heart" data-original-title="Vida disponível"
										data-toggle="tooltip" data-placement="bottom" title=""></span>
										<span class="fa fa-heart-o" data-original-title="Vida perdida"
										data-toggle="tooltip" data-placement="bottom" title=""></span>
										<a
										data-original-title="Ao clicar neste botão, no jogo, caso tenha bits disponíves, pode-se 'comprar' vidas"
										type="button" class="btn btn-success fa fa-btc"
										data-toggle="tooltip" data-placement="bottom" title=""></a> <a
										data-original-title="Ao clicar neste botão, no jogo, irá sair do jogo, voltando a página para a informar o login"
										type="button" class="btn btn-info fa fa-sign-out  "
										data-toggle="tooltip" data-placement="bottom" title=""></a>
									</span>
								</div>
							</div>
						</div>
					</nav>
					<div class="row container">

						<div id="div_timeline" class="row">
							<div class="col-md-2">&nbsp;</div>
							<div class="col-xs-6 col-sm-4">&nbsp;</div>
							<div class="col-md-6 container ">
								<div class="timeline" id="page-top">
									<dl>
										<dd class="pos-left clearfix"
											data-original-title="Etapa atual a ser respondida"
											data-toggle="tooltip" data-placement="left" title="">
											<div class="circ "></div>
											<div class="time" style="color: #fff;"></div>
											<div class="events">
												<div class="pull-left">
													<img class="events-object img-rounded"
														src="../images/et/et_verde_little.png">
												</div>
												<div class="events-body">
													<h4 class="events-heading">Etapa 2</h4>
													<p></p>
													<button class="btn btn-primary btn-block"> <i
														class="fa fa-share"> </i> Responder
													</button>
													<hr>
												</div>
											</div>
										</dd>
										<dd class="pos-right clearfix"
											data-original-title="Fase completada com sucesso"
											data-toggle="tooltip" data-placement="right" title="">
											<div class="circ "></div>
											<div class="time" style="color: #fff;"></div>
											<div class="events">
												<div class="pull-left">
													<img class="events-object img-rounded"
														src="../images/et/et_verde_little_sumiu.png">
												</div>
												<div class="events-body">
													<h4 class="events-heading">Etapa 1</h4>
													<p></p>
													<button class="btn btn-primary btn-block" disabled
														style="color: #000">
														<i class="fa fa-2x fa-check" style="color: #23A566"> </i>
														Parabéns acertou :)
													</button>

													<hr>
												</div>
											</div>
										</dd>
									</dl>
								</div>

							</div>
						</div>
					</div>




				</div>
			</div>


			<hr />
			<h3 style="color: #fff;"> Tela - Questão </h3>
			<div class=""
				style="border-style: solid; border: 2px; border-color: #fff">
				<div class="panel-body" style="border-color: #fff;">
					<p>
						<nav class="navbar navbar-inverse ">
							<div class="container-fluid" style="padding-top: 10px;">

								<div class="row"
									style="color: #eee; text-align: center; font-size: 14px;">
									<div class="col-xs-6 col-sm-2"
										data-original-title="Indicação da Fase atual do jogador bem como a etapa atual para questão"
										data-toggle="tooltip" data-placement="bottom" title="">
										<span>Fase x - Etapa y </span>
									</div>
									<div class="col-xs-6 col-sm-3"
										data-original-title="Quantidade de bits (moedas) para utilizar como recurso de compra de vidas"
										data-toggle="tooltip" data-placement="bottom" title="">
										<span>Bits: z</span>
									</div>
									<div class="col-xs-6 col-sm-3"
										data-original-title="Pontuação do jogador no decorrer das partidas"
										data-toggle="tooltip" data-placement="bottom" title="">
										<span>Pontuação: w</span>
									</div>
									<div class="col-xs-6 col-sm-4">
										<span> Vida: <span class="fa fa-heart"
											data-original-title="Vida disponível" data-toggle="tooltip"
											data-placement="bottom" title=""></span> <span
											class="fa fa-heart" data-original-title="Vida disponível"
											data-toggle="tooltip" data-placement="bottom" title=""></span>
											<span class="fa fa-heart-o"
											data-original-title="Vida perdida" data-toggle="tooltip"
											data-placement="bottom" title=""></span> <a
											data-original-title="Ao clicar neste botão, no jogo, caso tenha bits disponíves, pode-se 'comprar' vidas"
											type="button" class="btn btn-success fa fa-btc"
											data-toggle="tooltip" data-placement="bottom" title=""></a> <a
											data-original-title="Ao clicar neste botão, no jogo, irá sair do jogo, voltando a página para a informar o login"
											type="button" class="btn btn-info fa fa-sign-out  "
											data-toggle="tooltip" data-placement="bottom" title=""></a>
										</span>
									</div>
								</div>
							</div>
						</nav>
					<div class="margem">

						<div class="row">
							<div class="panel">
								<div class="panel-body" style="border-color: #fff;"
									data-original-title="Enunciado da questão referente a fase atual do jogador"
									data-toggle="tooltip" data-placement="bottom" title="">
									Enunciado da questão...</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-6 col-sm-4">
								<div class="panel panel-default"
									data-original-title="Opções para solucionar a questão, clique no 'bloco' para selecionar a opção e a opção selecionada irá para o campo de visualização do código "
									data-toggle="tooltip" data-placement="top" title="">
									<div class="panel-heading"
										style="background: #FAE6B3; color: #34495E;">Linhas de
										código</div>
									<div id="opcoes" class="panel-body">
										<div class="title">
											Use as linhas de códigos abaixo para montar o algoritmo para
											a resposta. <br>
											<div id="blocosOpcoes" class="panel-body-opcoes">
												<a id="${bloco.id_bloco}" class="list-group-item ">
													opção1 </a> <a id="${bloco.id_bloco}" class="list-group-item ">
													opção2 </a> <a id="${bloco.id_bloco}" class="list-group-item ">
													opção3 </a>
											</div>
											<br>
										</div>
										<br>
									</div>
								</div>
							</div>

							<div class="col-md-6" id="divOpcoes">
								<div class="panel panel-default"
									data-original-title="Campo onde ficará as respostas selecionadas, caso queira remover uma linha que colocou, clique sobre a linha correspondente neste campo, e ela será removida"
									data-toggle="tooltip" data-placement="left" title="">
									<div class="panel-heading"
										style="background: #eee; color: #34495E; padding: -1%;">
										Visualização do código</div>
									<div id="respostas" class="panel-body "
										style="background: #444; color: #fff;">

										início <br>
										<div class="col-md-12">
											<div id="divResposta" class="panel-body-resposta"></div>
											<br>
										</div>
										fim <br>


									</div>
								</div>
							</div>

							<div class="col-md-2" id="divET">
								<img src="../images/et/et_verde_normal.png"
									class="img-responsive" align="middle" id="et_"
									style="float: left;" />
							</div>
						</div>



						<div class="row">
							<div class="col-md-2">
								<button class="btn btn-block btn-info "
									data-original-title="Ao clicar neste botão, no jogo, voltar para a linha do tempo da fase atual do jogador"
									data-toggle="tooltip" data-placement="top" title="">
									<i class="fa fa-reply" aria-hidden="true"></i> Voltar
								</button>
							</div>

							<div class="col-md-2">

								<button class="btn btn-block btn-info "
									data-original-title="Ao clicar neste botão, no jogo, irá pular a questão, lembre-se que: só é possível pular a questão caso tenha bits suficientes para pular, veja nas instruções acima"
									data-toggle="tooltip" data-placement="top" title="">
									<i class="fa fa-retweet" aria-hidden="true"></i> Pular
								</button>
							</div>

							<div class="col-md-6">
								<button class="btn btn-block btn-success"
									data-original-title="Ao clicar neste botão, no jogo, irá submeter a resposta ao jogo, caso tenha certeza da resposta, utilize este botão para enviar a confirmação da sua resposta"
									data-toggle="tooltip" data-placement="top" title="">
									<i class="fa fa-paper-plane" aria-hidden="true"></i> Enviar
									Resposta
								</button>
							</div>

							<div class="col-md-2">
								<button class="btn btn-danger btn-block"
									data-original-title="Ao clicar neste botão, no jogo, irá apagar todo o campo de resposta que foi informado, possibilitando, reordenar as opções selecionadas"
									data-toggle="tooltip" data-placement="top" title="">
									<i class="fa fa-times" aria-hidden="true"></i> Limpar Código
								</button>
							</div>
						</div>

					</div>

					</p>

				</div>
			</div>



		</div>


	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>


</body>

</html>