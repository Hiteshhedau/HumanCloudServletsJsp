package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.Arraydynamic;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/DynamicArrayServlets")
public class DynamicArrayServlets extends HttpServlet{
	
Arraydynamic dynamicArray=new Arraydynamic();
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String action = request.getParameter("action");
		
		
		ObjectMapper objectMapper=new ObjectMapper();
		
		HttpSession session = request.getSession();
		PrintWriter out=response.getWriter();
		if (action.equals("add")) {
			System.out.println("you are in add");
			int item = Integer.parseInt(request.getParameter("item"));
			
			dynamicArray.add(item);
			session.setAttribute("item", item);
			

			out.println(item+" has been added to Array");
		} else if (action.equals("remove")) {
			System.out.println("you are in remove");
			
			out.println(dynamicArray.remove());
		} else if (action.equals("get")) {
			int index=Integer.parseInt(request.getParameter("index"));
			System.out.println("you are in get");
			out.println(dynamicArray.get(index));
		} else if (action.equals("set")) {
			int index=Integer.parseInt(request.getParameter("index"));
			int value=Integer.parseInt(request.getParameter("value"));
			System.out.println("you are in set");
			dynamicArray.set(index,value);

			out.println("value has been set");
		} else if(action.equals("display")){
			int arr[]=dynamicArray.display();
			String newArray=objectMapper.writeValueAsString(arr);
			out.println(newArray);
		}
}
}
