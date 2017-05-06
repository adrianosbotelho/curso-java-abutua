package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio33{

	   public static void main(String args[]){
	 
	     
	   
		   int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")); 
		   int aux = numero; 
		   int fator=1;
		   if (numero >= 0 )
		   {	   
			   for(int i=aux;i>=2;i--)
			   { 
				   fator=fator*(i); 
			   } 
			   System.out.println(fator);
		   }else
			 System.out.println("ERRO");   

	   }
	 }