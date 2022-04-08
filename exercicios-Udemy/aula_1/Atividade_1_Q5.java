package atividades_Udemy;

import java.util.Scanner;

public class Atividade_1_Q5 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

		Scanner sc = new Scanner(System.in);
		
		String codigo1,codigo2;
		double valorUnitario1,valorUnitario2,qnt1,qnt2,valorT;
		
		System.out.println("Entre com o código da peça 1: ");
		codigo1 = sc.next();
		
		System.out.println("Entre com o código da peça 2: ");
		codigo2 = sc.next();
		
		System.out.println("Entre com a quantidade de peças de "+codigo1);
		qnt1 = sc.nextDouble();
		
		System.out.println("Entre com a quantidade de peças de "+codigo2);
		qnt2 = sc.nextDouble();
		
		System.out.println("Entre com valor unitário da peça "+codigo1);
		valorUnitario1 = sc.nextDouble();
		
		System.out.println("Entre com valor unitário da peça  "+codigo2);
		valorUnitario2 = sc.nextDouble();
		
		valorT = (qnt1*valorUnitario1)+(qnt2*valorUnitario2);
		
		System.out.printf("\nVALOR A PAGAR: R$ %.2f",valorT);
		
		
		
		
		
		
	}

}
