package com.sample.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/welcome")
public class HelloServlet extends  HttpServlet {

	private static final long serialVersionUID = 629109056535803781L;

	
    public HelloServlet() {
        System.out.println("inside the constructor");
    }
    
    private static Integer storeCode; 
    private static Integer randomCodeGenerator() {
    	Random r = new Random();
    	storeCode = r.nextInt();
    	return storeCode;
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inside get method");
		//Generate the random code for human verification and pass it to the jsp page
		Random r = new Random();
		resp.setContentType("text/html;charset=UTF-8");
		
		try(PrintWriter out = resp.getWriter()){
			req.setAttribute("data", randomCodeGenerator());
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
		}
	}


	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("inside HelloServlet service method ");
		super.service(arg0, arg1);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inside post method service method ");
		Integer getUserEnteredCode = Integer.parseInt(req.getParameter("code"));
		if(getUserEnteredCode.equals(storeCode))
			resp.getWriter().println("Welcome "+req.getParameter("urname"));
		else
			resp.getWriter().println("Your not human");
	}

    
	public static void main(String[] args) {
		System.out.println("======>"+new Random().nextInt());
	}

}
