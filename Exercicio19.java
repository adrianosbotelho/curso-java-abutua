package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio19{

	   public static void main(String args[]){
	 
		     //double valor  = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:"));
		     int jogador1    = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção (1-Pedra,2-Papel,3-Tesoura)"));
		     int jogador2    = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção (1-Pedra,2-Papel,3-Tesoura)"));
		     
		     switch(jogador1){
    		      case 1: 
    		    	     switch(jogador2){
    		    	       case 1: System.out.println("EMPATOU"); break;
    		    	       case 2: System.out.println("PERDEU"); break;
    		    	       case 3: System.out.println("GANHOU"); break;
    		    	       default: System.out.println("ERRO");
    		    	     }	   	   
    		    	     break;  
    		        
    		      case 2:
 		    	     switch(jogador2){
 		    	       case 1: System.out.println("GANHOU"); break;
 		    	       case 2: System.out.println("EMPATOU"); break;
 		    	       case 3: System.out.println("PERDEU"); break;
 		    	       default: System.out.println("ERRO");
 		    	     
 		           }
 		    	   break;  
 		    	     
    		      case 3:
  		    	     switch(jogador2){
  		    	       case 1: System.out.println("PERDEU"); break;
  		    	       case 2: System.out.println("GANHOU"); break;
  		    	       case 3: System.out.println("EMPATOU"); break;
  		    	       default: System.out.println("ERRO");
  		    	     
  		           }
  		    	   break;  
  			     default: System.out.println("ERRO");    
		     }
		     
		   
            
	   }
	 }