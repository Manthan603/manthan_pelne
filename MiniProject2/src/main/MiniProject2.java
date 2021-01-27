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

import bean.Init;
import bean.Product;
import service.ProductService;


public class MiniProject2
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int i,num,temp,choice=0;
		String name,id;
		float price;
		boolean flag = true;
		int a = 10;
		
		FileOutputStream fs=null;
		FileOutputStream ffs=null;
		FileInputStream fis=null;
		FileInputStream ffis=null;
		ObjectOutputStream oos=null;
		ObjectOutputStream foos=null;
		ObjectInputStream ois=null;
		ObjectInputStream fois=null;
		ProductService ps = new ProductService();
		ProductService ps1 = new ProductService();
		Init ii = new Init();
		HashMap map = new HashMap<Integer, Product>();
		
		File fi = new File("StoreInit.txt");
		if(fi.exists())
		{
			ffis = new FileInputStream("StoreInit.txt");
			fois = new ObjectInputStream(ffis);
			ii = (Init) fois.readObject();
			a = ii.getI();
			ffis.close();
			fois.close();
		}
		else
		{
			ffs = new FileOutputStream("StoreInit.txt");
			foos = new ObjectOutputStream(ffs);
		}
		
		File f = new File("Store.txt");
		if(f.exists())
		{
			fis = new FileInputStream("Store.txt");
			ois = new ObjectInputStream(fis);
			ps = (ProductService) ois.readObject();
			fis.close();
			ois.close();
		}
		else
		{
			fs = new FileOutputStream("Store.txt");
			oos = new ObjectOutputStream(fs);
			System.out.println(oos);
		}
		
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
						map = ps.displayAllProduct();
						Collection ss1 =  map.values();
						Iterator it1 = ss1.iterator();
						System.out.println("Enter Your Product Name ane Price");
						name = sc.next();
						price = sc.nextFloat();
						boolean inflag = true;
						while(it1.hasNext())
						{
							Product pct = (Product)it1.next();
							if(pct.getPname().equals(name))
							{
								System.out.println("This Poduct already Ragistred : " + pct.getPname());
								System.out.println();
								inflag=false;
								break;
							}						
						}
						if(inflag)
						{
							id = ps.addProduct(a,name, price);
							a++;
							System.out.println("Please note Your Product Id : " + id);
							System.out.println();
							choice=0;
						}
						break;
				case 2:
						System.out.println("Enter Your Product Id");
						id = sc.next();
						System.out.println("Enter Your Product Price");
						price = sc.nextFloat();
						num = ps.updateProduct(id, price);
						System.out.println("Product Price Updated");
						System.out.println();
						break;
				case 3:
						System.out.println("Enter Your Product Id");
						id = sc.next();
						num = ps.deleteProduct(id);
						System.out.println("Product Deleted");
						System.out.println();
						break;
				case 4:
						map = ps.displayAllProduct();
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
						id = sc.next();
						price = ps.retrieveProductPrice(id);
						System.out.println(price);
						System.out.println();
						break;
				case 6:
						fs = new FileOutputStream("Store.txt");
						oos = new ObjectOutputStream(fs);
						oos.writeObject(ps);
						ii.setI(a++);
						
						
						ffs = new FileOutputStream("StoreInit.txt");
						foos = new ObjectOutputStream(ffs);
						foos.writeObject(ii);
						
						oos.close();
						fs.close();
						flag=false;
						
						break;
				default:
						System.out.println("Enter Appropriate option");
						
			}
			
		}while(flag);
		System.out.println("test 1");
	}
}
