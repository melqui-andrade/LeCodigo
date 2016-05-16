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
<body style="background-color: #22214d;">


	<div class="col-md-12 container ">

		<div class="row">
			<h1 style="text-align: center">LeCodigo</h1>
			<h2 style="text-align: center">Login</h2>
			<br>
			<div class="col-md-2">

				<a href="/LeCodigo-presentation/home/home.html"
					data-original-title="Clique neste botão e irá iniciar o jogo"
					type="button" class="btn btn-info btn-block " data-toggle="tooltip"
					data-placement="left" title=""><span>Voltar</span></a>
			</div>
			<div class="col-md-6">&nbsp;</div>
			<br>
			<div class="col-md-4">&nbsp;</div>
			<br>
			<div class="col-md-4">&nbsp;</div>

			<div class="col-md-4" style="background-color: #eee; padding: 2%;">
				<form:form id="formCadastro" modelAttribute="jogadorModel"
					method="post">
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
					<button class="btn btn-info btn-block">Login</button>
				</form:form>
			</div>
			<br>
			<div class="col-md-4">&nbsp;</div>


		</div>


	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>


</body>

</html>