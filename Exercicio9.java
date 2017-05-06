package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

//Não remova ou altere o nome do pacote!
//package curso2.capitulo3.exercicio11;

public class exercicio9{
	
	 public static void main(String args[]){	
	
	  double nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1"));
	    double nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2"));
	    double nota3=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota3"));
	    double nota4=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota4"));
	    double media=0;

	    media=(nota1+nota2+nota3+nota4)/4;

	    if (media >= 9 && media <=10)
	      System.out.println("MB");
	    else if (media>=7 && media<9)
	      System.out.println("B");
	    else if (media>=0 && media<7)
	      System.out.println("R");
	    
	 }	    
	
}