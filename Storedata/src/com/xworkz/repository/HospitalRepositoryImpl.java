package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.MySqlConnector.MySqlDBConnector;
import com.xworkz.dto.HospitalDTO;


public class HospitalRepositoryImpl implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("running save method "+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(MySqlDBConnector.URL.getValue(),
					MySqlDBConnector.USERNAME.getValue(), MySqlDBConnector.SECREATE.getValue());
			System.out.println("Database connection:"+conn);
			String sql="insert into hospitaldetails values ("+dto.getId()+",'"+dto.getName()+"','"+dto.getSpecialist()+"','"+dto.getFounder()+"',"+dto.getSince()+");";
			System.out.println("Generated data:"+sql);
			Statement state=conn.createStatement();
			int execute=state.executeUpdate(sql);
			if(execute>0) {
				System.out.println("Data stored");
				return true;
			}
		} catch (ClassNotFoundException  | SQLException e ) {
			//e.printStackTrace();
			e.getMessage();
		}
		return true;
	}

}
