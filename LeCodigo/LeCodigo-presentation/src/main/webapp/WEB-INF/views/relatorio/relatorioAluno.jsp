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

					<a href="relatorio.html"
						data-original-title="Clique neste botão e irá iniciar o jogo"
						type="button" class="btn btn-primary btn-block "
						style="text-align: left;" data-placement="left" title="">Voltar</a>
					<br>
				</div>
				<br>
				<form role="form">
					<div class="form-group has-feedback has-feedback-left">
						<input type="text" class="form-control input-lg btn-toggle"
							placeholder="Nome do Aluno" /> <i
							class="form-control-feedback fa fa-user"></i>

					</div>
				</form>


			</div>
			<br>

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

					<table class="table">
						<thead>
							<tr>
								<th class="col-md-8">Questao</th>
								<th class="col-md-4">Status</th>
							</tr>

						</thead>
						<c:forEach items="${lstQuestoes }">
							<tbody>
								<tr>
									<td class="col-md-8">QOWEIU asdshd asidha sldkahsd</td>
									<td class="col-md-4">ERROU</td>
								</tr>
							</tbody>
						</c:forEach>
					</table>



				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
	
	
	
	
</body>

</html>