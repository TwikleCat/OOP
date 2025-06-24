package problem1_part_a;
import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.println("Choose shape: 1. Cylinder  2. Sphere  3. Cube");
        int choice = input.nextInt();

        Shape3D shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = input.nextDouble();
                System.out.print("Enter height: ");
                double h = input.nextDouble();
                shape = new Cylinder(r, h);
                break;
            case 2:
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();
                shape = new Sphere(radius);
                break;
            case 3:
                System.out.print("Enter side length: ");
                double side = input.nextDouble();
                shape = new Cube(side);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(1);
        }
        input.close();

        System.out.printf("Volume: %.2f%n", shape.volume());
        System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
    }

}
