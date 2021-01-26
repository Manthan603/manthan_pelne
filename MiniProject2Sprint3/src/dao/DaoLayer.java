package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Product;

public class DaoLayer
{
	Connection con = null;
	boolean flag;
	int pid;
	
	public void initialize() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Coonection Is Esatablished " + con);
		System.out.println();
	}
	
	public int daoAddProduct(String name, float price) throws SQLException
	{
		PreparedStatement c = con.prepareStatement("select pid from Product where pid = (select max(pid) from product)");
		ResultSet rs = c.executeQuery();
		while(rs.next())
		{
			pid = rs.getInt(1);
			pid++;
		}
		PreparedStatement p = con.prepareStatement("insert into Product values(?,?,?)");
		p.setInt(1, pid);
		p.setString(2, name);
		p.setFloat(3, price);
		flag= p.execute();
		return (pid);
	}
	
	public int updateDao(int pid, float price) throws SQLException
	{
		PreparedStatement c = con.prepareStatement("update Product set price = ? where pid = ?");
		//con.prepareStatement("delete from emp1 where id=?");
		c.setFloat(1, price);
		c.setInt(2, pid);
		int flag = c.executeUpdate();
		return flag;
	}
	
	public int deleteDao(int pid) throws SQLException
	{
		PreparedStatement c = con.prepareStatement("delete from Product where pid = ?");
		c.setInt(1, pid);
		int flag = c.executeUpdate();
		return flag;
		
	}
	
	public ArrayList displayAllDao() throws SQLException
	{
		PreparedStatement c = con.prepareStatement("select * from Product");
		ResultSet rs = c.executeQuery();
		ArrayList<Product> demoProduct = new ArrayList<>();
		while(rs.next())
		{
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			demoProduct.add(p);
		}
		return demoProduct;
		
	}
	
	public void closeDao() throws SQLException
	{
		close();
	}
	
	
	 public void close() {
        
         try {
             con.close();
             System.out.println("Closing Connection");
         } catch(SQLException e) {
             System.out.println(e.getMessage());
         }
     }
}
