package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTabuada {
	 
	public String titulo;
	public int largura;
	public int altura;
	
	
	
	 public void criarTela() {
		 
	JFrame tela = new JFrame();
	tela.setTitle(titulo);
	tela.setSize(largura, altura);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tela.setLayout(null);
	
	Container painel = tela.getContentPane();
	
	
	//label
	JLabel lblMultiplicando = new JLabel();
	lblMultiplicando.setText("Multiplicando");
	lblMultiplicando.setBounds(30, 10, 100, 30);
	//
//	JLabel lblmaxMultiplicado = new JLabel();
//	lblmaxMultiplicado.setText("Max Multiplicador");
//	//
//	JLabel lblminMultiplicado = new JLabel();
//	lblminMultiplicado.setText("Min Multiplicador");
	
	
	painel.add(painel);
	painel.add(tela);
	painel.add(lblMultiplicando);
	
	
	
	
	
	tela.setVisible(true);
//	painel.add(lblmaxMultiplicado);
//	painel.add(lblminMultiplicado);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }
	

	
	}


