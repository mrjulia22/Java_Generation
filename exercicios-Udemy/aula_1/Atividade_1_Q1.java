package atividades_Udemy;

import java.util.Scanner;

public class Atividade_1_Q1 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
		//desses números com uma mensagem explicativa, conforme exemplos.

		Scanner sc = new Scanner(System.in);
		
		int x,y,soma;
		
		System.out.println("Entre com o primiero número: ");
		x = sc.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		y = sc.nextInt();
		
		
		soma = x + y;
		
		System.out.println("SOMA = "+soma);
		
		
	}

}
