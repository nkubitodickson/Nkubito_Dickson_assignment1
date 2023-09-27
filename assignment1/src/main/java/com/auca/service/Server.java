package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Server extends HttpServlet {
	String Email, password;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String Email = req.getParameter("email");
        String password = req.getParameter("password");

        
        if ("Mutezintare".equals(Email) && "webtec".equals(password)) {
           
            try {
                PrintWriter out = res.getWriter();
                out.println("Hello, this is username " + Email + " and Password " + password);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
           
            res.sendRedirect("ForgetPassword.html"); 
        }
    }

}
