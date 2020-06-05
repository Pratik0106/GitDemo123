package com.javabykiran.SpringBootApplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SpringDao {

	Connection conn;
	
	public Connection getConnection() throws Exception
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3309/springmvc", "root","root");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	public List<String> getAlluser() throws Exception {
		// TODO Auto-generated method stub
		SpringDao dao=new SpringDao();
		Connection con=dao.getConnection();
		
		Statement stmt=con.createStatement();
		String query="select * from user";
		
		ResultSet rs=stmt.executeQuery(query);
		
		ArrayList<String> arraylist_user=new ArrayList<>();
		while(rs.next())
		{
			//int id=rs.getInt("id");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String address=rs.getString("address");
			String contact=rs.getString("contact");
			String username=rs.getString("username");
			
			arraylist_user.add(id);
			arraylist_user.add(name);
			arraylist_user.add(address);
			arraylist_user.add(contact);
			arraylist_user.add(username);
			
		}
		System.out.println(arraylist_user);
		
		return arraylist_user;
	}

	public List<String> getAlluserbyid(int id) throws Exception {
		// TODO Auto-generated method stub
		SpringDao dao=new SpringDao();
		Connection conn=dao.getConnection();
		Statement stmt=conn.createStatement();
		String query="select * from user where id="+id;
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> listuser=new ArrayList<>();
		while(rs.next())
		{
			String name=rs.getString("name");
			String address=rs.getString("address");
			String contact=rs.getString("contact");
			String username=rs.getString("username");
			
			listuser.add(name);
			listuser.add(address);
			listuser.add(contact);
			listuser.add(username);
				
		}
		
		
		return listuser;
	}

	public List<String> getAlluserbyname(String name) throws Exception {
		// TODO Auto-generated method stub
		SpringDao dao=new SpringDao();
		
		Connection conn=dao.getConnection();
		Statement stmt=conn.createStatement();
		String query="select * from user where name='"+name+"'";
		ResultSet rs=	stmt.executeQuery(query);
		ArrayList<String> listuser=new ArrayList<>();
		while(rs.next())
		{
			String id=rs.getString("id");
			String address=rs.getString("address");
			String contact=rs.getString("contact");
			String username=rs.getString("username");
			
			listuser.add(id);
			listuser.add(address);
			listuser.add(contact);
			listuser.add(username);
			
		}
		
		
		
		return listuser;
	}

	public List<String> getAlluserbystatus(String status) throws Exception {
		SpringDao dao=new SpringDao();
		
		Connection conn=dao.getConnection();
		Statement stmt=conn.createStatement();
		String query="select * from user where status='"+status+"'";
		ResultSet rs=stmt.executeQuery(query);
		ArrayList<String> listuser=new ArrayList<>();
		while(rs.next())
		{
			String id=rs.getString("id");
			String name=rs.getString("name");
			String address=rs.getString("address");
			String contact=rs.getString("contact");
			String username=rs.getString("username");
			
			listuser.add(id);
			listuser.add(name);
			listuser.add(address);
			listuser.add(contact);
			listuser.add(username);
		}
		return listuser;
	}

}
