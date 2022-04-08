package atividades_Udemy;

import java.util.Scanner;

public class Atividade_1_Q3 {

	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		int A,B,C,D;
		double diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número A: ");
		A = sc.nextInt();
		
		System.out.println("Entre com o segundo número B: ");
		B = sc.nextInt();
		
		System.out.println("Entre com o terceiro número C: ");
		C = sc.nextInt();
		
		System.out.println("Entre com o quarto número D: ");
		D = sc.nextInt();
		
		diferenca = ((A*B)-(C*D));
		
		System.out.println("\nDIFERENÇA = "+diferenca);

	}

}
