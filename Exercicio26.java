package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio26{

	   public static void main(String args[]){
	 
		     int valor = 0; //Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do numero:"));
		     int total = 0;
		     boolean teste = true;

		     while(teste){
		      valor = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do numero:"));
		      total = total + valor;	     	        
		      if (valor == 0)
		    	 teste=false;
		     }
		     System.out.println(total);
            
	   }
	 }