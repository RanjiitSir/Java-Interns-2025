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
		if (amount > 0)
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
		
		System.out.println("\n Balance: " + User1.getBalance());
		
		User1.Deposit(2200);
		System.out.println("\n Balance: " + User1.getBalance());
		
		System.out.println("\n Balance: " + User2.getBalance());
		
		User2.Deposit(500);
		System.out.println("\n Balance: " + User2.getBalance());
	}
}