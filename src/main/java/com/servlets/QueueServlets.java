package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.QueueByArray.Queue;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/QueueServlets")
public class QueueServlets  extends HttpServlet{
	Queue queue=new Queue(5);
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String action = request.getParameter("action");
		
		
		ObjectMapper objectMapper=new ObjectMapper();
		
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		if (action.equals("add")) {
			System.out.println("you are in add");
			int item = Integer.parseInt(request.getParameter("item"));
			
			queue.add(item);
			session.setAttribute("item", item);
			
//			response.sendRedirect("stack.jsp");
			out.println(item+" has been added to queue");
			
			
		} else if (action.equals("remove")) {
			System.out.println("you are in remove");
			
			out.println(queue.remove());
		} 
		
		
		else if (action.equals("peek")) {
			System.out.println("you are in peek");
			out.println(queue.peek());

			
		}
			
			//		} else if (action.equals("show")) {
//			System.out.println("you are in show");
//			int [] arrayy=stack.show();
//			String arrayList=objectMapper.writeValueAsString(arrayy);
//			out.println(arrayList);
//		} else {
//			
//		}
			
}
}
