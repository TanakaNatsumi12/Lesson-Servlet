package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class total
 */
@WebServlet(urlPatterns= {"/chapter5/total"})
public class total extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public total() {
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
		
		try {
			request.setCharacterEncoding("UTF-8");
			int price=Integer.parseInt(request.getParameter("price"));
			int count=Integer.parseInt(request.getParameter("count"));
			
			Page.header(out);
			out.println(price+"円×");
			out.println(count+"個＝");
			out.println(price*count+"円");
			Page.footer(out);
		} catch (NumberFormatException e) {
			out.println("数値を入力してください。");
		}
	}

}
