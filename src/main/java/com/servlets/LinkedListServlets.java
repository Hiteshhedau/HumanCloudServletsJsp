package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.LL;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/LinkedListServlets")
public class LinkedListServlets extends HttpServlet {

	LL linkedList = new LL();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String action = request.getParameter("action");

		ObjectMapper objectMapper = new ObjectMapper();

		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		if (action.equals("addFirst")) {
			System.out.println("you are in addFirst");
			int item = Integer.parseInt(request.getParameter("item"));

			linkedList.addFirst(item);
			session.setAttribute("item", item);

			out.println(item + " has been added to LinkedList");
		} else if (action.equals("addLast")) {
			System.out.println("you are in addLast");
			int item = Integer.parseInt(request.getParameter("item"));
			out.println("element has been added to linkedList");
		} else if (action.equals("deleteFirst")) {

			System.out.println("you are in deleteFirst");

			linkedList.deleteFirst();
			out.println("first element deleted");
		} else if (action.equals("printList")) {
			System.out.println("you are in printList");
	String pList=objectMapper.writeValueAsString(linkedList.printList())	;	
			out.println(pList);
			
		} else if (action.equals("getSize")) {
			out.println(linkedList.getSize());
		}
	}
}
