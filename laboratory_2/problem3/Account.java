package problem3;

public class Account {
	private double balance; 
	private int accNumber; 
	
	public Account() { 
	}
	
	public Account(int a) { 
		balance =0.0; 
		accNumber= a; 
	}
	
	public void deposit(double sum) { 
		if(sum>0) balance+=sum;
		else System.out.print("Use positive number please");
	}
	
	public void withdraw(double sum) { 
	    if (sum > 0 && sum <= balance) balance -= sum;
	    else System.out.println("Invalid amount or insufficient balance.");
	}
	
	public void transfer(double amount,  Account other) {
		balance -= amount;
		other.balance += amount;
	}
	
	public double getBalance() { 
		return balance; 
	}
	
	public double getAccNumber() { 
		return accNumber; 
	}
	
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	public String toString() { 
	    return "Account #" + accNumber + " | Balance: $" + String.format("%.2f", balance);
	}
	
	public final void print() { 
		System.out.println(toString()); 
	}

}
