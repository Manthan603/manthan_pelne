import java.util.Scanner;
class Assignment2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size;
		int temp;
		String tem;
		System.out.println("Enter the Number of Employees");
		size = sc.nextInt();
		System.out.println("Now you enter the details in a sequence of id, Name,Salary,Designatio ONLY");
		int []id = new int[size];
		String []desg = new String[size];
		double []salary = new double[size];
		String []name = new String[size];

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Number of Employee "+(i+1));
			id[i] = sc.nextInt();
			sc.nextLine();
			name[i] = sc.next();
			salary[i] = sc.nextDouble();
			sc.nextLine();
			desg[i] = sc.next();
		}


		for(int i=0;i<size;i++)
		{
			if(desg[i].equals("Manager"))
			{
				salary[i] = salary[i] + (salary[i]*0.1)+(salary[i]*0.07)-(salary[i]*0.05);
				System.out.println("As You are Manager you are eligible for extra 15% bonus");
				System.out.println();
				System.out.println("ID          : "+id[i]);
				System.out.println("Name        : "+name[i]);
				System.out.println("Salary      : "+salary[i]);
				System.out.println("Designation : "+desg[i]);
				System.out.println("Bonus 15%   : "+salary[i]*0.15);

			}
			else if(desg[i].equals("Developer"))
			{
				salary[i] = salary[i] + (salary[i]*0.1)+(salary[i]*0.07)-(salary[i]*0.05);
				System.out.println("As You are Devloper you are eligible for extra 10% bonus");
				System.out.println();
				System.out.println("ID          : "+id[i]);
				System.out.println("Name        : "+name[i]);
				System.out.println("Salary      : "+salary[i]);
				System.out.println("Designation : "+desg[i]);
				System.out.println("Bonus 10%   : "+salary[i]*0.1);

			}
			else
			{
				salary[i] = salary[i] + (salary[i]*0.1)+(salary[i]*0.07)-(salary[i]*0.05);
				System.out.println();
				System.out.println("ID          : "+id[i]);
				System.out.println("Name        : "+name[i]);
				System.out.println("Salary      : "+salary[i]);
				System.out.println("Designation : "+desg[i]);
			}

		}
	}
}