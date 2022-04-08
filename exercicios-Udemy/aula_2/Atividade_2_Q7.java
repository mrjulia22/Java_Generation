package atividades_Udemy;

import java.util.Scanner;

public class Atividade_2_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com o primeiro numero: ");
		x = sc.nextInt();
		
		System.out.println("entre com o segundo numero: ");
		y = sc.nextInt();
		
		
		if (x > 0 && y < 0)
		{
			System.out.println("Q4");
		}
		else if (x < 0 && y < 0)
		{
			System.out.println("Q3");
		}
		else if (x < 0 && y > 0)
		{
			System.out.println("Q2");
		}
		else if (x >0 && y > 0)
		{
			System.out.println("Q1");
		}
		else
		{
			System.out.println("ORIGEM");
		}
	}

}
