package com.xworkz.repository;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.xworkz.mysql.MysqlDBCredential.*;

import com.xworkz.dto.PersonDTO;

public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public boolean save(PersonDTO dto) {
		System.out.println("running method");
		try {
			Class.forName(DRIVER.getValue());
			Connection conn=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
					SCREATE.getValue());
			System.out.println("Data connection:"+conn);
			String sql="insert into person values("+dto.getId()+",'"+dto.getName()+"',"
					+ "'"+dto.getEmail()+"',"+dto.getMobileNumber()+",'"+dto.getGender()+"',"
			    	+ "'"+dto.getQualification()+"','"+dto.getMarried()+"','"+dto.getWorking()+"',"
			    	+ "'"+dto.getCompanyName()+"',"+dto.getSalary()+","+dto.getAge()+","+dto.getExperience()+",'"+dto.getLocation()+"','"+dto.getCity()+"','"+dto.getState()+"','"+dto.getCountry()+"',"+dto.getAadharNo()+",'"+dto.getPanNo()+"','"+dto.getAlive()+"',"+dto.getBankAccountNo()+");";
			        System.out.println("Generated data:"+sql);
			       Statement statement= conn.createStatement();
			       int execute=statement.executeUpdate(sql);
			        if( execute>0) {
			        	System.out.println("Data stored");
			        	return true;
			        }
			       
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

   	
	@Override
   	public void displayAll() {
		try {
			Class.forName(DRIVER.getValue());
			Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SCREATE.getValue());
			String query="Select * from person";
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(query);
			while(result.next()){
				int id=result.getInt(1);
				String name=result.getString(2);
				String email=result.getString(3);
				long mobileNo=result.getLong(4);
			    String gender=result.getString(5);
				String qualification=result.getString(6);
				String married=result.getString(7);
				String working=result.getString(8);
				String companyName=result.getString(9);
				double salary=result.getDouble(10);
				int age=result.getInt(11);
				int experience=result.getInt(12);
				String location=result.getString(13);
				String city=result.getString(14);
				String state=result.getString(15);
				String country=result.getString(16);
				long aadharNo=result.getLong(17);
				String panNo=result.getString(18);
				String alive=result.getString(19);
				long accountNo=result.getLong(20);
				System.out.println(id + " "+name+""+email+""+mobileNo+""+gender+""+qualification+""+married+""
						+working+""+companyName+""+salary+""+age+""+experience+""+location+""+city+""
						+state+""+country+""+aadharNo+""+panNo+""+alive+""+accountNo+"");
					
			}
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
   		
	}


	@Override
	public void displayAllAgeGreaterThanOrderByName(int age) {
		try {
			Class.forName(DRIVER.getValue());
			Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SCREATE.getValue());
			String query="Select * from person where age>= "+age+" order by name" ;
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(query);
			while(result.next()){
				int id=result.getInt(1);
				String name=result.getString(2);
				String email=result.getString(3);
				long mobileNo=result.getLong(4);
				String gender=result.getString(5);
				String qualification=result.getString(6);
				String married=result.getString(7);
				String working=result.getString(8);
				String companyName=result.getString(9);
				double salary=result.getDouble(10);
				int age1=result.getInt(11);
				int experience=result.getInt(12);
				String location=result.getString(13);
				String city=result.getString(14);
				String state=result.getString(15);
				String country=result.getString(16);
				long aadharNo=result.getLong(17);
				String panNo=result.getString(18);
				String alive=result.getString(19);
				long accountNo=result.getLong(20);
				System.out.println(id + " "+name+""+email+""+mobileNo+""+gender+""+qualification+""+married+""
						+working+""+companyName+""+salary+""+age1+""+experience+""+location+""+city+""
						+state+""+country+""+aadharNo+""+panNo+""+alive+""+accountNo+"");
					
			}
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
   		
		
	}


	@Override
	public void displayAllByGenderDescOrderByName(String gender) {
		try {
			Class.forName(DRIVER.getValue());
			Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SCREATE.getValue());
			String query="select * from person where gender = 'Female' order by name ";
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(query);
			while(result.next()){
				int id=result.getInt(1);
				String name=result.getString(2);
				String email=result.getString(3);
				long mobileNo=result.getLong(4);
				String gender1=result.getString(5);
				String qualification=result.getString(6);
				String married=result.getString(7);
				String working=result.getString(8);
				String companyName=result.getString(9);
				double salary=result.getDouble(10);
				int age=result.getInt(11);
				int experience=result.getInt(12);
				String location=result.getString(13);
				String city=result.getString(14);
				String state=result.getString(15);
				String country=result.getString(16);
				long aadharNo=result.getLong(17);
				String panNo=result.getString(18);
				String alive=result.getString(19);
				long accountNo=result.getLong(20);
				System.out.println(id + " "+name+""+email+""+mobileNo+""+gender1+""+qualification+""+married+""
						+working+""+companyName+""+salary+""+age+""+experience+""+location+""+city+""
						+state+""+country+""+aadharNo+""+panNo+""+alive+""+accountNo+"");
					
			}
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
   		
		
	}


	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		try {
			Class.forName(DRIVER.getValue());
			Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SCREATE.getValue());
			String query="select * from person where salary = "+salary+" order by name desc";
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(query);
			while(result.next()){
				int id=result.getInt(1);
				String name=result.getString(2);
				String email=result.getString(3);
				long mobileNo=result.getLong(4);
				String gender1=result.getString(5);
				String qualification=result.getString(6);
				String married=result.getString(7);
				String working=result.getString(8);
				String companyName=result.getString(9);
				double salary1=result.getDouble(10);
				int age=result.getInt(11);
				int experience=result.getInt(12);
				String location=result.getString(13);
				String city=result.getString(14);
				String state=result.getString(15);
				String country=result.getString(16);
				long aadharNo=result.getLong(17);
				String panNo=result.getString(18);
				String alive=result.getString(19);
				long accountNo=result.getLong(20);
				System.out.println(id + " "+name+""+email+""+mobileNo+""+gender1+""+qualification+""+married+""
						+working+""+companyName+""+salary1+""+age+""+experience+""+location+""+city+""
						+state+""+country+""+aadharNo+""+panNo+""+alive+""+accountNo+"");
					
			}
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
				
	}


	@Override
	public void displayCount() {
		try {
			Class.forName(DRIVER.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SCREATE.getValue());
			String read = "select Count(*) from person ";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				System.out.println(id);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
				
	}


	@Override
	public void displaySumOfSalary() {
		try {
			Class.forName(DRIVER.getValue());
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SCREATE.getValue());
			String read = "select sum(salary) from person ";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(read);
			while (executeQuery.next()) {		
				int salary1 = executeQuery.getInt(1);
			
				System.out.println(salary1);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}


	
}
