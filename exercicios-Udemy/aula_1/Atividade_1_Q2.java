package atividades_Udemy;

import java.util.Scanner;

public class Atividade_1_Q2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = . raio2
		//Considere o valor de  = 3.14159
		
		double area,pI=3.14159,raio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pI * (Math.pow(raio,2.0));
		
		System.out.printf("\nA ÁREA DA CIRCUNFERÊNCIA É DE: %.4f",area);

	}

}
