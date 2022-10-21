package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.MySqlConnector.MySqlDBConnector;
import com.xworkz.dto.ProjectorDTO;

public class ProjectorRepositoryImpl implements ProjectorRepository {

	public ProjectorRepositoryImpl() {
		System.out.println("ProjectorRepositoryImpl"+getClass().getSimpleName());
	}
	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("Projector created"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(MySqlDBConnector.URL.getValue(), MySqlDBConnector.
					USERNAME.getValue(), MySqlDBConnector.SECREATE.getValue());
			System.out.println("Data connetion:"+conn);
			String sql="insert into projector('"+dto.getName()+"','"+dto.getBrand()+"',"
					+ "'"+dto.getColor()+"',"+dto.getLength()+","+dto.getWidth()+")";
			Statement state=conn.createStatement();
			int execute=state.executeUpdate(sql);
			if(execute>0) {
				System.out.println("Data stored");
			}
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
