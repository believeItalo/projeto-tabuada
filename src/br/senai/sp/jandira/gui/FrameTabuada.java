package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class FrameTabuada {
	public String titulo;
	public int largura;
	public int altura;
//	public Color corDeFundoDaTela;
//	public Color corDobotao;
//	public Color corDoTexto;
//	public Color corTextoBotao;
	
	public void criarTela() {
	JFrame tela = new JFrame();
	tela.setTitle(titulo);
	tela.setSize(largura, altura);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tela.setLayout(null);
	
	Container painel = tela.getContentPane();
	
	
	//setting up label
	JLabel lblTabuada = new JLabel();
	lblTabuada.setText("Tabuada");
	lblTabuada.setBounds(10, 10, 200, 30); //x y w h
	lblTabuada.setFont(new Font("Courier new", Font.BOLD, 32));
	//
	JLabel lblMultiplicando = new JLabel();
	lblMultiplicando.setText("Multiplicando");
	lblMultiplicando.setBounds(260, 50, 200, 30);
	lblMultiplicando.setFont(new Font("Courier new", Font.BOLD, 16));
	//
	JLabel lblMaxMultiplicador = new JLabel();
	lblMaxMultiplicador.setText("Máx Multiplicador");
	lblMaxMultiplicador.setBounds(220, 90, 200, 30);
	lblMaxMultiplicador.setFont(new Font("Courier new", Font.BOLD, 16));
	//
	JLabel lblMinMultiplicador = new JLabel();
	lblMinMultiplicador.setText("Min Multiplicador");
	lblMinMultiplicador.setBounds(220, 130, 200, 30);
	lblMinMultiplicador.setFont(new Font("Courier new", Font.BOLD, 16));
	//
	JLabel lblResultado = new JLabel();
	lblResultado.setText("Resultado :");
	lblResultado.setBounds(50, 270, 200, 30);
	lblResultado.setFont(new Font("Courier new", Font.BOLD, 16));
	//setting up text fields
	
	JTextField multiplicandoTextField = new JTextField();
	multiplicandoTextField.setBounds(400, 50, 150, 30);
	//
	JTextField maxMultiplicadorTextField = new JTextField();
	maxMultiplicadorTextField.setBounds(400, 90, 150, 30);
	//
	JTextField minMultiplicadorTextField = new JTextField();
	minMultiplicadorTextField.setBounds(400, 130, 150, 30);
	
	//setting up JButton
	JButton calcularButton = new JButton();
	calcularButton.setText("Calcular");
	calcularButton.setBounds(400, 170, 150, 30);
	
	// setting up Jlist
	
	JList<String> lista = new JList<String>();
	lista.setBounds(80, 300, 430, 250);
	
	
	
	//setting up components to the panel
	painel.add(lblTabuada);
	painel.add(multiplicandoTextField);
	painel.add(maxMultiplicadorTextField);
	painel.add(minMultiplicadorTextField);
	painel.add(lblMultiplicando);
	painel.add(lblMaxMultiplicador);
	painel.add(lblMinMultiplicador);
	painel.add(lblResultado);
	painel.add(calcularButton);
	painel.add(lista);
	
	
	tela.setVisible(true);
	
	
	
	
	}

}
