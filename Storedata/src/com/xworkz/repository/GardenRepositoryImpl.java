package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.MySqlConnector.MySqlDBConnector;
import com.xworkz.dto.GardenDTO;

public class GardenRepositoryImpl implements GardenRepository {

	@Override
	public boolean save(GardenDTO dto) {
		System.out.println("running method is created"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(MySqlDBConnector.URL.getValue(),MySqlDBConnector.USERNAME.getValue(),
					MySqlDBConnector.SECREATE.getValue());
			String sql="insert into garden values('"+dto.getName()+"','"+dto.getLength()+"','"+dto.getWidth()+"',"
					+ "'"+dto.getNoSeats()+"','"+dto.getNoTrees()+"');";
			System.out.println(sql);
			Statement state=conn.createStatement();
			int execute=state.executeUpdate(sql);
			if(execute>0) {
				System.out.println("Data Store:"+sql);
			}
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}

}
