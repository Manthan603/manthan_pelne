import java.util.Scanner;
class Assignment1
{
	public static void main(String args[])
	{
		System.out.println("New Exam System ");
		Scanner sc = new Scanner(System.in);
		int op;
		int flagm =0 ,flage=0,flagg=0,temp=0,score=0;
		String tem;
		do
		{
			System.out.println();
			System.out.println("1 : Maths ");
			System.out.println("2 : English ");
			System.out.println("3 : GK ");
			System.out.println("Please Enter Your option In the 1,2,3 Only ");
			op = sc.nextInt();

			switch(op)
			{
				case 1:
						if(flagm==0)
						{
							System.out.println("Welcome to Math Exam");
							System.out.println();
							System.out.println("You hav to answer 3 Qutions compulsary which are follows ");
							switch(1)
							{
								case 1:
										System.out.println("Q1: 1+1 = ");
										temp = sc.nextInt();
										if(temp==2)
											score += 10;
								case 2:
										System.out.println("Q2: 24*2 = ");
										temp = sc.nextInt();
										if(temp == 48)
											score += 10;
								case 3:
										System.out.println("Q3: 24/2 =");
										temp = sc.nextInt();
										if(temp == 12)
											score +=10;
							}

							flagm=1;
						}
						else
						{
							System.out.println("You Already Taken THe Exam ,Please choose other one");
						}
						break;
				case 2:
						if(flage==0)
						{
							System.out.println("Welcome English Exam");
							System.out.println();
							System.out.println("You hav to answer 3 Qutions compulsary which are follows ");
							switch(1)
							{
								case 1:
										System.out.println("Q1: IN Present Tense which Model verb used (is/was)");
										tem = sc.next();
										if(tem.equals("is"))
											score += 10;
								case 2:
										System.out.println("Q2: IN Future Tense which Model verb used (was/will)");
										tem = sc.next();
										if(tem.equals("will"))
											score += 10;
								case 3:
										System.out.println("Q1: Which alphabet is vowel (w/e/t/p/x)");
										tem = sc.next();
										if(tem.equals("e"))
											score += 10;

							}
							flage=1;
						}
						else
						{
							System.out.println("You Already Taken THe Exam ,Please choose other one");
						}
						break;
				case 3:
						if(flagg==0)
						{
							System.out.println("Welcom GK Exam");
							System.out.println();
							System.out.println("You hav to answer 3 Qutions compulsary which are follows ");
							switch(1)
							{
								case 1:
										System.out.println("Q1: Capital of India id Delhi (yes/no)");
										tem = sc.next();
										if(tem.equals("yes"))
											score += 10;
								case 2:
										System.out.println("Q2: Boiling point of Water (100c/78c)");
										tem = sc.next();
										if(tem.equals("100c"))
											score += 10;
								case 3:
										System.out.println("Q1: Scientific Name of water (H2O/HO2)");
										tem = sc.next();
										if(tem.equals("H2O"))
											score += 10;

							}
							flagg=1;
						}
						else
						{
							System.out.println("You Already Taken THe Exam ,Please choose other one");
						}
						break;
				default:
						System.out.println(" You Entered Wrong OPtion , PLease Enter 1,2,3 Only");
						break;

			}
			if(flagm==1 && flage==1 && flagg==1)
			{
				System.out.println("You done with Exam plese proced for other ");
				op=5;
			}

			else if(flage==1 )
				System.out.println("You done with English plese proced for other ");

			else if(flagg==1 )
				System.out.println("You done with GK Exam plese proced for other ");
			else if(flagm==1 )
			{
				System.out.println("You done with  with Math Exam plese proced for other");
			}


		}while(op!=5);
		if((score/100)>=90)
			System.out.println("You done Eligible fro Gate Your Score " + score);
		else if((score/100)>=70 && (score/100)<90)
			System.out.println("You done Eligible fro Your Score + 10 " + score+10);
		else
			System.out.println("You done Exam Your Score " + score);
	}
}
