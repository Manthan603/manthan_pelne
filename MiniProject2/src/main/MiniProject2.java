package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import bean.Product;
import service.ProductService;


public class MiniProject2
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int i,temp,choice=0;
		String name;
		float price;
		boolean flag = true;
		FileOutputStream fs=null;
		FileInputStream fis=null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		ProductService ps = new ProductService();
		HashMap map = new HashMap<Integer, Product>();
		
		/*File f = new File("Store.txt");
		if(f.exists())
		{
			fis = new FileInputStream("Store.txt");
			ois = new ObjectInputStream(fis);
			ps = (ProductService) ois.readUnshared();
			fis.close();
			ois.close();
			fs = new FileOutputStream("Store.txt");
			oos = new ObjectOutputStream(fs);
			oos.writeUnshared(ps);
			System.out.println("File Is Present ");
			//fs = new FileOutputStream("Store.txt");
			//oos = new ObjectOutputStream(fis);
			System.out.println(ps);
		}
		else
		{
			System.out.println("File Is Created First Time ");
			fs = new FileOutputStream("Store.txt");
			oos = new ObjectOutputStream(fs);
			System.out.println(oos);
			//oos.writeObject(ps);
		}*/
		
		do
		{
			System.out.println("Enter the Appropriate Option");
			System.out.println("1. Add Product");
			System.out.println("2. Update the Product Price");
			System.out.println("3. Delete the Product");
			System.out.println("4. View All Product");
			System.out.println("5. View Price of the Product");
			System.out.println("6. Exit");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
						System.out.println("Enter Your Product Name ane Price");
						name = sc.next();
						price = sc.nextFloat();
						int num = ps.addProduct(name, price);
						System.out.println("Please note Your Product Id : " + num);
						System.out.println( num);
						choice=0;
						break;
				case 2:
						System.out.println("Enter Your Product Id");
						num = sc.nextInt();
						System.out.println("Enter Your Product Price");
						price = sc.nextFloat();
						num = ps.updateProduct(num, price);
						System.out.println("Product Price Updated");
						System.out.println();
						break;
				case 3:
						System.out.println("Enter Your Product Id");
						num = sc.nextInt();
						num = ps.deleteProduct(num);
						System.out.println("Product Deleted");
						System.out.println();
						break;
				case 4:
						map = ps.displayAllProduct();
						System.out.println(map);
						Collection ss =  map.values();
						Iterator it = ss.iterator();
						while(it.hasNext())
						{
							System.out.println(it.next()); ;
						}
						
						System.out.println();
						break;
				case 5:
						System.out.println("Enter Your Product Id");
						num = sc.nextInt();
						price = ps.retrieveProductPrice(num);
						
						System.out.println(price);
						
						System.out.println();
						break;
				case 6:
					/*oos.writeObject(ps);;
						oos.close();
						fs.close();
						fis.close();
						ois.close();*/
						flag=false;
						break;
				default:
						System.out.println("Enter Appropriate option");
						
			}
			
		}while(flag);
		System.out.println("test 1");
	}
}
