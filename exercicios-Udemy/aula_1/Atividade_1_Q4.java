package atividades_Udemy;

import java.util.Scanner;

public class Atividade_1_Q4 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.

		String funcionario;
		int horasT, valorH,salarioT;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEntre com o nome do funcionario: ");
		funcionario = sc.next();
		
		System.out.println("\nEntre com o total de horas trabalhadas: ");
		horasT = sc.nextInt();
		
		System.out.println("\nEntre com o valor da hora de trabalho: ");
		valorH= sc.nextInt();
		
		salarioT = horasT * valorH;
		
		System.out.println("\nNUMBER: "+horasT+ "\nSALARY: " +salarioT);
		
		
		
	}

}
