package chapter6;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Checkbox
 */
@WebServlet(urlPatterns={"/chapter6/checkbox"})
public class Checkbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkbox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String[] genre=request.getParameterValues("genre");
		
		Page.header(out);
		if(genre!=null) {
			for (String item : genre) {
				out.println("｢"+item+"｣");
			}
			out.println("に関するお買い得情報を送りします。");
		}
		Page.footer(out);
	}

}
