package problem_1;

public class CarTest {
	
	public static void main(String[] args) {
	      
	      Car alto = new Alto();
	      alto.accelerate();
	      alto.applyBrakes();
	      alto.changeGears();
	      
	      Car santro = new Santro();
	      santro.accelerate();
	      santro.applyBrakes();
	      santro.changeGears();
	   }

}

//An abstract class is a good choice if we are using the inheritance concept since it provides a common base class implementation to derived classes.
//It is also good if we want to declare non-public members. In an interface, all methods must be public.
//Abstract classes have the advantage of allowing better forward compatibility.
//f we want to provide common, implemented functionality among all implementations of our component, use an abstract class.