package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guguTest2")
public class GuguTest2 extends HttpServlet {

	
	
	@Override
	public void init() throws ServletException {
		System.out.println("guguTest2");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int dan = Integer.parseInt(request.getParameter("dan"));
		out.print(" <table border=1 width=1200 align=center>");
		out.print("<tr align=center bgcolor='#FFFF66'>");
		out.print("<td colspan=4>" + dan + " ´Ü Ãâ·Â </td>");
		out.print("</tr>");
		
		for(int i = 1; i < 10; i++)
		{
			if(i % 2 == 0) {
				out.print("<tr algin=center bgcolor='#ACFA58'> ");
			}else {
				out.print("<tr algin=center bgcolor='#81BEF7'> ");
			}
			out.print("<td colspan=1 align=center>");
			out.print("<input type='radio' name=guguRadio />"+ i);
			out.print("</td>");
			out.print("<td colspan=1 align=center>");
			out.print("<input type='checkbox' />"+ i);
			out.print("</td>");
			out.print("<td colspan=1>");
			out.print(dan + " * " + i);
			out.print("</td>");
			out.print("<td colspan=1>");
			out.print(dan * i);
			out.print("</td>");
			
			out.print("</tr>");
		}
		out.print("</table>"); 
	}

}
