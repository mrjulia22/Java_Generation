package atividades_Udemy;

import java.util.Scanner;

public class Atividade_3_Q2 {

	public static void main(String[] args) {
		//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
		
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com a coordenada X:");
		x = sc.nextInt();
		
		System.out.println("entre com a coordenada Y:");
		y = sc.nextInt();
		
		while (x != 0 && y!= 0)
		{
			if (x>0 && y>0)
			{
				System.out.println("quadrante 1");
			}
			else if (x>0 && y<0)
			{
				System.out.println("quadrante 1");
			}
			else if (x<0 && y>0)
			{
				System.out.println("quadrante 1");
			}
			else
			{
				System.out.println("quadrante 1");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("\nNULA");

	}

}
