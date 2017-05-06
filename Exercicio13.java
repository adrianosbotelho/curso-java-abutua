package app;

import javax.swing.JOptionPane;

/*
Autor: Adriano Silva Botelho
Email: adrianosbotelho@gmail.com
*/

//Não remova ou altere o nome do pacote!
//package curso2.capitulo3.exercicio12;

public class Exercicio13{

	   public static void main(String args[]){
	 
		     int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto:"));
		     int qtde   = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:"));
		     double preco=0, total=0, desc=0,totdesc=0;

		     if (codigo >=1 && codigo <=10)
		     {
		       preco = 10;
		       total = qtde * preco;
		       if (total< 250)
		         desc = (total * 5)/100;
		       else if (total>=250 && total <500)
		         desc = (total * 10)/100;
		       else if (total>=500)
		         desc = (total * 15)/100;
		       totdesc = total - desc;
		       System.out.println("Preço unitario: "+ preco);
		       System.out.println("Valor Total da NF: "+ total);
		       System.out.println("Valor do desconto: "+ desc);
		       System.out.println("Total da NF com desconto: "+ totdesc);
		       
		       
		     }

	   }
	 }