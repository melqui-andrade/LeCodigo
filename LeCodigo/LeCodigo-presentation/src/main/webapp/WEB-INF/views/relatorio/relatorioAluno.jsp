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
			<h2 style="text-align: center">Relatório Alunos</h2>
			<br>
			<div class="row">
				<div class="col-md-2">

					<a href="/LeCodigo-presentation/relatorio/relatorio.html"
						data-original-title="Clique neste botão e irá iniciar o jogo"
						type="button" class="btn btn-primary btn-block "
						data-toggle="tooltip" data-placement="left" title=""><span>Voltar</span></a>

				</div>
				
					<form role="form">
						<div class="form-group has-feedback has-feedback-left">
							<label class="control-label sr-only">Nome do Aluno</label> <input
								type="text" class="form-control input-lg btn-toggle"
								placeholder="Nome do Aluno" /> <i
								class="form-control-feedback fa fa-user"></i>
						</div>
					</form>
				
			</div>
			<br>

			<div class="panel panel-info">
				<!-- Default panel contents -->
				<div class="panel-heading">Alunos</div>

				<table class="table">
					<thead>
						<tr>
							<th class="col-md-3">Id</th>
							<th class="col-md-6">Nome</th>
							<th class="col-md-3"></th>
						</tr>

					</thead>

					<tbody>
						<c:forEach items="${lstAlunos }" var="aluno">
							<tr>
								<td class="col-md-3">${aluno.id }</td>
								<td class="col-md-6">${aluno.nome }</td>
								<td class="col-md-3"><a href=""> <i
										class="glyphicon glyphicon-eye-open"
										style="background-color: #bdc3c7; text-align: center;"></i>
								</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
</body>

</html>