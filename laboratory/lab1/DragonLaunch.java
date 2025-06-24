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
	                top--; 
	            } else {
	                top++;
	                if (top < i) {
	                    line.set(top, current);
	                }
	            }
	        }

	        
	        return top >= 0;
	    }

	    public void printLine() {
	        for (Person p : line) {
	            System.out.print(p + " ");
	        }
	        System.out.println();
	    }

}
