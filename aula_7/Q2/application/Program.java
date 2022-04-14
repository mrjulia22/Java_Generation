package application;

import java.util.Scanner;

import entities.Animal;
import entities.Dog;
import entities.Horse;
import entities.Sloth;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		Dog cachorro = new Dog();
		Horse cavalo = new Horse();
		Sloth preguica = new Sloth();

		Animal animal = null;

		int x = 0;

		do {

			System.out.println("\nwhat is your type of animal\n\n" + "1-DOG\n2-HORSE\n3-SLOTH\n");
			x = leia.nextInt();

			if (x == 1) {
				animal = cachorro;

				System.out.println("\nHow old is your dog?");
				int idade = leia.nextInt();
				leia.nextLine();

				System.out.println("\nWhat's your dog's name? ");
				String nome = leia.nextLine();
				leia.nextLine();

				System.out.println("\nWhat sound does your dog make??");
				String som = leia.nextLine();
				System.out.println("\n_______________________________________________________");

				cachorro.name(nome);
				cachorro.age(idade);
				cachorro.sound(som);
			} else if (x == 2) {

				animal = cavalo;
				leia.nextLine();
				System.out.println("\nWhat's your horse's name? ");
				String nome = leia.nextLine();

				System.out.println("\nHow old is your horse?");
				int idade = leia.nextInt();
				leia.nextLine();

				System.out.println("\nWhat sound does your horse make??");
				String som = leia.nextLine();
				System.out.println("\n_______________________________________________________");

				cavalo.name(nome);
				cavalo.age(idade);
				cavalo.sound(som);
			} else if (x == 3) {

				animal = preguica;
				leia.nextLine();
				System.out.println("\nWhat's your sloth's name?");
				String nome = leia.nextLine();

				System.out.println("\nHow old is your sloth?");
				int idade = leia.nextInt();
				leia.nextLine();

				System.out.println("\nWhat sound does your sloth make??");
				String som = leia.nextLine();
				System.out.println("\n_______________________________________________________");

				preguica.name(nome);
				preguica.age(idade);
				preguica.sound(som);
			} else {
				System.out.println("\nInvalid option");
			}
		} while (x <= 0 || x >= 4);
	}
}
