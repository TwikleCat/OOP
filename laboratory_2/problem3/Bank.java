package problem3;
import java.util.*;


public class Bank {
private Vector<Account> accs; 
	
	
	public Bank() { 
		accs = new Vector<>(); 
	}
	
	public void openAcc(Account account) { 
		accs.add(account); 
	}
	
	public void closeAcc(Account account) { 
		accs.remove(account); 
	}
	
	public void update() { 
		for (Account account : accs){ 
			

            if (account instanceof SavingsAccount) { 
            	SavingsAccount savings = (SavingsAccount) account; 
            	savings.addInterest();
            }
            else if (account instanceof CheckingAccount) { 
            	CheckingAccount checkingAccount= (CheckingAccount) account; 
            	checkingAccount.deductFee();
            	
 
            }
		}
	}
	
	public void printAllAccounts() {
        for (Account account : accs) {
            account.print();
        }
    }

}
