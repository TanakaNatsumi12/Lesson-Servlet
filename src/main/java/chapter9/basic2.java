package chapter9;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/basic2")
public class basic2 extends HttpServlet{
	
	public void doPost (
			HttpServletRequest request, HttpServletResponse response
		)throws ServletException, IOException{
			response.sendRedirect("done.jsp");
			
			
	}
	
}
