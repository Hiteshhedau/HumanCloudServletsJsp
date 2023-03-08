package com.ds;

public class QueueByArray {
	public static class Queue {
		static int arr[];
		static int rear = -1;
		static int size;

		public Queue(int n) {
			arr = new int[n];
			this.size = n;
		}
		
		public  boolean isEmpty() {
			return rear == -1;
		}

		// enqueue

		public  void add(int data) {
			if (rear == size - 1) {
				System.out.println("Full queue");
				return;
			}
			rear++;
			arr[rear] = data;
		}

		// dequeue:- O(n)
		public  int remove() {
			if (isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			int front = arr[0];
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			} 
			rear--;
			return front;
		}
		// peek 

		public  int peek() {
			
			if (isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			
			return arr[0];
			
		}
//public static void main(String[] args) {
//	Queue q=new Queue(5);
//	q.add(10);
//	q.add(11);
//	System.out.println(q.peek());
//	System.out.println(q.remove());
//	
//}
	}

}
