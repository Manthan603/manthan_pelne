package service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



import bean.Product;
import dao.DaoLayer;

public class ProductService
{
	Integer pid;

	DaoLayer dao1 = new DaoLayer();
	ArrayList<Product> pro = new ArrayList<Product>();
	
	public ProductService() throws ClassNotFoundException, SQLException
	{
		dao1.initialize();
		pro = (ArrayList<Product>) dao1.displayAllDao().stream().collect(Collectors.toList());
	}
	
	public String addProduct(Product p) throws SQLException, ClassNotFoundException
	{
		if(p.getPrice()<0)
			return "Price Must Be Positive";
		else if(p.getPrice()>0 && p.getPrice()<500)
			return "Price Must Be Grater Than 500";
		else
		{
			int sta = dao1.daoAddProduct(p);
			if(sta>0)
				return "Record Stored Successfully";
			else
				return "Record Not Stored Successfully";
		}
		
	}
	
	public String updateProduct(Product p) throws SQLException, ClassNotFoundException
	{
		
		if(p.getPrice()<0)
			return "Price Must Be Positive";
		else if(p.getPrice()>0 && p.getPrice()<500)
			return "Price Must Be Grater Than 500";
		else
		{
			int status = dao1.updateDao(p);
			System.out.println(status);
			if(status>0)
				return "Record Stored Successfully";
			else
				return "Record  Not Stored Successfully";
		}

	}
	
	public String deleteProduct(int pid) throws SQLException, ClassNotFoundException
	{
		int id = dao1.deleteDao(pid);
		if(id>0)
			return "Record Stored Successfully";
		else
			return "Record  Not Stored Successfully";
	}
	
	public ArrayList<Product> displayAllProduct() throws SQLException, ClassNotFoundException
	{		
		//pro = (ArrayList<Product>) dao1.displayAllDao().stream().collect(Collectors.toList());
		
		//Iterator<Product> itr = pro.iterator();
		
		return pro;
	}
	
	public ArrayList<Product> displayAllProductNs() throws SQLException
	{		
		Comparator<Product> sortName = (Product p1, Product p2)->p1.getPname().compareTo(p2.getPname());
		Iterator<Product> itr = pro.iterator();
		
		pro = (ArrayList<Product>) pro.stream().sorted(sortName).collect(Collectors.toList());
		return pro;
	}
	
	public ArrayList<Product> displayAllProductNd() throws SQLException, ClassNotFoundException
	{		
		
        Comparator<Product> sortName = (Product p1, Product p2)->p2.getPname().compareTo(p1.getPname());
		
		return (ArrayList<Product>) pro.stream().sorted(sortName).collect(Collectors.toList());
	}
	
	public ArrayList<Product> displayAllProductPs() throws SQLException
	{		
		
        Comparator<Product> sortName = (Product p1, Product p2)->(int)(p1.getPrice()-p2.getPrice());
		
		return (ArrayList<Product>) pro.stream().sorted(sortName).collect(Collectors.toList());
	}
	
	public ArrayList<Product> displayAllProductPd() throws SQLException
	{		
		
        Comparator<Product> sortName = (Product p1, Product p2)->(int)(p2.getPrice()-p1.getPrice());
		
		return (ArrayList<Product>) pro.stream().sorted(sortName).collect(Collectors.toList());
	}
	
	public void close() throws SQLException 
	{
		dao1.closeDao();
	}
		
}
