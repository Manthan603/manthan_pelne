import java.util.Scanner;
class Student
{
	int sId;
	String sName;
	int age;
	int []marks = new int[4];
	String grade;
	Scanner sc = new Scanner(System.in);
	public void read()
	{
		System.out.println("Please Enter the Your Id, Name and Age");
		sId = sc.nextInt();
		sName = sc.next();
		age = sc.nextInt();
		System.out.println("Please Enter Your Marks Of Physics, Chemistry, Maths, Biology In sqeuence Please ! ");
		for(int i=0;i<4;i++)
		{
			marks[i] = sc.nextInt();
		}
	}
	public void calGrade()
	{
		int sum=0;
		for(int i=0;i<4;i++)
		{
			sum = sum + marks[i];
		}
		float gradem = sum/4.0f;
		if(gradem>90.0f)
			grade = "A+";
		else if(gradem>80.0f && gradem<90.0f)
			grade = "A";
		else if(gradem>70.0f && gradem<80.0f)
			grade = "B";
		else if(gradem>55.0f && gradem<70.0f)
			grade = "c";
		else
			grade = "D";
	}
	public void display()
	{
		System.out.println("Id                 :"+sId);
		System.out.println("Name               :"+sName);
		System.out.println("Age                :" + age);
		System.out.println("Marrks id Physics  :"+marks[0]);
		System.out.println("Marrks id Chemistry:"+marks[1]);
		System.out.println("Marrks id Maths    :"+marks[2]);
		System.out.println("Marrks id Biology  :"+marks[3]);
		System.out.println("Gradd              :"+grade);
	}
}
class StudentTestA5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("Enter The Count Of Student");
		size = sc.nextInt();

		Student std[] = new Student[size];

		for(int i=0;i<size;i++)
		{
			std[i] = new Student();
			std[i].read();
		}
		for(int i=0;i<size;i++)
		{
			std[i].calGrade();
		}
		for(int i=0;i<size;i++)
		{
			std[i].display();
			System.out.println();
		}
	}
}