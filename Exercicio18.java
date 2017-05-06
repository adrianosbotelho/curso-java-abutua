package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio18{

	   public static void main(String args[]){
	 
		     double valor  = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:"));
		     int codigo    = Integer.parseInt(JOptionPane.showInputDialog("Informe a codigo do aumento (1,2,3,4,5)"));
		     
		     switch(codigo){
    		      case 1: System.out.println(valor + (valor * 5)/100);break;
	     	      case 2: System.out.println(valor + (valor * 7)/100); break;
		          case 3: System.out.println(valor + (valor * 10)/100); break;
		          case 4: System.out.println(valor + (valor * 15)/100); break;
		          case 5: System.out.println(valor + (valor * 17)/100); break;
			   default: System.out.println("ERRO");    
		     }
		     
		   
            
	   }
	 }