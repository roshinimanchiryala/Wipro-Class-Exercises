package com.gl.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentReadServlet")
public class StudentReadServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String name =req.getParameter("name");
		int age =Integer.parseInt(req.getParameter("age"));
		String mobile =req.getParameter("mobile");
		String email =req.getParameter("email");
		
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("mobile : "+mobile);
		System.out.println("email : "+email);
		
		req.setAttribute("mobile", mobile);
		req.setAttribute("name", name);
		req.setAttribute("age", age);
		req.setAttribute("email", email);
		
		RequestDispatcher rd =req.getRequestDispatcher("printStudent.jsp");
		
		
		try {
			rd.forward(req, res); 
		}
		catch(ServletException e) {
			e.printStackTrace();
		}
		catch(IOException ex) {
			ex.getMessage();
		}
	}

}
