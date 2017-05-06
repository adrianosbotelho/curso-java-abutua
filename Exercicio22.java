package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio22{

	   public static void main(String args[]){
	 
		     int qtde  = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade funcionarios:"));
		     double total = 0, salario = 0;
		     int cont = 0;

		     
		     while(cont < qtde){
		    	 salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario do funcionario:"));
		    	 total = total + salario;
		         cont = cont + 1;	 
		     }
		     total = total / qtde;         
			 System.out.println(total);
		   
            
	   }
	 }