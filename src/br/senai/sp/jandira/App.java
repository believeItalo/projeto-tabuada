package br.senai.sp.jandira;

import java.awt.Color;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class App {
	public static void main(String[] args) {
		
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 600;
		tela.largura = 400;
		tela.corDeFundoDaTela = new Color(128,128,255);
		tela.corDoTexto = new Color(255,255,255);
		tela.corTextoBotao = new Color(128,128,255);
		tela.corDoBotao = new Color(255,255,0);
		tela.criarTela();
		

		
		
	}

}
