package atividades_Udemy;

import java.util.Scanner;

public class Atividade_1_Q5 {

	public static void main(String[] args) {
		// Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
		//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago

		Scanner sc = new Scanner(System.in);
		
		String codigo1,codigo2;
		double valorUnitario1,valorUnitario2,qnt1,qnt2,valorT;
		
		System.out.println("Entre com o c�digo da pe�a 1: ");
		codigo1 = sc.next();
		
		System.out.println("Entre com o c�digo da pe�a 2: ");
		codigo2 = sc.next();
		
		System.out.println("Entre com a quantidade de pe�as de "+codigo1);
		qnt1 = sc.nextDouble();
		
		System.out.println("Entre com a quantidade de pe�as de "+codigo2);
		qnt2 = sc.nextDouble();
		
		System.out.println("Entre com valor unit�rio da pe�a "+codigo1);
		valorUnitario1 = sc.nextDouble();
		
		System.out.println("Entre com valor unit�rio da pe�a  "+codigo2);
		valorUnitario2 = sc.nextDouble();
		
		valorT = (qnt1*valorUnitario1)+(qnt2*valorUnitario2);
		
		System.out.printf("\nVALOR A PAGAR: R$ %.2f",valorT);
		
		
		
		
		
		
	}

}
