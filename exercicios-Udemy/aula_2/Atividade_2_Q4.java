package atividades_Udemy;

import java.util.Scanner;

public class Atividade_2_Q4 {
	
	public static void main(String[] args) {
		
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
		//come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("\nDigite a hora incial do jogo: ");
		horaInicial = sc.nextInt();
		
		System.out.println("\nDigite a hora final do jogo: ");
		horaFinal = sc.nextInt();
		
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");	
		
		
	}

}
