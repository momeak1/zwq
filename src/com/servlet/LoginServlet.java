package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.Operate;

/**
 * Servlet implementation class LoginProcess
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Operate op=new Operate();
		request.setCharacterEncoding("utf-8");
		String result;
		String a = request.getParameter("a");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session=request.getSession(true);
		try {
			//��֤����
			if (username==null||username.equals("")||password==null||password.equals("")||a==null||a.equals("")) {
				result = "�û��������벻��Ϊ��";
				request.setAttribute("result", result);
				RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
				dispatcher.forward(request, response);
			}else if (a.equals("user")){
				if(!op.checkUser(username, password)) {
					//��������
					result = "�û����������";
					request.setAttribute("result", result);
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}else {
					//�û�������session
					session.setAttribute("username", username);
					response.sendRedirect("main.jsp");
				}
			}else if(a.equals("admin")){
				if (!op.checkAdmin(username, password)) {
					result = "��½Ȩ�޲���";
					request.setAttribute("result", result);
					RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
					dispatcher.forward(request, response);
				} else if (op.checkAdmin(username, username)) {
					//�û�������session
					session.setAttribute("username", username);
					response.sendRedirect("index.jsp");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.sendRedirect("login.jsp");
		}
		
	}

}
