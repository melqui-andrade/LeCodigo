package com.br.uepb.model;

public class FaseModel {

	private final String CORFASE1 = "#22214d";
	private final String CORFASE2 = "#22214d";
	private final String CORFASE3 = "#22214d";

	private final String MONSTROFASE1 = "../images/et.png";
	private final String MONSTROFASE2 = "../images/et.png";
	private final String MONSTROFASE3 = "../images/et.png";

	private final String PERFILMONSTROFASE1 = "../images/monster1_little.png";
	private final String PERFILMONSTROFASE2 = "../images/monster2_little.png";
	private final String PERFILMONSTROFASE3 = "../images/monster3_little.png";

	public String imgMonstro;
	public String imgPerfilMonstro;
	public String colorBackground;

	public FaseModel(int fase) {
		if (fase == 1) {
			imgMonstro = MONSTROFASE1;
			imgPerfilMonstro = PERFILMONSTROFASE1;
			colorBackground = CORFASE1;
		} else if (fase == 2) {
			imgMonstro = MONSTROFASE2;
			imgPerfilMonstro = PERFILMONSTROFASE2;
			colorBackground = CORFASE2;
		} else if (fase == 3) {
			imgMonstro = MONSTROFASE3;
			imgPerfilMonstro = PERFILMONSTROFASE3;
			colorBackground = CORFASE3;
		}
	}

	public String getImgMonstro() {
		return imgMonstro;
	}

	public void setImgMonstro(String imgMonstro) {
		this.imgMonstro = imgMonstro;
	}

	public String getImgPerfilMonstro() {
		return imgPerfilMonstro;
	}

	public void setImgPerfilMonstro(String imgPerfilMonstro) {
		this.imgPerfilMonstro = imgPerfilMonstro;
	}

	public String getColorBackground() {
		return colorBackground;
	}

	public void setColorBackground(String colorBackground) {
		this.colorBackground = colorBackground;
	}

}
