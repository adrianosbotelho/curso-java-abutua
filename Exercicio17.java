package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio17{

	   public static void main(String args[]){
	 
		     double vnum1  = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero1:"));
		     double vnum2  = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero2:"));
		     int vopcao    = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção (1,2,3,4)"));
		     
		     switch(vopcao){
		      case 1: System.out.println(vnum1+vnum2);break;
		      case 2: System.out.println(vnum1*vnum2); break;
		      case 3: 
		    	  if (vnum1 > vnum2)
		    		 if (vnum2!=0) 
		    		    System.out.println(vnum1/vnum2); 
		    		 else
		    		   System.out.println("ERRO");	 
		    	  else
		    		 if (vnum1 != 0)  
     	    		   System.out.println(vnum2/vnum1);
		    		 else
		    		   System.out.println("ERRO");	 
		    	  break;
		      case 4:	  
		    	  if (vnum1 > vnum2)
		    	    System.out.println(vnum1-vnum2);
			   	  else
			   		System.out.println(vnum2-vnum1);
			      break;
			      
			  default: System.out.println("ERRO");    
		     }
		     
		   
            
	   }
	 }