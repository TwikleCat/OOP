package problem_2;

public class Main {
	public static void main(String[] args) {
        Controllable[] vehicles = {
            new Train(),
            new Plane()
            
        };

        for (Controllable v : vehicles) {
            v.move();
            v.control();
            System.out.println("----");
        }
    }

}
