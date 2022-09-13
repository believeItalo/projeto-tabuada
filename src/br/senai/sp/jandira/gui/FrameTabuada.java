package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
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

import br.senai.sp.jandira.model.JtextFieldSomenteNumeros;
import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {
	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Color corDoTexto;
	public Color corTextoBotao;
	public Color corDoBotao;
	

	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		Container painel = tela.getContentPane();
		tela.getContentPane().setBackground(corDeFundoDaTela);
		
		//ImageIcon icon = new ImageIcon("src/br/senai/sp/jandira/images/info24.png");

//		JLabel lblIcon = new JLabel(icon);
//		lblIcon.setBounds(10, 10, 50, 50);
//		
		
		
		// setting up label
		JLabel lblTabuada = new JLabel();
		lblTabuada.setText("Tabuada");
		lblTabuada.setBounds(10, 10, 200, 30); // x y w h
		lblTabuada.setFont(new Font("Courier new", Font.BOLD, 32));
		lblTabuada.setForeground(corDoTexto);

		//
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando");
		lblMultiplicando.setBounds(10, 50, 200, 30);
		lblMultiplicando.setFont(new Font("Courier new", Font.BOLD, 16));
		lblMultiplicando.setForeground(corDoTexto);
		//
		JLabel lblMaxMultiplicador = new JLabel();
		lblMaxMultiplicador.setText("Máx Multiplicador");
		lblMaxMultiplicador.setBounds(10, 90, 200, 30);
		lblMaxMultiplicador.setFont(new Font("Courier new", Font.BOLD, 16));
		lblMaxMultiplicador.setForeground(corDoTexto);

		//
		JLabel lblMinMultiplicador = new JLabel();
		lblMinMultiplicador.setText("Min Multiplicador");
		lblMinMultiplicador.setBounds(10, 130, 200, 30);
		lblMinMultiplicador.setFont(new Font("Courier new", Font.BOLD, 16));
		lblMinMultiplicador.setForeground(corDoTexto);
		//
		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultado :");
		lblResultado.setBounds(50, 270, 200, 30);
		lblResultado.setFont(new Font("Courier new", Font.BOLD, 16));
		lblResultado.setForeground(corDoTexto);
		// setting up text fields

		JTextField multiplicandoTextField = new JtextFieldSomenteNumeros();
		multiplicandoTextField.setBounds(200, 50, 150, 30);
		//
		JTextField maxMultiplicadorTextField = new JtextFieldSomenteNumeros();
		maxMultiplicadorTextField.setBounds(200, 90, 150, 30);
		//
		JTextField minMultiplicadorTextField = new JtextFieldSomenteNumeros();
		minMultiplicadorTextField.setBounds(200, 130, 150, 30);

		// setting up JButton
		JButton calcularButton = new JButton();
		calcularButton.setText("Calcular");
		calcularButton.setBounds(200, 190, 180, 55);
		calcularButton.setBackground(corDoBotao);
		calcularButton.setForeground(corTextoBotao);
		//
		JButton limparButton = new JButton();
		limparButton.setText("Limpar");
		limparButton.setBounds(3, 190, 180, 55);
		limparButton.setBackground(corDoBotao);
		limparButton.setForeground(corTextoBotao);

		// setting up Jlist

		// click events

		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);

		scroll.setBounds(80, 300, 200, 250);

		calcularButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				
				if (multiplicandoTextField.getText().isEmpty() || maxMultiplicadorTextField.getText().isEmpty() || minMultiplicadorTextField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos de texto", "Erro", 0);
				} else {
					tabuada.multiplicado = Integer.parseInt(multiplicandoTextField.getText());
					tabuada.maxMultiplicador = Integer.parseInt(maxMultiplicadorTextField.getText());
					tabuada.minMultiplicador = Integer.parseInt(minMultiplicadorTextField.getText());
					
					if (tabuada.maxMultiplicador >= tabuada.minMultiplicador) {
						String[] Resultado = tabuada.getTabuada();
						lista.setListData(Resultado);
					} else {
						JOptionPane.showMessageDialog(null, "O máximo deve ser maior que o mínimo!!");
					}
					
					
				}
				
				
				
				

				

			}
		});

		limparButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tabuada tabuada = new Tabuada();
				maxMultiplicadorTextField.setText("");
				minMultiplicadorTextField.setText("");
				multiplicandoTextField.setText("");

				String[] Vazio = { "" };
				lista.setListData(Vazio);

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
		//painel.add(lblIcon);
		
		

		tela.setVisible(true);

	}

}
