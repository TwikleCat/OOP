package problem4;

public class CircuitTest {

	public static void main(String[] args) {
		Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);
        
        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);
        
        double V = 12.0; 
        circuit.applyPotentialDiff(V);
        
        double R = circuit.getResistance();
        double power = circuit.getPower();
        double current = circuit.getCurrent();
        
        System.out.println("Equivalent Resistance: " + R + " Ohms");
        System.out.println("Total Power: " + power + " Watts");
        System.out.println("Total Current: " + current + " Amperes");


	}

}
