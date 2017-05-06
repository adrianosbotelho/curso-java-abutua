package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio20{

	   public static void main(String args[]){
	 
		     int diasemana = Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia da semana (1-7)"));
		     int diames    = Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia do mes (1-31)"));
		     int mes       = Integer.parseInt(JOptionPane.showInputDialog("Entre com o mes (1-12)"));
		     int ano       = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano"));
		     String erro=null;
		     String data=null;
		     
		     
		     switch(diasemana){
    		      case 1: data = "Segunda-feira"; break;
    		      case 2: data = "Terça-feira";break;
    		      case 3: data = "Quarta-feira";break;
    		      case 4: data = "Quinta-feira";break;
    		      case 5: data = "Sexta-feira";break;
    		      case 6: data = "Sabado";break;
    		      case 7: data = "Domingo";break;
  			      default: erro = "ERRO"; break;
  			    //break;  
		     }
		     
		     if(erro==null){
		    	 
		      if (diames < 1 || diames >31)
				 erro = "ERRO";
			  else
				 data = data + ", dia "+diames;
		     } 
		     
		     
		     switch(mes){
		      case 1: data = data +" de Janeiro"; break;
		      case 2: data = data +" de Fevereiro";break;
		      case 3: data = data +" de Março";break;
		      case 4: data = data +" de Abril";break;
		      case 5: data = data +" de Maio";break;
		      case 6: data = data +" de Junho";break;
		      case 7: data = data +" de Julho";break;
		      case 8: data = data +" de Agosto";break;
		      case 9: data = data +" de Setembro";break;
		      case 10: data = data +" de Outubro";break;
		      case 11: data = data +" de Novembro";break;
		      case 12: data = data +" de Dezembro";break;
     	      default: erro = "ERRO"; break;   
	     }
         if(erro==null){   	 
        	 if (ano < 1900 || ano >9999)
        		 erro = "ERRO";
        	 else
        		 data = data + " de "+ano;
         } 
		 
		 
		 if(erro==null)
			 System.out.println(data);
		 else
			 System.out.println(erro);
		     
		     
		   
            
	   }
	 }