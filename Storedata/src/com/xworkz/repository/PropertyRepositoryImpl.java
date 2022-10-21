package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.MySqlConnector.MySqlDBConnector;
import com.xworkz.dto.PropertyDTO;
import com.xworkz.service.PropertyService;

public class PropertyRepositoryImpl implements  PropertyRepository {

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("running method"+dto);
		try {
			Class.forName("com.mysql.cj.jdbs.Driver");
			Connection conn=DriverManager.getConnection(MySqlDBConnector.URL.getValue(), MySqlDBConnector.
					USERNAME.getValue(), MySqlDBConnector.SECREATE.getValue());
			System.out.println("Data connection:"+conn);
			String sql="insert into property values('"+dto.getName()+"',"+dto.getLength()+","
					+ ""+dto.getWidth()+",'"+dto.getBelongs()+"','"+dto.getType()+"')";
			System.out.println("Generated data:"+sql);
			Statement state=conn.createStatement();
			int execute=state.executeUpdate(sql);
			if (execute>0)
			{
				System.out.println("Data Stored");
				return true;
			}
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	
}
