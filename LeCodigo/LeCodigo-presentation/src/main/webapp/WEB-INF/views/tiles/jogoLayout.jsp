<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>LeCodigo</title>

<link rel="apple-touch-icon" sizes="57x57"
	href="../images/favicon/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60"
	href="../images/favicon/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="../images/favicon/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="../images/favicon/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="../images/favicon/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="../images/favicon/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144"
	href="../images/favicon/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="../images/favicon/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180"
	href="../images/favicon/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"
	href="../images/favicon/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="../images/favicon/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="../images/favicon/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="../images/favicon/favicon-16x16.png">
<link rel="manifest" href="../images/favicon/manifest.json">
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="msapplication-TileImage"
	content="../images/favicon/ms-icon-144x144.png">
<meta name="theme-color" content="#ffffff">

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
		<div style="padding: 5px;">
			<div class="texto-centralizado">

				<div class="row" style="text-align: center;">
					<div class="col-xs-4 col-sm-4">
						<h4 class="texto-negrito cor-branco"
							data-original-title="Voltar para a página anterior"
							data-toggle="tooltip" data-placement="bottom" title=""
							id="botaoVoltar">
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
					<div class="col-xs-4 col-sm-4">
						<h4 class="texto-negrito cor-branco"
							data-original-title="Sair do jogo, voltando para a página de login"
							data-toggle="tooltip" data-placement="bottom" title="">
							<a class="cor-branco" onclick="sair()"> <span
								class="fa fa-sign-out"></span>
							</a>
						</h4>
					</div>

				</div>
				<div class="row">
					<div class="col-xs-3 col-sm-3">
						<h4 class="texto-negrito cor-branco">
							<span>Fase: <br>${idFase}</span>
						</h4>

					</div>
					<div class="col-xs-3 col-sm-3">
						<h4 class="texto-negrito cor-branco">
							<span>Bits:<br> ${bits}
							</span>
						</h4>
					</div>
					<div class="col-xs-3 col-sm-3">
						<h4 class="texto-negrito cor-branco">
							<span>Pontuação:<br> ${pontuacao}
							</span>
						</h4>
					</div>
					<div class="col-xs-3 col-sm-3">
						<h4 class="texto-negrito cor-branco">
							<span> Vida:<br> <c:forEach begin="1" end="${vidas}"
									varStatus="loop">
									<i class="fa fa-heart cor-vermelha" style="font-size: 10pt;"></i>
								</c:forEach> <c:if test="${vidas <3}">

									<c:forEach begin="1" end="${3-vidas}" varStatus="loop">
										<i class="fa fa-heart-o" style="font-size: 10pt;"></i>
									</c:forEach>

								</c:if>
							</span>
						</h4>
						<!-- 
						 <c:if test="${bits >= 2*idFase+1 && vidas < 3}">
							<a data-original-title="Comprar mais vidas" type="button"
								onclick="comprarVida()" data-toggle="modal"
								data-target="#myModal" class="btn btn-success fa fa-btc"
								data-toggle="tooltip" data-placement="bottom" title=""> </a>
						</c:if> <c:if test="${!(bits >= 2*idFase+1 && vidas < 3)}">
							<a data-original-title="Comprar mais vidas" type="button"
								onclick="comprarVida()" disabled data-toggle="modal"
								data-target="#myModal" class="btn btn-success fa fa-btc"
								data-toggle="tooltip" data-placement="bottom" title=""> </a>
						</c:if>
						 <a href="/LeCodigo-presentation/home/home.html"
						data-original-title="Sair do jogo" type="button"
						class="btn btn-info fa fa-sign-out  " data-toggle="tooltip"
						data-placement="bottom" title=""></a>
						 -->
					</div>
				</div>
			</div>
		</div>
	</nav>

	<div class="espaco-toolbar-jogo">
		<div class="container">
			<div class="">
				<tiles:insertAttribute name="body" />
			</div>
			<a class="cor-branco" style="text-align: center"
				href="http://br.freepik.com/fotos-vetores-gratis/desenho-animado">Desenho
				animado vetore desenhado por Freepik</a> <a class="cor-branco"
				style="text-align: center"
				href="http://br.freepik.com/fotos-vetores-gratis/lua">Lua vetore
				desenhado por Freepik</a>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>
</body>
</html>