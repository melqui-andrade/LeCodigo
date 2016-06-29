<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<div style="margin-top: 3%;">
	<h4 class="cor-branco texto-centralizado ">Relatório dos alunos</h4>
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
								data-toggle="modal" data-target="#relatorioAluno">Veja
								o relatório</button>
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
			<div class="modal-body">
				<table class="table">
					<thead>
						<tr>
							<th class="col-md-8">Questao</th>
							<th class="col-xs-6 col-sm-4">Status</th>
						</tr>
					</thead>
					<c:forEach items="${lstQuestoes }">
						<tbody>
							<tr>
								<td class="col-md-8">QOWEIU asdshd asidha sldkahsd</td>
								<td class="col-xs-6 col-sm-4">ERROU</td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>

			</div>
		</div>
	</div>
</div>

<script>
	function voltar() {
		window.setTimeout(
				"location.href='/LeCodigo-presentation/relatorio/relatorio.html'", 500);
	}
</script>