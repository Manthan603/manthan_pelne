

import bean.*;
import java.util.Scanner;




abstract class AccountIntialization
{
	public static int accCount=0,accCountCopy=0,i=0,j=0;
	public static int accNo = 1001;
	public static int accNoCopy = 1001;
	public Account account[] = new Account[10];
	public String name;
	public float amount;

	void accountCreate()
	{
		if(accCount<10)
		{
			name = "Unknown";
			amount = 500;
			account[i] = new Account(accNo,name,amount);
			accNo++;
			i++;
			accCount++;
		}
		else
		{
			accCountCopy=1;
			System.out.println();
			System.out.println("Account Capacity Already Reached To Limit");
			System.out.println();
		}
	}

	void accountCreate(String name, float amount)
	{
		if(accCountCopy<10)
		{
			if(amount>500.0f)
			{
				this.name = name;
				this.amount = amount;
				account[j].setAccno(this.accNoCopy);
				account[j].setName(this.name);
				account[j].setAmount(this.amount);
				System.out.println("Name : " + account[j].getName());
				System.out.println("Account Number : " + account[j].getAccno());
				accNoCopy++;
				accCountCopy++;
				j++;
			}
			else
			{
				System.out.println();
				System.out.println("Deposited amount should be grater than 500");
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("Account Capacity Already Reached To Limit");
			System.out.println();
		}
	}

	abstract void transfer(int fromAccNo , int toAccNo, float amount);
}