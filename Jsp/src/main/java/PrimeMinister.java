import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns ="/prime")
public class PrimeMinister extends HttpServlet {

	public PrimeMinister() {
		System.out.println("Prime minister.....created");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String marrige=req.getParameter("marrige");
		String party=req.getParameter("party");
		String age=req.getParameter("age");
		String gender=req.getParameter("Gender");
		String Priood=req.getParameter("period");
		String representedTime=req.getParameter("time");
		
		req.setAttribute("nam", name);
		req.setAttribute("coun", country);
		req.setAttribute("marr", marrige);
		req.setAttribute("par", party);
		req.setAttribute("age", age);
		req.setAttribute("gen", gender);
		req.setAttribute("per", Priood);
		req.setAttribute("time", representedTime);
		req.setAttribute("msg", "saved sucessfully...");
		
		
		RequestDispatcher type = req.getRequestDispatcher("/Sucess.jsp");
		type.forward(req, resp);
	}
	
}
