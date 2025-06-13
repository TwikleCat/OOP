package lab1;
import java.util.Scanner;



public class DragonLaunchTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DragonLaunch launch = new DragonLaunch();

        System.out.print("Enter the sequence of kidnapped students (e.g., BGBG): ");
        String input = scanner.nextLine().toUpperCase();

        for (char c : input.toCharArray()) {
            if (c == 'B') {
                launch.kidnap(new Person(Gender.BOY));
            } else if (c == 'G') {
                launch.kidnap(new Person(Gender.GIRL));
            } else {
                System.out.println("Invalid character detected: " + c);
                return;
            }
        }

        System.out.print("Initial line: ");
        launch.printLine();

        boolean willEat = launch.willDragonEatOrNot();

        System.out.println("Dragon will " + (willEat ? "" : "not ") + "eat!");
    }


	

}
