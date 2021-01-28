
import java.util.Scanner;
class EmployeeDetails
{
	int []id;
	double []salary;
	String []name;
	String []desg;
	Scanner sc = new Scanner(System.in);
	int size=0;
	EmployeeDetails []emp;
	public EmployeeDetails(int size)
	{
		this.size = size;
		id = new int[size];
		name = new String[size];
		salary = new double[size];
		desg = new String[size];

	}

	public void read()
	{
		for( int i=0 ; i<size ; i++)
		{
			int temp;
			System.out.println("Now you enter the details in a sequence of id, Name,Salary,Designatio ONLY");
			temp = sc.nextInt();

			id[i] = temp;
			sc.nextLine();
			name[i] = sc.next();
			salary[i] = sc.nextDouble();
			sc.nextLine();
			desg[i] = sc.next();
		}
	}
	public void salary()
	{
		for(int i=0;i<size;i++)
		{
			salary[i] = salary[i] + (salary[i]*0.1)+(salary[i]*0.07)-(salary[i]*0.05);
		}
	}
	public void bonus()
	{
		for( int i=0;i<size;i++)
		{
			if(desg[i].equals("Manager"))
				salary[i] = salary[i] + salary[i]*0.15;
			else if(desg[i].equals("Devloper"))
				salary[i] = salary[i] + salary[i]*0.07;
			else
				salary[i] = salary[i];
		}
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println("ID          :"+id[i]);
			System.out.println("Name        :"+name[i]);
			System.out.println("Salary      :"+salary[i]);
			System.out.println("Designation :"+desg[i]);
		}
	}
}
class EmployeeTest
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int size=0;
		System.out.println("Please Enter the Number of Employees");
		size = sc.nextInt();
		EmployeeDetails emp = new EmployeeDetails(size);
		emp.read();
		emp.salary();
		emp.bonus();
		emp.display();

	}
}