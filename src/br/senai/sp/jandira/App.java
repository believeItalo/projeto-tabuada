package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Tabuada;

public class App {
	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		tabuada.maxMultiplicador = 14;
		tabuada.multiplicado = 2;
		tabuada.minMultiplicador = 8;
		
		String[] resultado = tabuada.getTabuada();
		System.out.println(resultado[0]);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	


}
