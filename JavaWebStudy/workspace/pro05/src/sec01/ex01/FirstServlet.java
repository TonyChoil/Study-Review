package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	// servlet-api.jar에서 가져온  class 눌러서 class attach라고 뜨던 것들이 lib에서 상속된 클래스들이었구나.
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet메서드 호출");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init 메서드 호출");
	}

	@Override
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	} 

	

}
