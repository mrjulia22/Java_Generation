package atividades_Udemy;

import java.util.Scanner;

public class Atividade_4_Q2 {

	public static void main(String[] args) {
		//Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		//Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
		//essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		
		int N,in=0,out=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("entre com o numero N:");
		N = sc.nextInt();
		
		for (int i=0;i<N;i++){
			int x = sc.nextInt();
			if (x>=10 && x<=20){
				in++;
			}
			else{
				out++;
			}
			
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
	}

}
