package problem_4;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee{
	
	protected Vector<Employee> employers;
	protected double bonus;
	
	public Manager() {
		employers = new Vector<Employee>();
	}
	
	public Manager(String name, double salary, LocalDate hireDate, String insuranceNumber, double bonus) {
		super(name, salary, hireDate, insuranceNumber);
		employers = new Vector<Employee>();
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString() + " my bonus is: " + bonus;
	}
	
	public void showEmployee() {
		 for(Employee employers : employers) {
			 System.out.println(employers.toString());
		 }
	 }
	
    public void addTeamMember(Employee employee) {
        this.employers.add(employee);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
	
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		if(!(super.equals(o))){
			return false;
		}
		if(!(o instanceof Manager)) {
			return false;
		}
		

		
		Manager manager = (Manager) o;
		 return Double.compare(bonus, manager.bonus) == 0 &&
	               Objects.equals(employers, manager.employers); 		
	}
	
    
    public Manager clone() {
        Manager cloned = (Manager) super.clone(); 
		cloned.employers = new Vector<>(this.employers); 
		return cloned;
    }
    
    
    public int compareTo(Employee other) {
        int salaryComparison = super.compareTo(other);
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        
        if (this instanceof Manager && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return 0;
    }


}
