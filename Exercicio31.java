package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio31{

	   public static void main(String args[]){
	 
		     
		     int ini = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero inteiro inicial:"));
		     int fim = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero inteiro inicial:"));
             int aux=0;
             for(int x = ini; ini <= fim; ini++)
             {
            	aux = aux + ini; 
            	 
             }
             System.out.println(aux);
	   }
	 }