package problem_4;
import java.time.LocalDate;
import java.util.Objects;

public class Employee  extends Person implements Comparable<Employee>, Cloneable{
	protected double salary;
	protected LocalDate hireDate;
	protected String insuranceNumber;
	
	public Employee() {

	}
	
	public Employee(String name, double salary, LocalDate hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}


	
	public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    
    
    public int compareTo(Employee other) {
        int salaryComparison = Double.compare(this.salary, other.salary);
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        return 0; 
    }
	
	public String toString() {
		return super.toString() + ", my salary is: " + salary + ", my hire date is: " + hireDate + ", my insurance number is: " + insuranceNumber;
	}
	
	public boolean equals(Object o) {
        if (this == o) {
            return true; 
        }
        if (!(o instanceof Employee)) {
            return false;
        }
		if(!super.equals(o)) {
			return false;
		}
		Employee employee = (Employee) o;
		return Double.compare(employee.salary, salary) == 0 &&
	               Objects.equals(hireDate, employee.hireDate) &&
	               Objects.equals(insuranceNumber, employee.insuranceNumber);
	    }
	
		
		public Employee clone() {
	        try {
	            return (Employee) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new AssertionError();
	        }
	    }
	

}
