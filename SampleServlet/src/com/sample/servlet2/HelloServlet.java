package com.sample.servlet2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/get-data")
public class HelloServlet extends  HttpServlet {

	private static final long serialVersionUID = 629109056535803781L;

	
    public HelloServlet() {
        System.out.println("inside the constructor");
    }


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inside get method"+req.getParameter("name"));
		resp.getWriter().println("Welcom");
	}


	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("inside HelloServlet service method ");
		super.service(arg0, arg1);
	}

    
	

}
