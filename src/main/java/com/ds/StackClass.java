package com.ds;
public class StackClass {
	// by LinkedList
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static class Stack {
		public static Node head;
		int [] array;
		int size=0;
		public  boolean isEmpty() {
			
			return head == null;
		}

		public  void push(int data) {
			size++;
			Node newNode = new Node(data);
			if (isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
         
		public  int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			size--;
			return top;
		}

		public  int peek() {
			if (isEmpty()) {
				return -1;
			}
			return head.data;
		}
		public  int[] show() {
			int []array1=new int[size];
			Node currNode=head;
			int c=0;
			while(currNode!=null) {
				array1[c++]=currNode.data;
				System.out.print(currNode.data+" ");
				currNode=currNode.next;
			}
			return array1;
		}
//		public void show() {
//			Node currNode=head;
//			while(currNode!=null) {
//				currNode=currNode.next;
//			} 
//			
//		}
//		
	}
}
