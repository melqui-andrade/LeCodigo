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
			<div class="panel-heading"></div>

			<!-- Table -->
			<table class="table">
				<thead>
					<tr>
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
									data-toggle="modal" data-target="#relatorioAluno">
									Veja o relatório</button>								
							</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
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
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>



</body>

</html>