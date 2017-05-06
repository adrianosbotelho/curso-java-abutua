package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

//Não remova ou altere o nome do pacote!
//package curso2.capitulo3.exercicio11;

public class exercicio6{
	
	public static void main (String args[]){
		
		     double num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1"));
		     double num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2"));
		     double op  =Double.parseDouble(JOptionPane.showInputDialog("Digite a opção"));
		     
		
		     if(op==1)   
		       System.out.println(num1+num2);
		     else if(op==2)
		       System.out.println(num1*num2);
		     else if(op==3){
		       if (num1 > num2)
		         System.out.println(num1/num2);
		       else if (num2 > num1)
		         System.out.println(num2/num1);
		       else
		         System.out.println(1);  
		     }else if(op==4){
		       if (num1 > num2)
		         System.out.println(num1-num2);
		       else if (num2>num1)
		         System.out.println(num2-num1);  
		       else
		         System.out.println(0);
		      
		     }else
		       System.out.println("ERRO"); 
		     
		     
	}
	
	
}