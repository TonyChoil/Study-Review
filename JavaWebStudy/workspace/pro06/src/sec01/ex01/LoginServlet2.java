package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("destroy 메소드 호출..");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init 메소드 호출..");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		String data = "<html>";
			data += "<body>";
			data += "아이디 : " + id;
			data += "<br>";
			data += "패드워드 : " + pw;
			data += "</body>";
			data += "</html>";
			out.print(data); // PrintWriter의 print()를 이용해 HTML태그 문자열을 웹 브라우저로 출력합니다.
	}

}
