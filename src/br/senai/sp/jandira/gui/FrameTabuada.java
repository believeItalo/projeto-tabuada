package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameTabuada {
	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Color corDobotao;
	public Color corDoTexto;
	public Color corTextoBotao;
	
	public void criarTela() {
	JFrame tela = new JFrame();
	tela.setTitle(titulo);
	tela.setSize(largura, altura);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tela.setLayout(null);
	
	Container painel = tela.getContentPane();
	tela.getContentPane().setBackground(corDeFundoDaTela);
	
	
	}

}
