package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio24{

	   public static void main(String args[]){
	 
		     int num1  = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do primeiro numero:"));
		     int num2  = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do segundo numero:"));
		     int cont = 0;

		     
		     while(num1 <= num2){
		    	 
		    	 System.out.println(num1);
		         num1 = num1 + 1;	 
		     }       
			 //System.out.println(cont);
		   
            
	   }
	 }