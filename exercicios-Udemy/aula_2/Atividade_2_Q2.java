package atividades_Udemy;

import java.util.Scanner;

public class Atividade_2_Q2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Entre com um inteiro: ");
		x = sc.nextInt();
		
		if (x%2==0)
		{
			System.out.println("NUMERO PAR");
			
		}
		else
		{
			System.out.println("NUMEOR IMPAR");
		}
		

	}

}
