package atividades_Udemy;

import java.util.Scanner;

public class Atividade_1_Q2 {

	public static void main(String[] args) {
		// Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
		//casas decimais conforme exemplos.
		//F�rmula da �rea: area = . raio2
		//Considere o valor de  = 3.14159
		
		double area,pI=3.14159,raio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pI * (Math.pow(raio,2.0));
		
		System.out.printf("\nA �REA DA CIRCUNFER�NCIA � DE: %.4f",area);

	}

}
