package Familia51;

import java.util.Scanner;

public class questao2Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0,x;
		float somaPar=0,somaImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nEntre com um numero");
			num = leia.nextInt();
			
			if (num % 2 == 0)
			{
				somaPar++;
			}
				
			else
			{
				somaImpar++;
			}

		}
		System.out.printf("\nNumero de pares:  %2.2f",somaPar);
		System.out.printf("\nNumero de impares:  %2.2f",somaImpar);

	}

}
