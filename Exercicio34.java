package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio34{

	   public static void main(String args[]){
	 
	   
		   double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario inicial: ")); 
	       double aumento =1;
		   for(int i=1;i<=8;i++)
		   { 
			 if (i>1)  
			  aumento = aumento * 2;	 
		     salario = salario + ((salario * aumento)/100);
		   } 
		   System.out.println(salario);

	   }
	 }