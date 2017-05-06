package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

//Não remova ou altere o nome do pacote!
//package curso2.capitulo3.exercicio12;

public class Exercicio15{

	   public static void main(String args[]){
	 
		     int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da transportadora:"));
		     double peso  = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da carga:"));
		     int uf    = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da UF"));
		     double preco=0, imposto=0, cargaliq=0, cargaimp=0;
		     
		     if(codigo >=1 && codigo <=5)
		    	 preco = 10;
		     else if (codigo >=6 && codigo <=10)
		    	 preco = 15;
		     else if (codigo >=11 && codigo <=15)
		    	 preco = 25;
		     
		     if (uf ==1)
		    	 imposto=0;
		     else if (uf==2)
		    	 imposto=7;
		     else if(uf==3)
		    	 imposto=15;
		     else if(uf==4)
		    	 imposto=25;
		     
		     cargaliq=(peso * preco);
		     imposto = (cargaliq*imposto)/100;
		     cargaimp = cargaliq+imposto;
		     
		     System.out.println("preco da carga: "+cargaliq);
		     System.out.println("valor do imposto: "+imposto);
		     System.out.println("preco da carga c/ imposto: "+cargaimp);
		     
		      	 
		     
	         //int vetor[] = {num1, num2, num3};  
		     /*boolean troca = true;
	         int aux;
	         
	         //BubbleSort
	         while (troca) {
	             troca = false;
	             for (int i = 0; i < vetor.length - 1; i++) {
	                 if (vetor[i] > vetor[i + 1]) {
	                     aux = vetor[i];
	                     vetor[i] = vetor[i + 1];
	                     vetor[i + 1] = aux;
	                     troca = true;
	                 }
	             }
	         }
	                
	         
		   //le dados do usuario  
		   for(int i=0; i < vetor.length; i++)  
		   {  
             System.out.println(vetor[i]);
		   }  
		    */ 
            
	   }
	 }