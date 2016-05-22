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

			<div class="col-md-12">
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
				<div class="col-md-4">
					<div class="panel">
						<div class="panel-heading"
							style="background: #FAE6B3; color: #34495E;">Fase 1<br>
							Acertos, Erros e Pulos das questões</div>
						<div class="panel-body" style="border-color: #fff;">
							<canvas id="chartFase1" width="100" height="100"></canvas>
						</div>
					</div>
				</div>
				
				<div class="col-md-4">
					<div class="panel">
						<div class="panel-heading"
							style="background: #FAE6B3; color: #34495E;">Fase 2<br>
							Acertos, Erros e Pulos das questões</div>
						<div class="panel-body" style="border-color: #fff;">
							<canvas id="chartFase2" width="100" height="100"></canvas>
						</div>
					</div>
				</div>
				
				<div class="col-md-4">
					<div class="panel">
						<div class="panel-heading"
							style="background: #FAE6B3; color: #34495E;">Fase 3<br>
							Acertos, Erros e Pulos das questões</div>
						<div class="panel-body" style="border-color: #fff;">
							<canvas id="chartFase3" width="100" height="100"></canvas>
						</div>
					</div>
				</div>

			</div>


		</div>
	</div>


	<script src="../js/jogo/relatorio.js"></script>

	<script language="javascript">
		var acertos = '${certo}';
		var erros = '${erro}';
		var pulos = '${pulo}';
		
		var acertosF1 = '${questoesCertasF1}';
		var errosF1 = '${questoesErradasF1}';
		var pulosF1 = '${questoesPulouF1}';
		
		var acertosF2 = '${questoesCertasF2}';
		var errosF2 = '${questoesErradasF2}';
		var pulosF2 = '${questoesPulouF2}';
		
		var acertosF3 = '${questoesCertasF3}';
		var errosF3 = '${questoesErradasF3}';
		var pulosF3 = '${questoesPulouF3}';
		
		
		
		carregaVariaveisHistoricoGeral(acertos, erros, pulos);
		carregaVariaveisHistoricoF1(acertosF1, errosF1, pulosF1);
		carregaVariaveisHistoricoF2(acertosF2, errosF2, pulosF2);
		carregaVariaveisHistoricoF3(acertosF3, errosF3, pulosF3);
	</script>

</body>

</html>