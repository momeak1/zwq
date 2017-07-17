package com.servlet;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.Operate;
import com.model.Books;

/**
 * Servlet implementation class Addbook
 */
@WebServlet("/Addbook")
public class Addbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addbook() {
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
		// TODO Auto-generated method stub
		Operate op = new Operate();
		request.setCharacterEncoding("utf-8");
		String result=null;
		String name = request.getParameter("name");
		String count = request.getParameter("count");
		String type = request.getParameter("type");
		String author = request.getParameter("author");
		try {
			//验证数据
			if (name==null||name.equals("")||count==null||count.equals("")) {
				result="名称和数量不能为空";
				request.setAttribute("result", result);
				request.getRequestDispatcher("addbook.jsp").forward(request, response);
				
			}else{
				Pattern pattern = Pattern.compile("^[1-9]\\d*$"); 
				Matcher isNum = pattern.matcher(count);
				if ( !isNum.matches() ) {
					result="剩余数量必须为正整数";
					request.setAttribute("result", result);
					request.getRequestDispatcher("addbook.jsp").forward(request, response);
				}else {
					int count1=Integer.parseInt(count);
					Books book=new Books(name, count1, type, author,0,0);
					if (op.addBooks(book)) {
						response.sendRedirect("index_book.jsp");
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.sendRedirect("addbook.jsp");
		}

	}

}
