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
				<br> <br>
				<div class="panel panel-default none">
					<!-- Default panel contents -->
					<div class="panel-heading"></div>

					<div class="progress" style="margin-top: 2%;">
						<div class="progress-bar progress-bar-success" style="width: ${certo}%">
							<span class="sr-only">certo</span>
						</div>
						<div class="progress-bar progress-bar-warning progress-bar-striped"
							style="width: ${erro}%">
							<span class="sr-only">erro</span>
						</div>
						<div class="progress-bar progress-bar-warning" style="width: ${pulo}%">
							<span class="sr-only">pulo</span>
						</div>
					</div>
		<p>Legenda</p>
		<span class="label label-success">Correto</span>
		<span class="label label-warning">Erradas</span>
		<span class="label label-danger">Pulou</span>
		<br>
		<br>
					<!-- Default panel contents -->
					<div class="panel-heading"></div>

					<!-- Table FASE 1 -->
					<table class="table">
						<thead>
							<tr>
								<th class="col-md-1">FASE</th>
								<th class="col-md-4">Correto</th>
								<th class="col-md-4">Erradas</th>
								<th class="col-md-4">Pulou</th>
							</tr>

						</thead>
						<tbody>
							<tr>
								<td class="col-md-1">1</td>
								<td class="col-md-4">${questoesCertasF1 }</td>
								<td class="col-md-4">${questoesErradasF1 }</td>
								<td class="col-md-4">${questoesPulouF1 }</td>
							</tr>
							<tr>
								<td class="col-md-1">2</td>
								<td class="col-md-4">${questoesCertasF2 }</td>
								<td class="col-md-4">${questoesErradasF2 }</td>
								<td class="col-md-4">${questoesPulouF2 }</td>
							</tr>
							<tr>
								<td class="col-md-1">3</td>
								<td class="col-md-4">${questoesCertasF3 }</td>
								<td class="col-md-4">${questoesErradasF3 }</td>
								<td class="col-md-4">${questoesPulouF3 }</td>
							</tr>
						</tbody>

					</table>
					<br>
					<br>
					<!-- Table -->
					<table class="table">
						<thead>
							<tr>
								<th class="col-md-1">Id</th>
								<th class="col-md-6">Questão</th>
								<th class="col-md-2">Assunto</th>
								<th class="col-md-1">Correto</th>
								<th class="col-md-1">Erradas</th>
								<th class="col-md-1">Pulou</th>
							</tr>

						</thead>
						<c:forEach items="${lstQuestao }" var="questao">
							<tbody>
								<tr>
									<td class="col-md-1">${questao.id }</td>
									<td class="col-md-6">${questao.descricao }</td>
									<td class="col-md-2">${questao.tipo_questao}</td>
									<td class="col-md-1">0</td>
									<td class="col-md-1">0</td>
									<td class="col-md-1">0</td>
								</tr>
							</tbody>
						</c:forEach>
					</table>
				</div>

			</div>

		</div>
	</div>
</body>

</html>