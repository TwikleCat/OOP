package practice1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int score;
		Scanner input = new Scanner(System.in);
		score = input.nextInt();
		input.close();
		System.out.print("The grade is: ");
		if (score >= 95 && score <= 100) {
			System.out.print("A");
		} else if (score >= 90 && score <= 94) {
			System.out.print("A-");
		} else if (score >= 85 && score <= 89) {
			System.out.print("B+");
		} else if (score >= 80 && score <= 84) {
			System.out.print("B");
		} else if (score >= 75 && score <= 79) {
			System.out.print("B-");
		} else if (score >= 70 && score <= 74) {
			System.out.print("C+");
		} else if (score >= 65 && score <= 69) {
			System.out.print("C");
		} else if (score >= 60 && score <= 64) {
			System.out.print("C-");
		} else if (score >= 55 && score <= 59) {
			System.out.print("D+");
		} else if (score >= 50 && score <= 54) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
	}

}
