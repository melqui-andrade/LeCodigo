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
			<h2 style="text-align: center">Cadastrar</h2>
			<br>
			<div class="row">
				<div class="col-md-2">

					<a href="/LeCodigo-presentation/home/home.html"
						data-original-title="Clique neste botão e irá iniciar o jogo"
						type="button" class="btn btn-primary btn-block "
						data-toggle="tooltip" data-placement="left" title=""><span>Voltar</span></a>
				</div>
			</div>
			<br>
			<div class="row" >
				<div class="col-md-4">&nbsp;</div>
				<div class="col-md-4" style="background-color: #eee; padding: 2%;">
					<c:if test="${status == 0}">
						<div class="alert alert-success" role="alert">
							<span class="glyphicon glyphicon-exclamation-sign"
								aria-hidden="true"></span> <span class="sr-only">Sucesso:</span>
							Cadastro realizado com sucesso!
						</div>
					</c:if>
					<c:if test="${status == 1}">
						<div class="alert alert-danger" role="alert">
							<span class="glyphicon glyphicon-exclamation-sign"
								aria-hidden="true"></span> <span class="sr-only">Erro:</span>
							Erro ao cadastrar, verifique as informações novamente.
						</div>
					</c:if>

					<form:form id="formCadastro" modelAttribute="jogadorModel"
						method="post">

						<label class="demo-panel-title" style="color: #22204c">Nome
							<label style="color: #f06259">*</label>
						</label>
						<div class="form-group">
							<form:input path="nome" type="text" class="form-control"
								placeholder="Nome" />
						</div>
						<label class="demo-panel-title" style="color: #22204c">Login
							<label style="color: #f06259">*</label>
						</label>
						<div class="form-group">
							<form:input path="login" type="text" class="form-control"
								placeholder="Login" />
						</div>

						<label class="demo-panel-title" style="color: #22204c">Senha
							<label style="color: #f06259">*</label>
						</label>
						<div class="form-group">
							<form:input path="senha" type="password" class="form-control"
								placeholder="Senha" />
						</div>

						<label class="demo-panel-title" style="color: #22204c">Tipo
							<label style="color: #f06259">*</label>
						</label>
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
				<br>
				<div class="col-md-4">&nbsp;</div>
			</div>
		</div>


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
	</script>


</body>

</html>