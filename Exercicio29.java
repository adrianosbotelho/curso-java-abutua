package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio29{

	   public static void main(String args[]){
	 
		     int num=0, conj125=0, conj2650=0, conj5175=0,conj76100=0;

		     do{
		    	 
		       num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do numero:"));
		       
		       if(num >=1 && num<=25)
		    	 conj125++;// = conj125 + num;
		       else if (num >=26 && num<=50)
		    	 conj2650++;// = conj2650 + num;
		       else if (num >=51 && num<=75)
		    	 conj5175++;// = conj5175 + num;
		       else if (num >=76 && num<=100)
		    	 conj76100++;// = conj76100 + num;      
		       
		    	 
		     }while(num !=0);
		      System.out.println(conj125);
		      System.out.println(conj2650);
		      System.out.println(conj5175);
		      System.out.println(conj76100);
     
            
	   }
	 }