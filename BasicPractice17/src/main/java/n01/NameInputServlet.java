package n01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/n01/name-input-servlet"})
public class NameInputServlet extends HttpServlet{
	
	public void doPost(
			HttpServletRequest request, HttpServletResponse response
		)throws ServletException,IOException{
		
		String username=request.getParameter("username");
		
		HttpSession session=request.getSession();
		
		session.setAttribute("username", username);
		
		request.getRequestDispatcher("/n01/output.jsp").forward(request, response);
	}

}
