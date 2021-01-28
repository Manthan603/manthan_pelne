package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.Product;
import dao.DaoLayer;
import service.ProductService;

public class DaoLayerTest 
{
	static DaoLayer dl;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		dl = new DaoLayer();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		dl.close();
	}

	//@Test
	public void testDaoAddProduct() throws ClassNotFoundException, SQLException 
	{
		Product p = new Product();
		p.setPid(10);
		p.setPname("Cab");
		p.setPrice(1245.0f);
		
		int res = dl.daoAddProduct(p);
		if(res>0)
			res=1;
		assertEquals(1,res);
	}

	//@Test
	public void testUpdateDao() throws ClassNotFoundException, SQLException 
	{
		Product p = new Product();
		p.setPid(7);
		p.setPname("Tab");
		p.setPrice(1234.0f);
		
		int res = dl.updateDao(p);
		if(res>0)
			res=1;
		assertEquals(1,res);
	}

	//@Test
	public void testDeleteDao() throws ClassNotFoundException, SQLException 
	{
		int id = 7;
		int res = dl.deleteDao(id);
		if(res>0)
			res=1;
		assertEquals(1,res);
	}

	@Test
	public void testDisplayAllDao() throws ClassNotFoundException, SQLException 
	{
		List<Product> lisObj = dl.displayAllDao();
		assertEquals(5, lisObj.size());
	}

}
