
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import bean.*;
public class Assignment8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size,id,choice;
		String name;
		float salary;
		boolean flag= true;
		System.out.println("Enter the Number of employees you have");
		size = sc.nextInt();
		ArrayList<Employee>emp = new ArrayList<Employee>();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Id, Name,Salary Of Employee");
			id = sc.nextInt();
			name = sc.next();
			salary = sc.nextFloat();
			emp.add(new Employee(id,name,salary));
		}
		
		do
		{
			System.out.println("Enter the Appropriate Option");
			System.out.println("1. Sorting By Id In Asscending Order");
			System.out.println("2. Sorting By Id In Discending Order");
			System.out.println("3. Sorting By Name In Asscending Order");
			System.out.println("4. Sorting By Name In Discending Order");
			System.out.println("5. Sorting By Salary In Asscending Order");
			System.out.println("6. Sorting By Salary In Discending Order");
			System.out.println("7. Exit ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
						Collections.sort(emp,new SortIdAsc());
						Iterator<Employee> e1 = emp.iterator();
						while(e1.hasNext())
						{
							System.out.println(e1.next());
						}
						System.out.println();
						break;
				case 2:
						Collections.sort(emp,new SortIdDes());
						Iterator<Employee> e2 = emp.iterator();
						while(e2.hasNext())
						{
							System.out.println(e2.next());
						}
						System.out.println();
						break;
				case 3:
						Collections.sort(emp,new SortNameAsc());
						Iterator<Employee> e3 = emp.iterator();
						while(e3.hasNext())
						{
							System.out.println(e3.next());
						}
						System.out.println();
						
						break;
				case 4:
						Collections.sort(emp,new SortNameDsc());
						Iterator<Employee> e4 = emp.iterator();
						while(e4.hasNext())
						{
							System.out.println(e4.next());
						}
						System.out.println();
						break;
				case 5:
						Collections.sort(emp,new SortSalAsc());
						Iterator<Employee> e5 = emp.iterator();
						while(e5.hasNext())
						{
							System.out.println(e5.next());
						}
						System.out.println();
						break;
				case 6:
						Collections.sort(emp,new SortSalDsc());
						Iterator<Employee> e6 = emp.iterator();
						while(e6.hasNext())
						{
							System.out.println(e6.next());
						}
						System.out.println();
						break;
				case 7:
						flag=false;
						break;
				default:
						System.out.println("Enter Appropriate option");
						break;
			}
			
		}while(flag);
	}
}
