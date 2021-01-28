package com.service;

class MyException extends Exception
{
	public MyException(String args)
	{
		super(args);
	}
}

public class MyBank extends AccountIntialization implements Bank
{
	public void withdraw(int accno1, float ammount1)
	{
		boolean flag1 = true;
		if(accCount!=0)
		{
			try
			{
				for(int i=0;i<10;i++)
				{
					if(account[i].getAccno()==accno1)
					{
						try
						{
							if(500.0f> (account[i].getAmount()-ammount1))
								throw new MyException("Minimum Balance Exception");
						
							account[i].setAmount(account[i].getAmount()-ammount1);
							System.out.println();
							System.out.println("Amount Withdrwan Successfully");
							System.out.println();
							break;
						}
						catch(MyException e)
						{
							System.out.println();
							System.out.println(e.toString());
							System.out.println();
							break;
						}
					}
					flag1 = false;
					
				}
				if(flag1)
					throw new MyException("Account Mismatch Exception");
			}
				catch(MyException e)
				{
					System.out.println(e.toString());
					
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
		boolean flag1 = true;
		if(accCount!=0)
		{

			try
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
							flag1 = false;
							break;
						}
						else
						{
							System.out.println();
							System.out.println("for more than 50,000 amount to be deposited, Pan Card is Compulsary");
							System.out.println();
							flag1 = false;
							break;
						}
						
					}
					
					
				}
				if(flag1)
					throw new MyException("Account Mismatch Exception");
			}
				catch(MyException e)
				{
					System.out.println(e.toString());
					
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
		boolean flag = true;
		if(accCount!=0)
		{
			try
			{
				for(int i=0;i<10;i++)
				{
					if(account[i].getAccno()== accno1 )
					{
						System.out.println();
						System.out.println("Balaence : "+account[i].getAmount());
						System.out.println();
						flag = false;
						break;
					}
				}
				if(flag)
					throw new MyException("Account Mismatch Exception");
			}
			catch(MyException e)
			{
				System.out.println(e.toString());
				
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
		boolean flag1 = true;
		if(accCount!=0)
		{

			try
			{
				for(int i=0;i<10;i++)
				{
					if(account[i].getAccno()==fromAccNo)
					{
						for(int j=0;j<10;j++)
						{
							if(account[j].getAccno()==toAccNo)
							{
								try
								{
									if(500.0f > (account[i].getAmount()-amount))
										throw new MyException("Minimum Balance Exception");
								
									account[i].setAmount(account[i].getAmount()-amount);
									account[j].setAmount(account[j].getAmount()+amount);
									break;
								}
								catch(MyException e)
								{
									System.out.println();
									System.out.println(e.toString());
									System.out.println();
								}
							}
						}
						break;
					}
					flag1 = false;
				}
				if(flag1)
					throw new MyException("Account Mismatch Exception");
			}
				catch(MyException e)
				{
					System.out.println(e.toString());
					
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

