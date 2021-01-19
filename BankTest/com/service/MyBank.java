package com.service;

public class MyBank extends AccountIntialization implements Bank
{
	public void withdraw(int accno1, float ammount1)
	{
		if(accCount!=0)
		{
			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==accno1)
				{
					if(500.0f< (account[i].getAmount()-ammount1))
					{
						account[i].setAmount(account[i].getAmount()-ammount1);
						System.out.println();
						System.out.println("Amount Withdrwan Successfully");
						System.out.println();
						break;
					}
					else
					{
						System.out.println();
						System.out.println("Miimum balance should be 500 maintain, You cannaot withdraw your amount");
						System.out.println();
						break;
					}
				}
			}
		}
		else
		{
			System.out.println();
			System.out.println("Create Account First");
			System.out.println();
		}
	}
	public void deposit(int accno1, float ammount1)
	{
		if(accCount!=0)
		{

			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==accno1)
				{
					if(ammount1<50000f)
					{
						account[i].setAmount(account[i].getAmount() + ammount1);
						System.out.println();
						System.out.println("Amount Deposited");
						System.out.println();
						break;
					}
					else
					{
						System.out.println();
						System.out.println("for more than 50,000 amount to be deposited, Pan Card is Compulsary");
						System.out.println();
						break;
					}
				}
			}
		}
		else
		{
			System.out.println();
			System.out.println("Create Account First");
			System.out.println();
		}

	}
	public void checkBalance(int accno1)
	{
		if(accCount!=0)
		{
			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()== accno1 )
				{
					System.out.println();
					System.out.println("Balaence : "+account[i].getAmount());
					System.out.println();
					break;
				}
			}
		}
		else
		{
			System.out.println();
			System.out.println("Create Account First");
			System.out.println();
		}
	}

	public void transfer(int fromAccNo , int toAccNo, float amount)
	{
		if(accCount!=0)
		{

			for(int i=0;i<10;i++)
			{
				if(account[i].getAccno()==fromAccNo)
				{
					for(int j=0;j<10;j++)
					{
						if(account[j].getAccno()==toAccNo)
						{
							if(500.0f < (account[i].getAmount()-amount))
							{
								account[i].setAmount(account[i].getAmount()-amount);
								account[j].setAmount(account[j].getAmount()+amount);
								break;
							}
							else
							{
								System.out.println();
								System.out.println("Sender You Have Not Sufficient Balence ");
								System.out.println();
							}
						}
					}
					break;
				}
			}
		}
		else
		{
			System.out.println();
			System.out.println("Create Account First");
			System.out.println();
		}
	}
}

