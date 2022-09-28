package com.xworkz.Deatail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet (loadOnStartup = 7, urlPatterns = {"/start", "/ShowDetails"})

public class CompanyDetail extends HttpServlet {
	
	
	public CompanyDetail() {
	 System.out.println("companyDetail");
	}
	private List<CompanyDTO> dtos =new ArrayList();
	
  @Override
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
   String name= req.getParameter("name");
   String founder= req.getParameter("founder");
   String since= req.getParameter("since");
   String employes= req.getParameter("employees");
   String address= req.getParameter("address");
   String business= req.getParameter("business");
   
   System.out.println("Company Name"+name);
   System.out.println("Founder"+founder);
   System.out.println("Since"+since);
   System.out.println("Employees"+employes);
   System.out.println("Address"+address);
   System.out.println("Business"+business);
   
   PrintWriter writ = resp.getWriter();
	writ.append("<html>")
	.append("<body>")
	.append("<h1>")
	.append("Displaying Company Details")
	.append("</h1>")
	.append("Company Name :" + name)
	.append("<br>")
	.append("Founder :" + founder)
	.append("<br>")
	.append("Since :" + since)
	.append("<br>")
	.append("Employees :" + employes)
	.append("<br>")
	.append("Address :" + address)
	.append("<br>")
	.append("Business :" + business)
	.append("</body>")
	.append("</html>");

   CompanyDTO dto=new CompanyDTO(name,founder,since,employes, address, business);
		dtos.add(dto);
   
}
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.setContentType("text/html");
      PrintWriter writer=resp.getWriter();
      writer.append("<html>")
             .append("<head>")
             .append("<h1>Company Details</h1>")
             .append("</head>")
             .append("<body>");
             for (CompanyDTO companyDTO : dtos) {
            	 writer.append("<table>")
            	
            	 
                .append("<tr>")
                .append("<th>CompanyName : <th>")
                 .append("<td>")
                 .append(companyDTO.getCompanyName())
                 .append("</td>")
                 .append("</tr>")
                 
                 .append("<tr>")
                 .append("<th>Founder : <th>")
                 .append("<td>")
                 .append(companyDTO.getFounder())
                 .append("</td>")
                 .append("</tr>")
                 
                 .append("<tr>")
                 .append("<td>") 
                 .append("<th>Since : <th>")
                 .append(companyDTO.getSince())
                 .append("</td>")
                 .append("</tr>")
                 
                 .append("<tr>")
                 .append("<td>")
                 .append("<th>Employee : <th>")
                 .append(companyDTO.getEmployees())
                 .append("</td>")
                 .append("</tr>")
                 
                 .append("<tr>")
                 .append("<td>")
                 .append("<th>Address : <th>")
                 .append(companyDTO.getAddress())
                 .append("</td>")
                 .append("</tr>")
                 
                 .append("<tr>")
                 .append("<td>")
                 .append("<th>Business : <th>")
                 .append(companyDTO.getBusiness())
                 .append("</td>")                 
                 .append("</tr>")
                 .append("</table>");	
            	 
			}
            
            writer .append("</body>")
            .append("</html>");
}
}