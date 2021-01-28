package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.Product;
import service.ProductService;

public class ProductServiceTest 
{
	
	static ProductService ps;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		ps = new ProductService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		ps.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void testAddProduct() throws SQLException, ClassNotFoundException
	{
		Product p = new Product();
		p.setPid(10);
		p.setPname("Can");
		p.setPrice(1245.0f);
		
		String res = ps.addProduct(p);
		String msg = "Record Stored Successfully";
		assertEquals(msg,res);
	}

	//@Test
	public void testUpdateProduct() throws SQLException, ClassNotFoundException
	{
		Product p = new Product();
		p.setPid(101);
		p.setPname("Table");
		p.setPrice(1234.0f);
		
		String res = ps.updateProduct(p);
		String msg = "Record Stored Successfully";
		assertEquals(msg,res);
	}

	//@Test
	public void testDeleteProduct() throws SQLException, ClassNotFoundException 
	{
		int id = 404;
		String res = ps.deleteProduct(id);
		String msg = "Record Stored Successfully";
		assertEquals(msg,res);
	}

	//@Test
	public void testDisplayAllProduct() throws SQLException, ClassNotFoundException
	{
		List<Product> lisObj = ps.displayAllProduct();
		assertEquals(5, lisObj.size());
	}

	//@Test
	public void testDisplayAllProductNs() throws SQLException
	{
		ArrayList<Product> lisObj1 = ps.displayAllProductNs();
		
		assertEquals(5, lisObj1.size());
	}

	@Test
	public void testDisplayAllProductNd() throws SQLException, ClassNotFoundException
	{
		ArrayList<Product> lisObj1 = ps.displayAllProductNd();
		//assertEquals(5, lisObj1.size());
		Product p = lisObj1.get(0);
		assertEquals("Table", p.getPname());
	}

	//@Test
	public void testDisplayAllProductPs() {
		fail("Not yet implemented");
	}

	//@Test
	public void testDisplayAllProductPd() {
		fail("Not yet implemented");
	}

}
