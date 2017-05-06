package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio23{

	   public static void main(String args[]){
	 
		     double sal1  = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario do funcionario 1:"));
		     double sal2  = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario do funcionario 2:"));
		     int cont = 0;

		     
		     while(sal2 <= sal1){
		    	 sal1 = sal1 + ((sal1 * 1.5)/100); 
		    	 sal2 = sal2 + ((sal2 * 4.0)/100);
		         cont = cont + 1;	 
		     }       
			 System.out.println(cont);
		   
            
	   }
	 }