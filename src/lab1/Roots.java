package lab1;

import java.util.Scanner;

public class Roots {

	public static void main(String[] args) {
		int a, b, c;
		double x1, x2, d;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.println("Enter b: ");
		b = input.nextInt();
		System.out.println("Enter c: ");
		c = input.nextInt();
		input.close();
		d = b * b - 4 * a * c;
		if (d > 0) {
			x1 = (Math.sqrt(d) - b) / (2.0 * a);
			x2 = (-Math.sqrt(d) - b) / (2.0 * a);
			System.out.println("The roots of quadratic equation are: " + x1 + " & " + x2);

		} else if (d == 0) {
			x1 = x2 = (-b) / (2 * a);
			System.out.println("The root of quadratic equation is: " + x1);

		} else {
			System.out.println("Error! Discriminant is negative!");
		}

	}

}
