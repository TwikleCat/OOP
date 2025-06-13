package lab1;
import java.util.Vector;

public class DragonLaunch {
	 private Vector<Person> line;

	    public DragonLaunch() {
	        line = new Vector<>();
	    }

	    public void kidnap(Person p) {
	        line.add(p);
	    }

	    public boolean willDragonEatOrNot() {
	        int top = -1;

	        for (int i = 0; i < line.size(); i++) {
	            Person current = line.get(i);

	            if (top >= 0 && line.get(top).getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
	                top--; // Cancel the previous BOY with current GIRL
	            } else {
	                top++;
	                if (top < i) {
	                    line.set(top, current); // Overwrite to simulate stack
	                }
	            }
	        }

	        // The remaining size is (top + 1)
	        return top >= 0;
	    }

	    public void printLine() {
	        for (Person p : line) {
	            System.out.print(p + " ");
	        }
	        System.out.println();
	    }

}
