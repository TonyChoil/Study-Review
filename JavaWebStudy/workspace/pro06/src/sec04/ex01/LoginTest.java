package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("���̵� : " + id);
		System.out.println("��й�ȣ : " + pw);
		
		if(id != null && (id.length() != 0)) {
			out.print("<html>");
			out.print("<body>");
			
			if(id.equals("admin")) {
				out.print("<h2>�����ڷ� �α��� �ϼ̽��ϴ�!!</h2>");
				String data = "<input type='button' value='ȸ�� ����'/>";
				data += "&nbsp;";
				data += "<input type='button' value='ȸ�� ����'/>";
				out.print(data);
			}else {
				out.print(id + "��!! �α��� �ϼ̽��ϴ�.");
			} 
			out.print("</body>");
			out.print("</html>");
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("���̵� �Է��ϼ���!!");
			out.print("<br>");
			out.print("<a href='http://localhost:8080/pro06/test01/login.html'>�α��� â���� �̵� </a>");
			
			out.print("</body>");
			out.print("</html>");
		}
	}

}