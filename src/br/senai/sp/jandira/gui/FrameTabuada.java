package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

import br.senai.sp.jandira.model.Tabuada;

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
		tela.getContentPane().setBackground(Color.white);
		
		

		// setting up label
		JLabel lblTabuada = new JLabel();
		lblTabuada.setText("Tabuada");
		lblTabuada.setBounds(10, 10, 200, 30); // x y w h
		lblTabuada.setFont(new Font("Courier new", Font.BOLD, 32));
		lblTabuada.setForeground(Color.black);
		
		//
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando");
		lblMultiplicando.setBounds(10, 50, 200, 30);
		lblMultiplicando.setFont(new Font("Courier new", Font.BOLD, 16));
		lblMultiplicando.setForeground(Color.black);
		//
		JLabel lblMaxMultiplicador = new JLabel();
		lblMaxMultiplicador.setText("Máx Multiplicador");
		lblMaxMultiplicador.setBounds(10, 90, 200, 30);
		lblMaxMultiplicador.setFont(new Font("Courier new", Font.BOLD, 16));
		lblMaxMultiplicador.setForeground(Color.black);
		
		//
		JLabel lblMinMultiplicador = new JLabel();
		lblMinMultiplicador.setText("Min Multiplicador");
		lblMinMultiplicador.setBounds(10, 130, 200, 30);
		lblMinMultiplicador.setFont(new Font("Courier new", Font.BOLD, 16));
		lblMinMultiplicador.setForeground(Color.black);
		//
		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultado :");
		lblResultado.setBounds(50, 270, 200, 30);
		lblResultado.setFont(new Font("Courier new", Font.BOLD, 16));
		lblResultado.setForeground(Color.black);
		// setting up text fields

		JTextField multiplicandoTextField = new JTextField();
		multiplicandoTextField.setBounds(200, 50, 150, 30);
		//
		JTextField maxMultiplicadorTextField = new JTextField();
		maxMultiplicadorTextField.setBounds(200, 90, 150, 30);
		//
		JTextField minMultiplicadorTextField = new JTextField();
		minMultiplicadorTextField.setBounds(200, 130, 150, 30);

		// setting up JButton
		JButton calcularButton = new JButton();
		calcularButton.setText("Calcular");
		calcularButton.setBounds(200, 190, 180, 35);
		//
		JButton limparButton = new JButton();
		limparButton.setText("Limpar");
		limparButton.setBounds(0, 190, 180, 35);

		// setting up Jlist

		// click events

		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);
		
		scroll.setBounds(80, 300, 200, 250);
		
		
		calcularButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicado = Integer.parseInt(multiplicandoTextField.getText());
				tabuada.maxMultiplicador = Integer.parseInt(maxMultiplicadorTextField.getText());
				tabuada.minMultiplicador = Integer.parseInt(minMultiplicadorTextField.getText());
				
				String[] Resultado = tabuada.getTabuada();
				lista.setListData(Resultado);
				
				
				
				
			}
		});
		
		limparButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				maxMultiplicadorTextField.setText("");
				minMultiplicadorTextField.setText("");
				multiplicandoTextField.setText("");	
				lista.setVisible(false);
			}
		});
		
		multiplicandoTextField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		



		// setting up components to the panel
		painel.add(lblTabuada);
		painel.add(multiplicandoTextField);
		painel.add(maxMultiplicadorTextField);
		painel.add(minMultiplicadorTextField);
		painel.add(lblMultiplicando);
		painel.add(lblMaxMultiplicador);
		painel.add(lblMinMultiplicador);
		painel.add(lblResultado);
		painel.add(calcularButton);
		painel.add(limparButton);
		painel.add(scroll);
		

		tela.setVisible(true);

	}

}
