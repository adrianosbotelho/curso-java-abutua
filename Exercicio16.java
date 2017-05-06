package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

public class Exercicio16{

	   public static void main(String args[]){
	 
		     double vpreco  = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco:"));
		     int vcategoria = Integer.parseInt(JOptionPane.showInputDialog("Informe a categoria (1-limpeza, 2-alimentação, 3-vestuário)"));
		     double vaumento=0, vprecon;
		     String vclassif;
		     
		     if(vpreco <=25){
		    	if(vcategoria ==1)
		    	  vaumento=5;
		    	else if(vcategoria ==2)
		    	  vaumento=8;
		    	else if (vcategoria==3)
		          vaumento=10;
		    	
		     }else{
		    	 if(vcategoria ==1)
		    		 vaumento=12;
		    	 else if(vcategoria ==2)
		    		 vaumento=15;
		    	 else if (vcategoria==3)
		    		 vaumento=18;
		    	 
		     }
		     
		    vprecon=vpreco + ((vpreco * vaumento)/100);
		     
		    if (vprecon <=50)
		    	vclassif = "BARATO";
		    else if (vprecon > 50 && vprecon < 120)
		    	vclassif = "NORMAL";
		    else
		    	vclassif = "CARO";
		    
		  System.out.println(vprecon);
		  System.out.println(vclassif);
		      	 
		     

            
	   }
	 }