package atividades_Udemy;

import java.util.Scanner;

public class Atividade1_Q6 {

	public static void main(String[] args) {
		// Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
		//mostre:
		//	a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		//	b) a �rea do c�rculo de raio C. (pi = 3.14159)
		//	c) a �rea do trap�zio que tem A e B por bases e C por altura.
		//	d) a �rea do quadrado que tem lado B.
		//	e) a �rea do ret�ngulo que tem lados A e B.
		
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
		
		System.out.printf("\nTRIN�NGULO: %.3f",areaTriangulo);
		System.out.printf("\nCIRCULO: %.3f",areaCirculo);
		System.out.printf("\nTRAP�ZIO: %.3f",areaTrapezio);
		System.out.printf("\nQUADRADO: %.3f",areaQuadrado);
		System.out.printf("\nRET�NGULO: %.3f",areaRetangulo);
		
		

	}

}
