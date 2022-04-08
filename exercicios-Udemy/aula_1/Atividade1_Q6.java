package atividades_Udemy;

import java.util.Scanner;

public class Atividade1_Q6 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
		//	a) a área do triângulo retângulo que tem A por base e C por altura.
		//	b) a área do círculo de raio C. (pi = 3.14159)
		//	c) a área do trapézio que tem A e B por bases e C por altura.
		//	d) a área do quadrado que tem lado B.
		//	e) a área do retângulo que tem lados A e B.
		
		double A,B,C,areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo,pi=3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A:");
		A = sc.nextDouble();
		
		System.out.println("\nEntre com o valor de B:");
		B = sc.nextDouble();
		
		System.out.println("\nEntre com o valor de C:");
		C = sc.nextDouble();
		
		areaTriangulo = (A*C)/2;
		areaCirculo = pi *(Math.pow(C,2.0));
		areaTrapezio = ((A*B)*C)/2;
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A*B;
		
		System.out.printf("\nTRINÂNGULO: %.3f",areaTriangulo);
		System.out.printf("\nCIRCULO: %.3f",areaCirculo);
		System.out.printf("\nTRAPÉZIO: %.3f",areaTrapezio);
		System.out.printf("\nQUADRADO: %.3f",areaQuadrado);
		System.out.printf("\nRETÂNGULO: %.3f",areaRetangulo);
		
		

	}

}
