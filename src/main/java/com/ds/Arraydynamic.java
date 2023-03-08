package com.ds;

import java.util.Arrays;

public class Arraydynamic {
	private static int data[];
	private static int defsize = 10;
	private static int size = 0;

	@Override
	public String toString() {
		return "Arraydynamic [data=" + Arrays.toString(data) + "]";
	}

	public Arraydynamic() {
		super();
		this.data = new int[defsize];
	}

	public  boolean isFull() {
		return size == data.length;
	}

	public  void resize() {
		int[] temp = new int[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public  void add(int num) {
		if (isFull()) {
			resize();
		}
		data[size++] = num;

	}

	public  int remove() {
		int removed = data[--size];
		return removed;
	}

	public  int get(int index) {
		int i = data[index];
		return data[index];
	}

	public int size() {
		return size;
	}

	public  void set(int index, int value) {
		data[index] = value;

	}

	public  int [] display() {
		int arrays []=new int[size];
//		System.out.println(ad.get(0));
//		System.out.println(ad.get(1));
//		System.out.println(ad.get(2));
//		System.out.println(ad.get(3));
		int c=0;
		for (int extract : data) {
			arrays[c++]=extract;
		}
		return arrays;
	}

	public  void main(String[] args) {
		
		add(4);
		add(8);
		add(5);
		add(8);
		System.out.println(remove());
		System.out.println(remove());
		display();
		set(5, 20);
		System.out.println();
		display();
		System.out.println();
		System.out.println(get(5));
	}
}
