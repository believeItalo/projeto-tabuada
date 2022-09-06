package br.senai.sp.jandira.model;

public class Tabuada {
	
	//setting up objects 

	public int multiplicado;
	public int minMultiplicador;
	public int maxMultiplicador;
	
	//setting up functions (behavior) meu código "99%certo"
//	public void getTabuada() {
//		maxMultiplicador++;
//		while(maxMultiplicador != minMultiplicador) {
//      maxMultiplicador--;
//      System.out.print(multiplicado +" X "+ maxMultiplicador + " = ");
//		System.out.print(multiplicado * (maxMultiplicador));
//		System.out.println();
	
	//código do Prof Celso
 public String[] getTabuada(){
	 int tamanho = maxMultiplicador - minMultiplicador +1;
	 String tabuada [] = new String[tamanho];
	 int contador = 0;
	 while(contador < tamanho) {
		 
		 int produto = multiplicado * minMultiplicador;
		 
		 String resultado = multiplicado + " X " + minMultiplicador + " = " + produto;
		 
		 tabuada[contador] = resultado;
		 contador++;
		 minMultiplicador++;
	 
	  }
	
		return tabuada;
		
		
		
		
	}
	


	
	
	
	
	
	
	
	

}
