package servlet;

import java.io.IOException;

import dao.ResponseDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO 1-1: セッションを取得する
		// HttpSession session = ...

		// TODO 1-2: セッションから"user_id"を取得する
		// String userId = (String) ...

		// TODO 1-3: userIdがnullの場合、新しいIDを生成しセッションに保存する
		// if (userId == null) {
		//     userId = "user" + System.currentTimeMillis();
		//     session.setAttribute...
		// }

		ResponseDAO responseDAO = new ResponseDAO();
		try {
			// TODO 1-4: 回答済みかどうかをチェックする
			// if (responseDAO.hasAnswered(userId)) {
			// 回答済みの場合
			//     request.setAttribute("message", "回答を送信しました。");
			// } else {
			// 未回答の場合は、questionDAOから質問を取得
			//     QuestionDAO questionDAO = ...
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.getRequestDispatcher("survey.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO 2-1: セッションを取得する
		// HttpSession session = ...

		// TODO 2-2: セッションから"user_id"を取得する
		// String userId = ...

		// TODO 2-3: userIdがnullの場合、SurveyServletにリダイレクトする
		// if (userId == null) {
		//     ...
		// }

		try {
			ResponseDAO responseDAO = new ResponseDAO();
			// TODO 2-4: フォームから送信された回答を取得する
			// String[] answers = request.getParameterValues("answers");

			// TODO 2-5: 回答をデータベースに保存する
			// for (int i = 0; i < answers.length; i++) {
			//     ...
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO 2-6: セッションに"answered"をtrueで保存する
		// session.setAttribute("answered", true);
		
		response.sendRedirect("SurveyServlet");
	}
}
