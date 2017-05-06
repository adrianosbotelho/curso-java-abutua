package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio30{

	   public static void main(String args[]){
	 
		     
		     double salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do salario:"));
		     double quilowatts=0, precok=0, total=0;
		     int    consumidor, qtdeconsumidor=0;
		     
		     precok=salario*0.125;
		     System.out.println(precok);

		     do{
		    	 
		    	 quilowatts = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade de quilowatts:"));
		    	 if(quilowatts>0)
		    	 {
		    		 consumidor = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tipo de consumidor:"));
		    	
		    		 switch(consumidor)
		    		 {
		    		   case 1 : total = (quilowatts * precok) * 1.05;
		    		            System.out.println(total);
   	    				        if (total >=500 && total <=1000)
		    				      qtdeconsumidor++;
		    		            break;
		    		    case 2 : total = (quilowatts * precok) * 1.10;
    	    		             System.out.println(total);
   	    				         if (total >=500 && total <=1000)
		    				       qtdeconsumidor++;
		    		             break;
		    		    case 3 : total = (quilowatts * precok) * 1.15;
		    		             System.out.println(total);
   	    				         if (total >=500 && total <=1000)
		    				       qtdeconsumidor++;
		    		             break;
		    	     }
		          }
    	 
		     }while(quilowatts !=0);      		      
		      System.out.println(qtdeconsumidor);
     
            
	   }
	 }