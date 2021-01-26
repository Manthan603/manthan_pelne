package main;


import java.util.ArrayList;
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

public class MiniProject2S3
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int i,id,num,temp,choice=0;
		String name;
		float price;
		boolean flag = true,checkFlag=true;
		int a = 1001;
		ArrayList<Product> pr = new ArrayList<>();
		
		ProductService ps = new ProductService();
			
		ps.init();
		
		do
		{
			System.out.println("Enter the Appropriate Option");
			System.out.println("1. Add Product");
			System.out.println("2. Update the Product Price");
			System.out.println("3. Delete the Product");
			System.out.println("4. View All Product");
			System.out.println("5. View All Product By Assending Order of Product Name");
			System.out.println("6. View All Product By Discending Order of Product Name");
			System.out.println("7. View All Product By Assending Order of Product Price");
			System.out.println("8. View All Product By Discending Order of Product Name");
			System.out.println("9. Exit");
			
			choice = sc.nextInt();
			
			
			switch(choice)
			{
				case 1:
						System.out.println("Enter Your Product Name ane Price");
						name = sc.next();
						price = sc.nextFloat();
						ArrayList<Product> temp2 = ps.displayAllProduct();
						for(Product tempv : temp2)
						{
							if(tempv.getPname().equals(name))
								checkFlag=false;
						}
						if(checkFlag)
						{
							id = ps.addProduct(a,name, price);
							System.out.println();
							System.out.println("Please Note The Product ID : "+id);
							System.out.println();
						}
						else
						{
							System.out.println();
							System.out.println("This Named Product Already Registerd");
							System.out.println();
						}
						
						break;
				case 2:
						System.out.println("Enter Your Product Id");
						id = sc.nextInt();
						System.out.println("Enter Your Product Price");
						price = sc.nextFloat();
						num = ps.updateProduct(id, price);
						System.out.println();
						System.out.println("Product Price Updated");
						System.out.println();
						break;
				case 3:
						System.out.println("Enter Your Product Id");
						id = sc.nextInt();
						num = ps.deleteProduct(id);
						System.out.println();
						System.out.println("Product Deleted");
						System.out.println();
						break;
				case 4:
						System.out.println();
						ps.displayAllProduct().stream().forEach(p->System.out.println(p));
						System.out.println();
						break;
				case 5:
						System.out.println();
						ps.displayAllProductNs().stream().forEach(p1->System.out.println(p1));
						System.out.println();
						break;
				case 6:
						System.out.println();
						ps.displayAllProductNd().stream().forEach(p2->System.out.println(p2));
						System.out.println();
						break;
				case 7:
						System.out.println();
						ps.displayAllProductPs().stream().forEach(p3->System.out.println(p3));
						System.out.println();
						break;
				case 8:
						System.out.println();
						ps.displayAllProductPd().stream().forEach(p4->System.out.println(p4));
						System.out.println();
						break;
				case 9:
						ps.close();
						flag=false;
						break;
				default:
						System.out.println("Enter Appropriate option");
			}
			
		}while(flag);
		
		System.out.println("test 1");
	}
}
