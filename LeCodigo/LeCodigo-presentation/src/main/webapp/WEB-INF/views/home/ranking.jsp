<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<div style="margin-top: 6%;">
	<h4 class="cor-branco texto-centralizado ">Ranking de Jogadores</h4>
	<div class="panel panel-info">
		<!-- Default panel contents -->
		<div class="panel-heading">Ranking</div>

		<!-- Table -->
		<table class="table container">
			<thead>
				<tr>
					<th>Colocação</th>
					<th>Pontuação</th>
					<th>Nome</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${jogadores}" var="jogador" varStatus="contador">
					<tr>
						<th scope="row">${contador.index +1}</th>
						<td>${jogador.pontuacao_total}</td>
						<td>${jogador.nome}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</div>

<script>
	function voltar() {
		window.setTimeout(
				"location.href='/LeCodigo-presentation/home/home.html'", 500);
	}
</script>