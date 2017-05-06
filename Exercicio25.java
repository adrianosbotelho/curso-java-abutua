package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio25{

	   public static void main(String args[]){
	 
		     int divisor  = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do divisor:"));
		     int ini      = Integer.parseInt(JOptionPane.showInputDialog("Entre com o inicio do intervalo:"));
		     int fim      = Integer.parseInt(JOptionPane.showInputDialog("Entre com o fim do intervalo:"));

		     if (divisor ==0){
		    	 System.out.println("ERRO");
		     }
		     else{
		     while(ini <= fim){
		    	 
		    	 if ((ini%divisor)==0)
		    	   System.out.println(ini);
		         ini = ini + 1;	 
		     }       
			 //System.out.println(cont);
		     }
            
	   }
	 }