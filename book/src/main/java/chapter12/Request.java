package chapter12;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns= {"/chapter12/request"})
public class Request extends HttpServlet{
	public void doGet(
			HttpServletRequest request, HttpServletResponse response
		)throws ServletException, IOException{
			PrintWriter out=response.getWriter();
			Page.header(out);
			
			out.println("<p>Request URL<br>"+
					request.getRequestURL()+"<p>");
			out.println("<p>Host<br>"+
					request.getHeader("Host")+"<p>");
			out.println("<p>user-Agent<br>"+
					request.getHeader("user-Agent")+"<p>");
			out.println("<p>Remote Address<br>"+
					request.getRemoteAddr()+"<p>");
			
			Page.footer(out);
	}

}
