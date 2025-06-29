package problem_1;

abstract class Car {
	public void accelerate() {
	      System.out.println("Do something to accelerate");
	   }

	   public void applyBrakes() {
	      System.out.println("Do something to apply brakes");
	   }

	   public abstract void changeGears();
	}
class Alto extends Car {
	  
	   public void changeGears() {
	   System.out.println("Implement changeGears() method for Alto Car");
	   }
	}

class Santro extends Car {
	   
	   public void changeGears() {
	      System.out.println("Implement changeGears() method for Santro Car");
	   }
	}



