package Familia51;

import java.util.Scanner;

public class questao2Aula3 {

	public static void main(String[] args) {
		// 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		//� Os n�meros pares digitados;  
		//� A soma dos n�meros pares digitados; 
		//� Os n�meros �mpares digitados; 
		//� A quantidade de n�meros �mpares digitados.
		
		int [] num = new int [6];
		int par=0,impar=0,somaPar=0,numImpar=0,quantImpar=0,x,linha=0,numnPar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<6;x++)
		{
			System.out.println("Entre com o numero "+ (x+1));
			num[linha] = leia.nextInt();
		}
		if (num[linha] %2 == 0)
		{
			System.out.println("\nOs numeros pares digitados foram: "+num[linha]);
			somaPar =+ par;
			System.out.println("\nSoma dos nuemros pares digitados"+somaPar);
		}
		else if (num[linha] %2 ==0)
		{
			somaPar =+ par;
			
		}
		else if (num[linha] % 2 != 0)
		{
			System.out.println("\nOs numeros pares digitados foram: "+num[linha]);
		}
		else
		{
			numImpar++;
		}

	}

}
