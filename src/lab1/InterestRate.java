package lab1;

import java.util.Scanner;

public class InterestRate {

	public static void main(String[] args) {
		double balance;
		double rate;
		Scanner input = new Scanner(System.in);
		System.out.print("The initial balance:");
		balance = input.nextInt();
		System.out.println("The interest rate:");
		rate = input.nextInt();
		input.close();
		balance = balance * (1 + rate / 100);

		System.out.println("New balance:" + " " + balance);

	}

}
