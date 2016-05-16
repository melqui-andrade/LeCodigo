<!DOCTYPE html>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<link href="../styles/jogo/fases/home.css" rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Open+Sans" />
<html>
<head>
<script src="../styles/bootstrap-3.3.4/js/bootstrap.js"></script>
</head>
<body style="background-color: rgb(34, 33, 77);">
	<div class="col-md-12 container">
		<div class="row">
			<h1 style="text-align: left; margin: 20px 20px 0px 40px;">Relatório
				do Aluno</h1>
		</div>

		<form role="form" style="margin: 40px 0px;">
			<div class="form-group has-feedback has-feedback-left">
				<label class="control-label sr-only">Nome do Aluno</label> <input
					type="text" class="form-control input-lg btn-toggle"
					placeholder="Nome do Aluno" /> <i
					class="form-control-feedback glyphicon glyphicon-user"></i>
			</div>
		</form>	
		
			<div class="panel panel-default none">
				<!-- Default panel contents -->
				<div class="panel-heading">Alunos</div>

				<!-- Table -->
				<table class="table">
					<thead>
						<tr>
							<th class="col-md-3">Id</th>
							<th class="col-md-6">Nome</th>
							<th class="col-md-3"></th>
						</tr>

					</thead>
					<c:forEach items="${lstAlunos }" var="aluno" >
					<tbody>
						<tr>
							<td class="col-md-3">${aluno.id }</td>
							<td class="col-md-6">${aluno.nome }</td>
							<td class="col-md-3">
							<a href="">
							<i class="glyphicon glyphicon-eye-open"
								style="background-color: #bdc3c7; text-align: center; "></i>
							</a>
							</td>
						</tr>
					</tbody>
					</c:forEach>
				</table>
			</div>
		
	</div>
</body>

</html>