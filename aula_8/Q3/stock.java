package coleções;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class stock {

	public static void main(String[] args) {

		int op;
		Scanner sc = new Scanner(System.in);

		ArrayList<String> stock = new ArrayList<String>();
		

			do{

				System.out.println("\n______________________________________");
				System.out.println("\n[1] --> ADD PRODUCTS TO STOCK      ||");
				System.out.println("\n[2] --> REMOVE PRODUCTS FROM STOCK ||");
				System.out.println("\n[3] --> UPDATE STOCK PRODUCTS      ||");
				System.out.println("\n[4] --> SHOW STOCK PRODUCTS        ||");
				System.out.println("\n[0] --> END THE PROGRAM            ||");
				System.out.println("\n______________________________________");
				System.out.println("\nTYPE AN OPTION:______");
			op = sc.nextInt();

			switch (op) {
				case 1:
					sc.nextLine();
					System.out.println("\nENTER THE PRODUCT TO ADD TO STOCK:___________");
					String productAdd = sc.nextLine();
					stock.add(productAdd);
					break;
				case 2:
					sc.nextLine();
					System.out.println("\nENTER THE PRODUCT TO REMOVE FROM STOCK:_________");
						String productRemove = sc.nextLine();
							if (stock.contains(productRemove)) {
								stock.remove(productRemove);
							} else {	
								System.out.println("\nPRODUCT DOES NOT EXIST...");
							}
							break;
				case 3:
					sc.nextLine();
					System.out.println("\nENTER THE PRODUCT YOU WOULD LIKE TO UPDATE:________");
					String productUpdate = sc.nextLine();
					System.out.println("\nENTER THE PRODUCT THAT WILL BE IN PLACE OF" + productUpdate);
					String neww = sc.nextLine();
					if (stock.contains(productUpdate)) {
						stock.remove(productUpdate);
						stock.add(neww);

					} else {
						System.out.println("\nPRODUCT DOES NOT EXIST...");
					}
					System.out.println(stock);
					break;
				case 4:
					sc.nextLine();
					System.out.println("\nTHE PRODUCTS FROM THE STOCK ARE:___________ ");
					System.out.println(stock);
					break;
				default:
					if (op < 0 || op > 4) {
						System.out.println("\nINVALID OPTION_____ENTER A NEW OPTION:______ ");
					}
					System.out.println("\n________________PROGRAM CLOSED___________");
						}
			}while(op!=0);

		

	}
}
	
