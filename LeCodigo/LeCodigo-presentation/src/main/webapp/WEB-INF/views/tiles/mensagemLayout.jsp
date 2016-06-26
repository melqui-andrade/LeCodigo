<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>LeCodigo</title>

<style rel="stylesheet">
body {
	background: url("../images/background/background.png") no-repeat center
		top fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>
<%@ include file="/WEB-INF/views/imports.jsp"%>
<%@ include file="/WEB-INF/views/includeTags.jsp"%>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid" style="padding-top: 10px;">
			<div class="row">
				<div class="col-xs-4 col-sm-4">
					<h4 class="texto-negrito cor-branco" >
						<a class="cor-branco" onclick="voltar()"> <span
							class="fa fa-chevron-left"></span>
						</a>
					</h4>
				</div>
				<div class="col-xs-4 col-sm-4">
					<h4 class="texto-negrito texto-centralizado cor-branco">
						<tiles:insertAttribute name="titulo" />
					</h4>
				</div>
				<div class="col-xs-4 col-sm-4">&nbsp;</div>
			</div>
		</div>
	</nav>
	<div class="espaco-toolbar">
		<div class="container">
			<div class="row">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
		
		
		
	</script>
</body>
</html>