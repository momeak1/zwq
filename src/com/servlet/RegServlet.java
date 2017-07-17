package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.Operate;
import com.model.Users;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Operate op = new Operate();
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession(true);
		//接收数据
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String password1=request.getParameter("password1");
		String result=null;
		
		try {
			//验证数据
			if (username==null||username.equals("")||password==null||password.equals("")||password1==null||password1.equals("")) {
				result="信息不能为空";
				request.setAttribute("result", result);
				request.getRequestDispatcher("reg.jsp").forward(request, response);
			} else if(!password.equals(password1)){
				result="两次密码输入不一致";
				request.setAttribute("result", result);
				request.getRequestDispatcher("reg.jsp").forward(request, response);
			}else{
				if (op.checkUser(username)) {
					result="该账号已存在，请更换账号";
					request.setAttribute("result", result);
					request.getRequestDispatcher("reg.jsp").forward(request, response);
				}else{
					Users user=new Users(username, password, 0, 0);
					if(op.addUser(user))
						session.setAttribute("user_id", user.getId());
						response.sendRedirect("userInfo.jsp");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.sendRedirect("reg.jsp");
		}
	}

}
