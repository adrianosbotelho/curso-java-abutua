package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

//Não remova ou altere o nome do pacote!
//package curso2.capitulo3.exercicio11;

public class exercicio8{
	
	
      static double CalculaPreco(int pregiao, double ppreco){
        
    	double norte=2.33, sul=1.5, leste=3.5, oeste=4.2;
        double aliq=0;
        
        if (pregiao==1)
          aliq= norte;
        else if(pregiao==2)
          aliq= sul;
        else if (pregiao==3)
          aliq=leste;
        else if (pregiao==4)
          aliq=oeste; 	
        else
          aliq=0;
        
    	return ppreco = ppreco + (ppreco * aliq)/100;
    	
    }
      
      static String Regiao(int pregiao){
    	  
    	  String vregiao="";
    	  if (pregiao==1)
    		  vregiao = "NORTE";
    	  else if (pregiao==2)
    		  vregiao ="SUL";  		   
    	  else if (pregiao==3)
    		  vregiao ="LESTE";  
    	  else if (pregiao==4)
    		  vregiao ="OESTE";  
    	  return vregiao;	  
  	  
      }
	
	public static void main (String args[]){
		
		  int codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da regiao:"));
		  double preco=Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto:"));
		      
          if (codigo >=1 && codigo <=4){
		    System.out.println(CalculaPreco(codigo,preco));
		    System.out.println(Regiao(codigo));  
          }else
        	System.out.println("ERRO"); 
	     
	}		
	
}