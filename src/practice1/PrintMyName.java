package practice1;

import java.util.Scanner;

public class PrintMyName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		input.close();
		System.out.print("+");
		for (int i = 0; i < name.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
		System.out.print("|");
		System.out.print(name);
		System.out.println("|");
		System.out.print("+");
		for (int i = 0; i < name.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");

	}

}
