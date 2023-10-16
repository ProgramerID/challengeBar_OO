package application;

import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Bill bill = new Bill();

		Scanner sc = new Scanner(System.in);

		System.out.print("Gender: ");
		bill.gender = sc.next().charAt(0);

		while (bill.gender != 'M' & bill.gender != 'F') {
			System.out.print("Invalid value, Please try again M or F: ");
			bill.gender = sc.next().charAt(0);
		}
		System.out.print("Quantity of Beers: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantity of SoftDrinks: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantity of Barbecures: ");
		bill.barbecure = sc.nextInt();

		System.out.println();
		System.out.println("REPORT:");
		System.out.printf("Feeding = R$ %.2f%n", bill.feeding());

		if (bill.cover() == 0.00) {
			System.out.println("Isent of cover");
		} else {
			System.out.printf("Cover = R$ %.2f%n", bill.cover());
		}
		System.out.printf("Ticket = R$ %.2f%n", bill.ticket());

		System.out.println();
		System.out.printf("Value to Pay = R$ %.2f", bill.total());

		sc.close();

	}

}
