package atividades_Udemy;

import java.util.Scanner;

public class Atividade_1_Q3 {

	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
		//de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
		
		int A,B,C,D;
		double diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero A: ");
		A = sc.nextInt();
		
		System.out.println("Entre com o segundo n�mero B: ");
		B = sc.nextInt();
		
		System.out.println("Entre com o terceiro n�mero C: ");
		C = sc.nextInt();
		
		System.out.println("Entre com o quarto n�mero D: ");
		D = sc.nextInt();
		
		diferenca = ((A*B)-(C*D));
		
		System.out.println("\nDIFEREN�A = "+diferenca);

	}

}
