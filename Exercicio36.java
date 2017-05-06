package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
Capitulo 10: Exercicio 06
*/

public class Exercicio36{

	   public static void main(String args[]){
	 
	   
		   String sexo; //= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		   double altura=0, peso=0, temp=0;
		   int m=0, f=0, linha=5, coluna=5;
		   double myList[]= new double[5];
		   double laltura[] = new double[5];
		   String lsexo[]= new String[5];
		   String aux;
		   boolean troca=true;
		   
		   	   

		   for(int i=0;i<myList.length;i++)
		   {
			   
			 peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso:"));
			 sexo = JOptionPane.showInputDialog("Informe o sexo (M ou F): ");  
			 //altura = Double.parseDouble("Informe a altura(em cm):");
			   
			  myList[i] = peso;
			  laltura[i] = altura;
			  lsexo[i]=sexo;
			   
			   if (sexo.equals("M"))
	   		     m++;
			   else
				 f++;
		 
			   
		   }
		   
		   while (troca) {
	             troca = false;
	             for (int i = 0; i < myList.length - 1; i++) {
	                 if (myList[i] > myList[i + 1]) {
	                     temp = myList[i];
	                     aux=lsexo[i];
	                     myList[i] = myList[i + 1];
	                     lsexo[i]= lsexo[i + 1];
	                     myList[i + 1] = temp;
	                     lsexo[i + 1]= aux;
	                     troca = true;
	                 }
	                 
	             }
	         }

		   //le dados do usuario  
		   for(int i=0; i < myList.length; i++)  
		   {  
             System.out.println(myList[i]);
             System.out.println(lsexo[i]);
		   }  

	   }
	 }