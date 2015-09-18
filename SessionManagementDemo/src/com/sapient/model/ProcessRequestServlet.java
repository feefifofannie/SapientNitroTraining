package com.sapient.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessRequestServlet
 */
public class ProcessRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pword");
		
		if ((username.equalsIgnoreCase("Danielle") || username.equalsIgnoreCase("Sally")) && password.equals("password")){
			HttpSession session = request.getSession(true);
			session.setMaxInactiveInterval(10);
			Cookie cookie = new Cookie(username, password);
			cookie.setMaxAge(24*7*60*60);
			response.addCookie(cookie);
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

}
