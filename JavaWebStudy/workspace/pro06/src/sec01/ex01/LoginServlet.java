package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_id = request.getParameter("user_id"); // input tag의 name 속성을 가져옴
		String user_pw = request.getParameter("user_pw"); // input tag의 name 속성을 가져옴
		System.out.println("아이디 : " + user_id);
		System.out.println("비밀번호 : " + user_pw);
		
//		response.sendRedirect("http://localhost:8080/pro06/login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	

}
