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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 int id = Integer.parseInt(req.getParameter("id"));
	 TodoDAO dao= new TodoDAO(DBConnect.getConnection());
	 boolean f= dao.deleteTodo(id);
	 HttpSession session = req.getSession();
	 if(f) {
		 session.setAttribute("successMsg", "Todo Delete Sucessfully");
	    	resp.sendRedirect("index.jsp");
	 }else {
		 session.setAttribute("failedMsg", "Something Wrong On Server, please Try Again ");
		 resp.sendRedirect("index.jsp");
	 }
	}
	

}
