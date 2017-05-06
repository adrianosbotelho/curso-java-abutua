package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio35{

	   public static void main(String args[]){
	 
	   
		   int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")); 

		   for(int i=1;i<=numero;i++)
		   {
			   if(numero%i==0)
			     System.out.println(i);   
		   } 
		   //System.out.println(salario);

	   }
	 }