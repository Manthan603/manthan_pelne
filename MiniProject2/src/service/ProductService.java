package service;

import java.io.Serializable;
import java.util.HashMap;

import bean.Product;

public class ProductService implements Serializable
{
	HashMap map = new HashMap<Integer, Product>();
	public static int i= 1000;
	
	public int addProduct(String name,float price)
	{
		Product p = new Product(i,name,price);
		Integer I = new Integer(i);
		map.put(I, p);
		i++;
		return i-1;
	}
	
	public int updateProduct(int i,float price)
	{
		Integer I = new Integer(i);
		Product p = (Product) map.get(I);
		p.setPrice(price);
		
		return 1;
	}
	
	public int deleteProduct(int i)
	{
		Integer I = new Integer(i);
		map.remove(I);
		return 1;
	}
	
	public HashMap displayAllProduct()
	{		
		return map;
	}
	
	public float retrieveProductPrice(int i)
	{
		Integer I = new Integer(i);
		Product p = (Product) map.get(I);
		
		return p.getPrice();
	}

	
	
	
}
