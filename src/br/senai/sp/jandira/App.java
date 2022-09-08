package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class App {
	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 600;
		tela.largura = 400;
		tela.criarTela();

	}

}
