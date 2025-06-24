package problem3;
import java.util.*;

public class BankTest {
	
	public static void main(String[]args) { 
		
		Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("=== Create Savings Account ===");
        System.out.print("Enter Account Number: ");
        int sAccNum = scanner.nextInt();

        System.out.print("Enter Interest Rate (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter Initial Deposit: ");
        double sDeposit = scanner.nextDouble();

        SavingsAccount s1 = new SavingsAccount(sAccNum, interestRate);
        s1.deposit(sDeposit);
        bank.openAcc(s1);

        System.out.println("\n=== Create Checking Account ===");
        System.out.print("Enter Account Number: ");
        int cAccNum = scanner.nextInt();

        CheckingAccount c1 = new CheckingAccount(cAccNum);

        System.out.print("Enter number of transactions (deposit/withdraw): ");
        int transactions = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < transactions; i++) {
            System.out.print("Transaction " + (i + 1) + " (deposit/withdraw): ");
            String type = scanner.nextLine().trim();

            System.out.print("Amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); 

            if (type.equalsIgnoreCase("deposit")) {
                c1.deposit(amount);
            } else if (type.equalsIgnoreCase("withdraw")) {
                c1.withdraw(amount);
            } else {
                System.out.println("Invalid transaction type. Skipped.");
            }
        }

        bank.openAcc(c1);

        System.out.println("\n=== BEFORE UPDATE ===");
        bank.printAllAccounts();
        bank.update();

        System.out.println("\n=== AFTER UPDATE ===");
        bank.printAllAccounts();

        scanner.close();
	        }
}
