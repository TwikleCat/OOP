package problem4;

public abstract class Circuit {
	public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);
    
    public double getPower() {
        return getCurrent() * getPotentialDiff();
    }
    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }

}
