<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
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
		<div style="padding: 5px; ">
			<div class="row"
				style="color: #eee; text-align: center; font-size: 14px;">
				<div class="col-xs-3 col-sm-3 span-header">
					<span class="texto-negrito cor-branco">Fase <br>${idFase}</span>
					<br>
				</div>
				<div class="col-xs-3 col-sm-3">
					<span class="texto-negrito cor-branco">Bits:<br>
						${bits}
					</span>
				</div>
				<div class="col-xs-3 col-sm-3">
					<span class="texto-negrito cor-branco">Pontuação:<br>
						${pontuacao}
					</span>
				</div>
				<div class="col-xs-3 col-sm-3">
					<span class="texto-negrito cor-branco"> Vida:<br> <c:forEach
							begin="1" end="${vidas}" varStatus="loop">
							<i class="fa fa-heart cor-vermelha"></i>
						</c:forEach> <c:if test="${vidas <3}">

							<c:forEach begin="1" end="${3-vidas}" varStatus="loop">
								<i class="fa fa-heart-o"></i>
							</c:forEach>

						</c:if> <!-- 
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
					</span>
				</div>
			</div>
		</div>
	</nav>

	<div class="espaco-toolbar">
		<div class="container">
			<div class="">
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