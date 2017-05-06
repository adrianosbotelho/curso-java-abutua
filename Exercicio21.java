package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio21{

	   public static void main(String args[]){
	 
		     int figura  = Integer.parseInt(JOptionPane.showInputDialog("Entre com a figura (1-3)"));
		     double base = 0, raio = 0, lado, altura=0;
		     double resultado=0;
             String erro = null;		     
		     
		     switch(figura){
    		      case 1: 
    		    	    raio = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do raio:"));
    		    	    resultado = Math.pow(raio, 2) * 3.14;//Math.PI;
    		    	    break;
    		      case 2: 
    		    	   lado = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do lado:"));
    		    	   resultado = Math.pow(lado, 2);
    		    	   break;
    		      case 3: 
    		    	     base   =  Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do base:"));
    		    	     altura =  Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do altura:"));
    		    	     resultado = (base * altura)/2;
    		    	     break;
  			      default: erro = "ERRO"; break;
  
		     }
		     
		 if(erro==null)
			 System.out.println(resultado);
		 else
			 System.out.println(erro);
		     
		     
		   
            
	   }
	 }