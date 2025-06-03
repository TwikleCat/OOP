package lab1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		input.close();
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}

		if (word.equals(rev)) {
			System.out.println('"' + word + '"' + " is a palindrome.");
		} else {
			System.out.println('"' + word + '"' + " is not a palindrome.");
		}

	}

}
