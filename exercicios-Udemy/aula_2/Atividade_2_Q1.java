package atividades_Udemy;

import java.util.Scanner;

public class Atividade_2_Q1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Entre com um numero inteiro: ");
		x = sc.nextInt();
		
		if (x>0)
		{
			System.out.println("NUMERO POSITIVO");
		}
		else 
		{
			System.out.println("NUMERO NEGATIVO");
		}
	}

}
