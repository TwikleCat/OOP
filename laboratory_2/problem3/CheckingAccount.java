package problem3;

public class CheckingAccount extends Account {
	private int cnt; 
	private static final int freeTransaction = 3; 
	private static final double transactionFee = 0.2;
	
	public CheckingAccount() { 
		
	}
	
	public CheckingAccount(int accNumber) { 
		super(accNumber);
		this.cnt =0; 
	}
	
	public void deductFee() { 
		int extraTransactions = cnt - freeTransaction;
		if (cnt>freeTransaction) { 
			double fee = transactionFee * extraTransactions; 
			super.withdraw(fee); 
		}
		
		cnt=0 ; 
	}
	
	public void deposit(double sum) { 
		super.deposit(sum);
		cnt++;
	}
	
	public void withdraw(double sum) { 
		super.withdraw(sum);
		cnt++; 
	}

}
