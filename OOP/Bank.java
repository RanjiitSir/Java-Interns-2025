import java.lang.*;
import java.util.*;

class BankAccount
{
	private double Balance; 

	public BankAccount()
	{
		Balance = 0;
	}
	
	public BankAccount(double initialBalance)
	{
		Balance = initialBalance;
	}

	public void Deposit(double Amount)
	{
		if (Amount > 0)
		{
			Balance += Amount;
		}
	}

	public double getBalance()
	{
		return Balance;
	}
}

public class Bank
{
	public static void main(String[] args)
	{
		BankAccount User1 = new BankAccount();
		BankAccount User2 = new BankAccount(1000);
		
		System.out.println("\n User1 Initial Balance: " + User1.getBalance());
		
		User1.Deposit(2200);
		System.out.println("\n User1 Updated Balance: " + User1.getBalance());
		
		System.out.println("\n User2 Initial Balance: " + User2.getBalance());
		
		User2.Deposit(500);
		System.out.println("\n User2 Updated Balance: " + User2.getBalance());
	}
}