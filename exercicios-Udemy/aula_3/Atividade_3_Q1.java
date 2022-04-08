package atividades_Udemy;

import java.util.Scanner;

public class Atividade_3_Q1 {

	public static void main(String[] args) {
		//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		int senha;
		
		Scanner sc = new Scanner(System.in);
		
		senha = sc.nextInt();
		
		while (senha != 2002)
		{
			System.out.println("SENHA INVALIDA");
			senha = sc.nextInt();
		}
		System.out.println("ACESSO PERMITIDO");

	}

}
