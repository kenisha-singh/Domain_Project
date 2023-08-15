package com.lumen.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lumen.dao.TodoDAO;
import com.lumen.db.DBConnect;

@WebServlet("/add_todo")
public class AddServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		String username = req.getParameter("username");
		String todo = req.getParameter("todo");
		String status = req.getParameter("status");
		//System.out.println(username+" "+todo+" "+status);
		TodoDAO dao = new TodoDAO(DBConnect.getConnection());
	    boolean f 	=dao.addTodo(username, todo, status);
	    HttpSession session = req.getSession();
	    if(f) {
	    	session.setAttribute("successMsg", "Todo Added Sucessfully");
	    	resp.sendRedirect("index.jsp");
	    }else {
	    	session.setAttribute("failedMsg", "Sorry Something is Wrong, Try Again");
	    	resp.sendRedirect("index.jsp");
	    }
		
	}
	

}





