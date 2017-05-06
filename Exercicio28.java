package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio28{

	   public static void main(String args[]){
	 
		     int num=0, par=0, impar=0;// = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de notas"));

		     do{
		    	 
		       num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do numero:"));
		       if((num%2)==0)
		    	  par=par+num;
		       else
		    	  impar=impar+num; 
		    	 
		     }while(num !=0);
		      System.out.println(par);
		      System.out.println(impar);
     
            
	   }
	 }