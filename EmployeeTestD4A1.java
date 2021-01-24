Day 4 15/Jan/21:

import java.util.*;

class Address
{
	String city,state;
	int pinCode;
	Scanner sc = new Scanner(System.in);

	public void readAdd()
	{
		System.out.println("Enter Your City, State, Pincode");
		city = sc.next();

		state = sc.next();
		pinCode = sc.nextInt();
	}
	public void disAdd()
	{
		System.out.println("Your City : "+city+", State : "+state + ", Pincode : "+pinCode);
	}
}

class Employee
{
	int id;
	String name;
	double salary;
	Address add = new Address();
	Scanner sc = new Scanner(System.in);

	public void read()
	{
		System.out.println("Enter Your ID, Name, Salary");
		id = sc.nextInt();
		name = sc.next();
		salary = sc.nextFloat();
	}
	public void calSalary()
	{
		salary= salary + (salary*0.1)+(salary*0.07)-(salary*0.05);
	}
	public void display()
	{
		System.out.println("Your ID : "+id+", Name : "+name + ", Salary : "+salary);
	}

}

class Manager extends Employee
{
	int numberOfEmp;

	public void readMgr()
	{
		System.out.println("Enter Number of Employees Under You Have");
		numberOfEmp = sc.nextInt();
		add.readAdd();
	}
	public void disMgr()
	{
		add.disAdd();
		System.out.println("Number of Employees Under You Have :"+numberOfEmp);
	}
}
class Programer extends Employee
{
	String projectName;

	public void readPgr()
	{
		System.out.println("Enter Your Project Name: ");
		projectName = sc.next();
		add.readAdd();
	}
	public void disPgr()
	{
		add.disAdd();
		System.out.println("Project You Have : "+projectName);
	}
}

class EmployeeTestD4A1
{
	public static void main(String agrs[])
	{
		System.out.println("Manager Details");
		Manager mg = new Manager();
		mg.read();
		mg.readMgr();
		mg.display();
		System.out.println("Manager Addrees Details : ");
		mg.disMgr();

		System.out.println("Programer Details");
		Programer pg = new Programer();
		pg.read();
		pg.readPgr();
		pg.display();
		System.out.println("Programer Addrees Details : ");
		pg.disPgr();

	}
}
