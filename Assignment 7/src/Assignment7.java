import java.util.Scanner;
import java.util.*;
class Assignment7
{
	public static void main(String args[])
	{
		int size;
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of string elements");
		size = sc.nextInt();
		String name[] = new String[size];
		for(int i=0;i<size;i++)
		{
			name[i] = sc.next();
		}

		Arrays.sort(name,Collections.reverseOrder());

		for(int i=0;i<size;i++)
		{
			System.out.println(name[i]);
		}
	}
}