package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import com.ds.StackClass.Stack;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/StackServlets")
public class StackServlets extends HttpServlet {

	Stack stack = new Stack();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String action = request.getParameter("action");
		
		
		ObjectMapper objectMapper=new ObjectMapper();
		
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		if (action.equals("push")) {
			System.out.println("you are in push");
			int item = Integer.parseInt(request.getParameter("item"));
			
			stack.push(item);
			session.setAttribute("item", item);
			
//			response.sendRedirect("stack.jsp");
			out.println(item+" has been added to stack");
		} else if (action.equals("pop")) {
			System.out.println("you are in pop");
			
			out.println(stack.pop());
		} else if (action.equals("peek")) {
			System.out.println("you are in peek");
			out.println(stack.peek());
		} else if (action.equals("show")) {
			System.out.println("you are in show");
			int [] arrayy=stack.show();
			String arrayList=objectMapper.writeValueAsString(arrayy);
			out.println(arrayList);
		} else {
			
		}
	}
}
