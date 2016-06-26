<%@ include file="/WEB-INF/views/includeTags.jsp"%>

<div style="padding-top: 5%; margin-top: 25%;">
	<form:form id="formCadastro" modelAttribute="jogadorModel"
		method="post">
		<span class="cor-branco">Login <span class="cor-vermelha">*</span>
		</span>
		<div class="form-group">
			<form:input path="login" type="text" class="form-control cor-preto"
				placeholder="Login" />
		</div>
		<span class="cor-branco">Senha <span class="cor-vermelha">*</span>
		</span>
		<div class="form-group">
			<form:input path="senha" type="password"
				class="form-control cor-preto" placeholder="Senha" />
		</div>
		<button class="btn btn-info btn-block">Login</button>
	</form:form>
</div>

<script>
function voltar() {
	window.setTimeout("location.href='/LeCodigo-presentation/home/home.html'",
			500);
}
</script>