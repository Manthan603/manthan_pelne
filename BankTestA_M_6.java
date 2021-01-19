
import java.util.Scanner;

interface Bank
{
	void withdraw(int accno, float ammount);
	void deposit(int accno, float ammount);
	void checkBalance(int accno);
}

class Account
{
	private int accno=0;
	private String name=null;
	private float amount=0.0f;

	public Account( int accno, String name, float amount)
	{
		this.accno = accno;
		this.name = name;
		this.amount = amount;
	}

	public void setAccno(int accno)
	{
		this.accno = accno;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAmount(float amount)
	{
		this.amount = amount;
	}

	public int getAccno()
	{
		//System.out.println(accno);
		return accno;
	}
	public String getName()
	{
		return name;
	}
	public float getAmount()
	{
			return amount;
	}

}

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

class MyBank extends AccountIntialization implements Bank
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

class BankTestA_M_6
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String ch,name;
		int accno,taccno;
		float amount;
		boolean flag=true;
		MyBank mybank = new MyBank();
		do
		{
			System.out.println();
			System.out.println("1.Creare Account");
			System.out.println("  	a.Default Details");
			System.out.println("  	b.Name and Amount to Deposit(Make sure Amount should be grater then 500)");
			System.out.println("2.Check Account Balance");
			System.out.println("3.Withdraw the Amount");
			System.out.println("4.Deposit the Amount");
			System.out.println("5.Transfer the Amount");
			System.out.println("6.Exit");
			System.out.println("Plase enter the appropriate option");
			System.out.println();

			ch = sc.next();

			switch(ch)
			{
				case "a":
							mybank.accountCreate();
							break;
				case "b":
							System.out.println("Please Enter Your Name and Amount to Deposit(Make sure Amount should be grater then 500");
							name = sc.next();
							amount = sc.nextFloat();
							mybank.accountCreate(name,amount);
							break;
				case "2":
							System.out.println("Please Enter Your Account Number");
							accno = sc.nextInt();

							mybank.checkBalance(accno);
							break;
				case "3":
							System.out.println("Please Enter Your Account Number");
							accno = sc.nextInt();
							System.out.println("Please Enter Amount To Be Withdraw");
							amount = sc.nextFloat();
							mybank.withdraw(accno,amount);
							break;
				case "4":
							System.out.println("Please Enter Your Account Number");
							accno = sc.nextInt();
							System.out.println("Please Enter Amount To Be Deposited");
							amount = sc.nextFloat();
							mybank.deposit(accno, amount);
							break;
				case "5":
							System.out.println("Please Enter Your Account Number");
							accno = sc.nextInt();
							System.out.println("Please Enter Transfer Account Number");//amount
							taccno = sc.nextInt();
							System.out.println("Please Enter Amount To Be Transfer");
							amount = sc.nextFloat();
							mybank.transfer(accno,taccno,amount);
							break;
				case "6":
							System.out.println("Thank You For Chossing our Bank");
							flag=false;
							break;
				default:
							System.out.println("Please Enter The Appropriate Option");

							break;
			}
		}while(flag);
	}
}