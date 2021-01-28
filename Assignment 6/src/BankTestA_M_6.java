import java.util.Scanner;

import com.service.MyBank;

public class BankTestA_M_6 
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String ch,name;
		int accno,taccno,acount=0,bcount=0,max=10;
		float amount;
		boolean flag=true;
		boolean flag1=false;
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
							System.out.println("Default Account Created");
							System.out.println("Please Proceed With Option b");
							flag1 = true;
							acount++;
							break;
				case "b":
							if(flag1 && bcount<acount)
							{
								System.out.println("Please Enter Your Name and Amount to Deposit(Make sure Amount should be grater then 500");
								name = sc.next();
								amount = sc.nextFloat();
								mybank.accountCreate(name,amount);
								bcount++;
							}
							else
							{
								System.out.println("Create Default Account First");
								
							}
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
							System.out.println("Please Enter a,b,2,3,4,5,6 Option ONLY");

							break;
			}
		}while(flag);
	}
}