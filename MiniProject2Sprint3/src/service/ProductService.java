package service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

import bean.Product;
import dao.DaoLayer;

public class ProductService
{
	Integer pid;

	DaoLayer dao1 = new DaoLayer();
	
	public void init() throws ClassNotFoundException, SQLException
	{
		dao1.initialize();
	}
	
	public int addProduct(int a, String name,float price) throws SQLException
	{
		
		int pid = dao1.daoAddProduct(name, price);;	
		return pid;
	}
	
	public int updateProduct(int pid,float price) throws SQLException
	{
		int statuc = dao1.updateDao(pid,price);
		return 1;
	}
	
	public int deleteProduct(int pid) throws SQLException
	{
		int id = dao1.deleteDao(pid);
		return id;
	}
	
	public ArrayList<Product> displayAllProduct() throws SQLException
	{		
		ArrayList<Product> p = (ArrayList<Product>) dao1.displayAllDao().stream().collect(Collectors.toList());
		return p;
	}
	
	public ArrayList<Product> displayAllProductNs() throws SQLException
	{		
		Comparator<Product> sortName = (Product p1, Product p2)->p1.getPname().compareTo(p2.getPname());
		
		return (ArrayList<Product>) dao1.displayAllDao().stream().sorted(sortName).collect(Collectors.toList());
	}
	
	public ArrayList<Product> displayAllProductNd() throws SQLException
	{		
		
        Comparator<Product> sortName = (Product p1, Product p2)->p2.getPname().compareTo(p1.getPname());
		
		return (ArrayList<Product>) dao1.displayAllDao().stream().sorted(sortName).collect(Collectors.toList());
	}
	
	public ArrayList<Product> displayAllProductPs() throws SQLException
	{		
		
        Comparator<Product> sortName = (Product p1, Product p2)->(int)(p1.getPrice()-p2.getPrice());
		
		return (ArrayList<Product>) dao1.displayAllDao().stream().sorted(sortName).collect(Collectors.toList());
	}
	
	public ArrayList<Product> displayAllProductPd() throws SQLException
	{		
		
        Comparator<Product> sortName = (Product p1, Product p2)->(int)(p2.getPrice()-p1.getPrice());
		
		return (ArrayList<Product>) dao1.displayAllDao().stream().sorted(sortName).collect(Collectors.toList());
	}
	
	public void close() throws SQLException 
	{
		dao1.closeDao();
	}
		
}
