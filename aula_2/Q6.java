package Familia51;

import java.util.Scanner;

public class questao6Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somaMult3=0,contMult3=0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
			if(numero == 0)
			{
				System.out.println("\nVocê digitou zero, vamos finalizar o processo!!0");
				
			}
			else
			{
				if(numero %3==0)
				{
					somaMult3 += numero;
					contMult3++;
				}
			}
		}
		while(numero!=0);
		media = somaMult3 / contMult3;
		System.out.printf("\nmédia dos números múltiplos de 3: %6.2f",media);

	}

}
