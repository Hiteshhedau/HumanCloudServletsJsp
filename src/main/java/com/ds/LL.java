package com.ds;



public class LL {
	Node head;
	int size;

	public LL() {
		this.size = 0;
	}

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// add- first,last
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// add-last
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	// print
	public int [] printList() {
		int arrays[]=new int[getSize()];
		int c=0;
		try {
			Node currNode = head;
			while (currNode != null) {
				arrays [c++]=currNode.data;
				System.out.print(currNode.data + " -> ");
				currNode = currNode.next;
			}
			System.out.println("NULL");
		} catch (Exception e) {
			System.out.println("List is Empty");
		}	
		return arrays;
	}

	public void deleteFirst() {
		try {
			head = head.next;
			size--;
		} catch (Exception e) {
			System.out.println("List is empty");
		}

	}

	public void deleteLast() {
		try {
			if(head.next==null) {
				head=null;
				size--;
				return;
			}
			Node secondLast = head;
			Node lastNode = head.next; // head.next=null-> lastNode=null
			while (lastNode.next != null) {
				lastNode = lastNode.next;
				secondLast = secondLast.next;
			}
			secondLast.next = null;
			size--;
		} catch (Exception e) {
			System.out.println("List is Empty");
		}
	}
	
	public int getSize() {
		System.out.println("The size of the LinkedList is "+ size);
		return size;
		
	}

//	public static void main(String[] args) {
//		LL list = new LL();
////		list.addLast("Hitesh");
////		list.printList();
////		list.deleteLast();
////		list.deleteFirst();
////		list.deleteLast();
////		list.printList();
////		System.out.println(list.getSize());
////		list.getSize();
//		
//	}
}
