<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<div style="margin-top: 6%;">
	<h4 class="cor-branco texto-centralizado ">Cadastrar Usuários</h4>
	<c:if test="${status == 0}">
		<div class="alert alert-success" role="alert">
			<span class="fa fa-exclamation-circle" aria-hidden="true"></span> <span
				class="sr-only">Sucesso:</span> Cadastro realizado com sucesso!
		</div>
	</c:if>
	<c:if test="${status == 1}">
		<div class="alert alert-danger" role="alert">
			<span class="fa fa-exclamation-circle" aria-hidden="true"></span> <span
				class="sr-only">Erro:</span> Erro ao cadastrar, verifique as
			informações novamente.
		</div>
	</c:if>

	<form:form id="formCadastro" modelAttribute="jogadorModel"
		method="post">

		<span class="cor-branco">Nome <span class="cor-vermelha">*</span>
		</span>
		<div class="form-group">
			<form:input path="nome" type="text" class="form-control"
				placeholder="Nome" />
		</div>
		<span class="cor-branco">Login <span class="cor-vermelha">*</span>
		</span>
		<div class="form-group">
			<form:input path="login" type="text" class="form-control"
				placeholder="Login" />
		</div>
		<span class="cor-branco">Senha <span class="cor-vermelha">*</span>
		</span>
		<div class="form-group">
			<form:input path="senha" type="password" class="form-control"
				placeholder="Senha" />
		</div>

		<span class="cor-branco">Tipo <span class="cor-vermelha">*</span>
		</span>
		<div class="form-group">
			<form:input path="tipo" type="text" class="form-control"
				placeholder="tipo" id="tipoValor" cssStyle="display: none;" />
			<select data-toggle="select" id="tipo"
				class="form-control select select-primary">
				<option value="Professor">Professor</option>
				<option value="Aluno">Aluno</option>
			</select>
		</div>
		<button class="btn btn-info btn-block" onclick="selecionarTipo()">Cadastrar</button>
	</form:form>
</div>

<script>
	$(document)
			.ready(
					function() {
						$('[data-toggle="tooltip"]').tooltip();
						$(
								'select[name="inverse-dropdown"], select[name="inverse-dropdown-optgroup"], select[name="inverse-dropdown-disabled"]')
								.select2(
										{
											dropdownCssClass : 'select-inverse-dropdown'
										});
						$('select[name="searchfield"]').select2({
							dropdownCssClass : 'show-select-search'
						});
						$('select[name="inverse-dropdown-searchfield"]')
								.select2(
										{
											dropdownCssClass : 'select-inverse-dropdown show-select-search'
										});
					});

	function selecionarTipo() {
		var tipoSelecionado = document.getElementById("tipo").value;
		document.getElementById("tipoValor").value = tipoSelecionado;

	}

	function voltar() {
		window.setTimeout(
				"location.href='/LeCodigo-presentation/professor/home.html'", 500);
	}
	function sair() {
		window.setTimeout(
				"location.href='/LeCodigo-presentation/home/home.html'", 500);
	}
</script>
