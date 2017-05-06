package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

//Não remova ou altere o nome do pacote!
//package curso2.capitulo3.exercicio12;

public class Exercicio14{

	   public static void main(String args[]){
	 
		     int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));
		     int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));
		     int num3 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));     
	         int vetor[] = {num1, num2, num3};  
		     boolean troca = true;
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
		     

	   }
	 }