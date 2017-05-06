package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio27{

	   public static void main(String args[]){
	 
		     int qtde = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de notas"));
		     double nota = 0, media=0;
		     int cont=0;

		     do{
		    	 
		       nota = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do numero:"));
		       media = media + nota;
		       cont = cont + 1;	 
		    	 
		     }while(cont < qtde);
		      media = (media/cont);
		      System.out.println(media);
     
            
	   }
	 }