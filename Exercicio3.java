package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

//Não remova ou altere o nome do pacote!
//package curso2.capitulo3.exercicio11;

public class exercicio3{
	
	public static void main (String args[]){
		
		
		 int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		 int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		 int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

		 
		 if(num1 < num2){
			 if (num1 < num3){	 
				 System.out.println(num1);
			 }else if (num2 < num3)
				 System.out.println(num2);
			 else
				 System.out.println(num3);
		 }else if(num2 < num3){
			 System.out.println(num2); 
		     
		 }else if(num3 < num1){
			 System.out.println(num3);
		 }
	}
	
	
}