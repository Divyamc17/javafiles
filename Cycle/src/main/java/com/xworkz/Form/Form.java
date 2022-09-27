package com.xworkz.Form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4,urlPatterns = "/job")
public class Form extends HttpServlet {
	
	
   public Form() {
	System.out.println("default constructor");
	
}
   
	private List<FormDTO> dtos =new ArrayList();
  
	@Override
protected void service(HttpServletRequest res, HttpServletResponse req) throws ServletException, IOException {
	   String name=res.getParameter("name");
	   String Email=res.getParameter("email");
	   String cont=res.getParameter("phoneno");
	   String alno=res.getParameter("alternativeno");
	   String gen=res.getParameter("Gender");
	   String qua=res.getParameter("Qualification");
	   String yer=res.getParameter("Year of Passout");
	   String uni=res.getParameter("University");
	   String add=res.getParameter("address");
	   String skill=res.getParameter("skill");
	   String skill1=res.getParameter("skill1");
	   String skill2=res.getParameter("skill2");
	   String skill3=res.getParameter("skill3");
	   String skill4=res.getParameter("skill4");
	   String skill5=res.getParameter("skill5");
	   String skill6=res.getParameter("skill6");
	   String skill7=res.getParameter("skill7");
	   String skill8=res.getParameter("skill8");
	   String skill9=res.getParameter("skill9");
	   String skill10=res.getParameter("skill10");
	   String sal=res.getParameter("salary");
	   String exp=res.getParameter("Experience");
	   String proof=res.getParameter("ID Proof");
	   String proo=res.getParameter("proofno");
	   
	   System.out.println("Name:"+name);
	   System.out.println("Email:"+Email);
	   System.out.println("Contact no:"+cont);
	   System.out.println("Alter No:"+alno);
	   System.out.println("Gender:"+gen);
	   System.out.println("Qualification:"+qua);
	   System.out.println("Year Of passing:"+yer);
	   System.out.println("University:"+uni);
	   System.out.println("Address:"+add);
	   System.out.println("Skill:"+skill);
	   System.out.println(skill1);
	   System.out.println(skill2);
	   System.out.println("Salary:"+sal);
	   System.out.println("Experience:"+exp);
	   System.out.println("ID Proof:"+proof);
	   System.out.println("Proof no:"+proo);
	  
	   
   	  
   	   req.setContentType("text/html");
   	   PrintWriter writer=req.getWriter();
   	   writer.append("<html>")
   	   .append("<head>")
   	   .append("<h1>")
   	   .append("Programm is execute")
   	   .append("</h1>")
   	   .append("</head>")
   	   .append("<body>")
   	   .append("<h3>Registration is sucess,below is details</h3>")
   	   .append(name)
   	   .append(Email)
   	   .append(cont)
   	   .append(alno)
   	   .append(gen)
       .append(qua)
       .append(yer)
   	   .append(uni)
   	   .append(add)
       .append(skill)
       .append(skill1)
       .append(skill2)
   	   .append(sal)
       .append(exp)
   	   .append(proof)
       .append(proo)
  	   .append("</body>")
   	   .append("</html>");
   	   
   	  FormDTO dto=new FormDTO(name,Email,Long.parseLong(cont),Long.parseLong(alno),
   			gen,qua,Integer.parseInt(yer),uni,add,skill,skill1,skill2,Double.parseDouble(sal),
   			Integer.parseInt(exp),proof,proo);
   	  
   	dtos.add(dto);
   	  
   	  
   	  
	
   	  
   	}

   		}	
