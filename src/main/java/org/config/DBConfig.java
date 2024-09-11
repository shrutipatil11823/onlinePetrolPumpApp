package org.config;

import java.sql.*;

import org.petrolpump.helper.pathHelper;

import com.mysql.cj.protocol.Resultset;

public class DBConfig
{
	protected Connection c;
	protected ResultSet rs;
	protected PreparedStatement p;
	
	public DBConfig()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/petrolpump","root","shruti");
		}catch(Exception ex)
		{
			System.out.println("Exception ex");
		}
	}

}




