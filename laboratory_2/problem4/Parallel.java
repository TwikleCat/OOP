package problem4;

public class Parallel extends Circuit{
	private Circuit circuit1;
    private Circuit circuit2;
    
    public Parallel(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }
    
    public double getResistance() {
        return 1 / (1 / circuit1.getResistance() + 1 / circuit2.getResistance());
    }
    
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff(); 
    }
    
    public void applyPotentialDiff(double V) {
        circuit1.applyPotentialDiff(V);
        circuit2.applyPotentialDiff(V);
    }

}
