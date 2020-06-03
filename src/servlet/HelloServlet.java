package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 * 서블릿은 새로 만들면 무조건 서버 재시작
 * 서블릿을 수정하는 상태라면 서버가 리로딩 되었는지 확인한 후 실행
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, // request 가져올때
				   HttpServletResponse res) //response 보낼떄
			throws ServletException, IOException {
		
			//사용자에게 보여주는 페이지 설정
			res.setContentType("text/html; charset=UTF-8"); 
			//insert.jsp에 있는 contentType
		
			PrintWriter out = res.getWriter();
			out.print("Hello");
			out.print("<br>");
			out.print("안녕하세요");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
