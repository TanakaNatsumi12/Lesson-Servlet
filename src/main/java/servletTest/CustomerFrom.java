package servletTest;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomerFrom {
	
	public void doPost (
			HttpServletRequest request, HttpServletResponse response
		)throws ServletException, IOException{
		
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		String mail=request.getParameter("mail");
		String content=request.getParameter("content");
		
		if(username == null || username.isEmpty() || mail == null || mail.isEmpty() ||content == null ||content.isEmpty()) {
		
		System.out.println("ユーザー名・メールアドレス・お問い合わせ内容は必須項目です。");
		}
		
		
		
//		if(texthope) {
//			request.getRequestDispatcher("textHope.jsp")
//				.forward(request, response);
//		}
		
		request.getRequestDispatcher("contactOut.jsp")
			.forward(request, response);
		
		
	}

}
