package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio32{

	   public static void main(String args[]){
	 
	     
	   
		   int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")); 
		   int b = a; 
		   int fator=1; 
		   for(int i=b;i>=2;i--)
		   { 
		     fator=fator*(i); 
		    } 
		   System.out.println(fator);

	   }
	 }