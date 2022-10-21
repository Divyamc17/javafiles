package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.MySqlConnector.MySqlDBConnector;
import com.xworkz.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {

	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("running method"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(MySqlDBConnector.URL.getValue(),MySqlDBConnector.USERNAME
					.getValue(),MySqlDBConnector.SECREATE.getValue());
			System.out.println("Data saved:"+conn);
			String sql="insert into garage values('"+dto.getName()+"','"+dto.getOwner()+"','"+dto.getNoOfStaff()+"',"
					+ ""+dto.getOpenTime()+","+dto.getCloseTime()+");";
			Statement state=conn.createStatement();
			int execute=state.executeUpdate(sql);
			if(execute>0) {
				System.out.println("Generated data:"+sql);
				return true;
			}
		
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}

}
