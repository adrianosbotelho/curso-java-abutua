package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

//Não remova ou altere o nome do pacote!
//package curso2.capitulo3.exercicio12;

public class Exercicio12{

	   public static void main(String args[]){
	 
	     double a=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da variaval a:"));
	     double b=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da variavel b:"));
	     double c=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da variavel c:"));
	     double delta=0, x=0,x1=0,x2=0;
	     //double raiz=0; 
	      //;
	     

	     if (a==0){
	       System.out.println("ERRO");
	     }else{
	       delta=(b*b)-(4*a*c);
	       if (delta<0){
	        System.out.println("ERRO");
	       }else if(delta==0)
	         x=-b/(2*a);    
	        else if(delta>0){      
	          x1=(-b + Math.sqrt(delta))/(2*a);
	          x2=(-b - Math.sqrt(delta))/(2*a);
	          System.out.println(x1);
	          System.out.println(x2);
	        }
	    
	     }  
	     


	   }
	 }