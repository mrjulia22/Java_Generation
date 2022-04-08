package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;


public class program_client {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Client client = new Client();
		
		System.out.print("ENTER CODE CLIENT: ");
		client.code = sc.nextLine();
		
		System.out.print("ENTER NEME CLIENT: ");
		client.name = sc.nextLine();

		System.out.print("ENTER PROFESSION: ");
		client.profession = sc.nextLine();
		
		System.out.print("ENTER BIRTHDAY: ");
		client.birthday = sc.nextLine();
		
		System.out.print("ENTER E-MAIL: ");
		client.eMail = sc.nextLine();
		
		System.out.print("ENTER CITY: ");
		client.city = sc.nextLine();
		
		System.out.print("ENTER PHONE NUMBER: ");
		client.telephoneNum = sc.nextLine();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(client);
		
		

	}

}
