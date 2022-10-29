package com.xworkz.repository;


import static com.xworkz.main.MysqlDB.SCREATE;
import static com.xworkz.main.MysqlDB.URL;
import static com.xworkz.main.MysqlDB.USERNAME;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.dto.SuperMarketDTO;

public class SuperMarketRepositoryImpl implements SuperMarketRepository {

	@Override
	public boolean save(SuperMarketDTO dto) {
		System.out.println("running method");
		try {
			Connection connection = getvalue();
			String sql="insert into supermarket value(?,?,?,?,?,?);";
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setInt(1,dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getCompany());
			statement.setInt(4, dto.getGstNo());
			statement.setLong(5, dto.getPincode());
			statement.setString(6, dto.getType());
			int execute=statement.executeUpdate();
					if(execute>0) {
					System.out.println("mathod executed");	
					}
;		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private Connection getvalue() throws SQLException {
		Connection connection =DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SCREATE.getValue());
		return connection;
	}

	@Override
	public void displayByName(String name) {
		try {
		Connection conn=this.getvalue();
		String sql = "select * from supermarket where name =?";
		PreparedStatement prepareStatement = conn.prepareStatement(sql);
		prepareStatement.setString(1, name);
		ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next()) {
			int id = executeQuery.getInt(1);
			String name1 = executeQuery.getString(2);
			String company= executeQuery.getString(3);
			int gstNo = executeQuery.getInt(4);
			long pincode = executeQuery.getLong(5);
			String type = executeQuery.getString(6);
			System.out.println(id+" "+name1+" "+company+" "+gstNo+" "+pincode+" "+type);
		}
		
		
	}catch (SQLException e) {
		e.printStackTrace();
	}	
	}

	@Override
	public boolean validateAndSave(List<SuperMarketDTO> list) {
		System.out.println("method saved using list"+list);
		try {
			Connection conn=this.getvalue();
			String sql = "insert into supermarket values(?,?,?,?,?,?)";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			
			
			for (SuperMarketDTO superMarketDTO : list) {
				prepareStatement.setInt(1, superMarketDTO.getId());
				prepareStatement.setString(2, superMarketDTO.getName());
				prepareStatement.setString(3, superMarketDTO.getCompany());
				prepareStatement.setInt(4,superMarketDTO.getGstNo());
				prepareStatement.setLong(5, superMarketDTO.getPincode());
				prepareStatement.setString(6, superMarketDTO.getType());
				int executeUpdate = prepareStatement.executeUpdate();
				if(executeUpdate>0) {
					System.out.println(executeUpdate);
				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public SuperMarketDTO findByName(String name) {
		try {
			Connection conn=this.getvalue();
			String sql="select * from supermarket where name=?;";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, name);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while(executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String name1 = executeQuery.getString(2);
				String company= executeQuery.getString(3);
				int gstNo = executeQuery.getInt(4);
				long pincode = executeQuery.getLong(5);
				String type = executeQuery.getString(6);
				System.out.println(id+" "+name1+" "+company+" "+gstNo+" "+pincode+" "+type);
			
	
			SuperMarketDTO superMarketDTO=new SuperMarketDTO(id,name1,company,gstNo,pincode,type);
			return superMarketDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return SuperMarketRepository.super.findByName(name);
	}

	@Override
	public SuperMarketDTO findById(int id) {
		try {
			Connection conn=this.getvalue();
			String sql="select * from supermarket where id=?;";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while(executeQuery.next()) {
				int id1 = executeQuery.getInt(1);
				String name1 = executeQuery.getString(2);
				String company= executeQuery.getString(3);
				int gstNo = executeQuery.getInt(4);
				long pincode = executeQuery.getLong(5);
				String type = executeQuery.getString(6);
				System.out.println(id1+" "+name1+" "+company+" "+gstNo+" "+pincode+" "+type);
			
	
			SuperMarketDTO superMarketDTO=new SuperMarketDTO(id1,name1,company,gstNo,pincode,type);
			return superMarketDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return SuperMarketRepository.super.findById(id);
	}

	@Override
	public List<SuperMarketDTO> findAll() {
		try {
			Connection conn=this.getvalue();
			String sql="select * from supermarket;";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			ResultSet executeQuery = prepareStatement.executeQuery();
			
			List<SuperMarketDTO> list=new ArrayList<SuperMarketDTO>();
			while(executeQuery.next()) {
				int id1 = executeQuery.getInt(1);
				String name1 = executeQuery.getString(2);
				String company= executeQuery.getString(3);
				int gstNo = executeQuery.getInt(4);
				long pincode = executeQuery.getLong(5);
				String type = executeQuery.getString(6);
				System.out.println(id1+" "+name1+" "+company+" "+gstNo+" "+pincode+" "+type);
			
	
			SuperMarketDTO superMarketDTO=new SuperMarketDTO(id1,name1,company,gstNo,pincode,type);
			 list.add(superMarketDTO);
			 return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		return SuperMarketRepository.super.findAll();
	}
	@Override
	public List<SuperMarketDTO> findByType(String type) {
		try {
			Connection conn=this.getvalue();
			String sql="select * from supermarket where type=?;";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, type);
			ResultSet executeQuery = prepareStatement.executeQuery();

			List<SuperMarketDTO> list1=new ArrayList<SuperMarketDTO>();
			while(executeQuery.next()) {
				int id1 = executeQuery.getInt(1);
				String name1 = executeQuery.getString(2);
				String company= executeQuery.getString(3);
				int gstNo = executeQuery.getInt(4);
				long pincode = executeQuery.getLong(5);
				String type1 = executeQuery.getString(6);
				System.out.println(id1+" "+name1+" "+company+" "+gstNo+" "+pincode+" "+type);
			
	
			SuperMarketDTO superMarketDTO=new SuperMarketDTO(id1,name1,company,gstNo,pincode,type1);
			 list1.add(superMarketDTO);
			 return list1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return SuperMarketRepository.super.findByType(type);
	}
	@Override
	public List<SuperMarketDTO> findByPincode(String type, int pincode) {
		try {
			Connection conn=this.getvalue();
			String sql="select * from supermarket where (type=? AND pinode=?)";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, type);
			prepareStatement.setLong(2, pincode);
			ResultSet executeQuery = prepareStatement.executeQuery();

			List<SuperMarketDTO> list1=new ArrayList<SuperMarketDTO>();
			while(executeQuery.next()) {
				int id1 = executeQuery.getInt(1);
				String name1 = executeQuery.getString(2);
				String company= executeQuery.getString(3);
				int gstNo = executeQuery.getInt(4);
				long pincode1 = executeQuery.getLong(5);
				String type1 = executeQuery.getString(6);
				System.out.println(id1+" "+name1+" "+company+" "+gstNo+" "+pincode+" "+type);
			
	
			SuperMarketDTO superMarketDTO=new SuperMarketDTO(id1,name1,company,gstNo,pincode1,type1);
			 list1.add(superMarketDTO);
			 return list1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return SuperMarketRepository.super.findByPincode(type, pincode);
	}
}

		
	


