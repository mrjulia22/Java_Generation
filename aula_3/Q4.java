package Familia51;

import java.util.Scanner;

public class questao4Aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [][] matriz1 = new float [2][2];
		float [][] matriz2 = new float [2][2];
		float [][] matriz3 = new float [2][2];
		int i,j,op=0;
		float numero;
		
		Scanner leia = new Scanner (System.in);
		
		for (i=0;i<2;i++)
		{
			for (j=0;j<2;j++)
			{
				System.out.println("\nEntre com o valor da Matriz 1: ");
				matriz1[i][j] = leia.nextFloat();
				
			}
		}
		
		do
		{
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1-Somar as duas matrizes");
			System.out.println("\n2-Subtrair a primeira matriz da segunda");
			System.out.println("\n3-Adicionar uma constante as duas matrizes");
			System.out.println("\n4-Imprimir as matrizes");
			System.out.println("\n0-Sair do programa");
			System.out.println("\nDigite sua opção: ");
		
			switch(op)
			{
			case 1:
				for (i=0;i<2;i++)
				{
					for (j=0;j<2;j++)
					{
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\nSoma das matrizes: "+matriz3);
					}
				}
				break;
			case 2:
				for (i=0;i<2;i++)
				{
					for (j=0;j<2;j++)
					{
						matriz3[i][j] = matriz2[i][j] + matriz1[i][j];
						System.out.println("\nSoma das matrizes: "+matriz3);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre cm o valor da constante: ");
				numero = leia.nextFloat();
				for (i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz1[i][j] += numero;
						matriz2[i][j] += numero;
						System.out.println("\nMatriz 1: "+matriz1[i][j]);
						System.out.println("\nMatriz 2: "+matriz2[i][j]);
					}
				}
				break;
			case 4:
				for (i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						System.out.println("\nMatriz 1: "+matriz1[i][j]);
						System.out.println("\nMatriz 2: "+matriz2[i][j]);
					}
				}
				break;
				default:
					if(op<0 || op>4)
					{
						System.out.println("\nOpção inválida!!");
					}
					else if (op==0)
					{
						System.out.println("\nMuito obrigada");
						
					}
					else
					{
						System.out.println("\nVamo utilizar novamente o nosso sistema");
					}
			
			}
		
		}
		while(op!=0);

	}

}
