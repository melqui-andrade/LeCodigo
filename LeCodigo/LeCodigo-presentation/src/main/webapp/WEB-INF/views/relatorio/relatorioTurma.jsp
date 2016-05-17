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
				<br>
				<br>
				<div class="panel panel-default none">
					<!-- Default panel contents -->
					<div class="panel-heading"></div>

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