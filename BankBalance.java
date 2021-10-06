// Example from page 291

import java.util.Scanner;

public class BankBalance
{
	public static void main(String[] args)
	{
		// Variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

		// Input Phase
		System.out.print("Please enter initial bank balance: ");
		balance = keyboard.nextDouble();
		System.out.println("Do you want to see next year's balance?");
		System.out.print("Enter 1 for YES or any other number for NO: ");
		response = keyboard.nextInt();

		// Processing Phase
		while(response == 1)
		{
			balance = balance + (balance * INT_RATE);
			// Output Phase
			System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
			year = year + 1;
			System.out.println("\nDo you want to see the balance at the end of another year?");
			System.out.print("Enter 1 for YES or any other number for NO: ");
			response = keyboard.nextInt();
		}

		System.out.println("Have a great day! Exiting App...");
	}
}