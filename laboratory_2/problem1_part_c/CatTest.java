package problem1_part_c;
import java.util.*;

public class CatTest {

	public static void main(String[] args) {
		
		HashSet<Cat> catSet = new HashSet<>();
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter Cat Details. Duplicates will be ignored!");
        while (true) {
            System.out.print("\nEnter cat name (or 'exit' to finish): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            System.out.print("Enter cat age: ");
            int age = Integer.parseInt(input.nextLine());
            System.out.print("Enter cat color: ");
            String color = input.nextLine();
            Cat newCat = new Cat(name, age, color);
            if (catSet.contains(newCat)) {
                System.out.println("Duplicate cat! Not added: " + newCat);
            } else {
                catSet.add(newCat);
                System.out.println("Cat added: " + newCat);
            }
        }
        catSet.forEach(System.out::println);
        System.out.println("Total unique cats: " + catSet.size());
        input.close();

	}

}
