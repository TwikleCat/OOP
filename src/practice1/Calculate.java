package practice1;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		int area, a, p;
		double d;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		input.close();
		area = a * a;
		p = 4 * a;
		d = Math.sqrt(2) * a;

		System.out.print("Area of Square = " + area);
		System.out.print("\nPerimeter of Square = " + p);
		System.out.print("\nDiagonal of Square = " + d);

	}

}
