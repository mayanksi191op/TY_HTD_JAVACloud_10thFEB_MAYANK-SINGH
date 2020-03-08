package com.tyss.cg.collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> linkedList= new LinkedList<String>();
		
		System.out.println(linkedList.size());
		System.out.println("++++++++++++++++++++++++");
		
		linkedList.add("1st");
		linkedList.add("2st");
		linkedList.add("3st");
		linkedList.add("4st");
		
		System.out.println("size of linkedlist after add(): " + linkedList.size());
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		System.out.println(linkedList);
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		linkedList.addFirst("0th");
		linkedList.addLast("5th");
		
		System.out.println("size of Linkedlist after addLast() and addFirst(): " + linkedList.size());
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		System.out.println("linkedlist after addlast() and addFirst()");
		System.out.println(linkedList);
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		System.out.println("linkedlist.peak(): " + linkedList.peek());
		System.out.println("linkedlist.peakfirst(): " + linkedList.peekFirst());
		System.out.println("linkedlist.peeklast(): " + linkedList.peekLast());
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		System.out.println("linkedlist.poll(): " + linkedList.poll());
		System.out.println("linkedlist.pollfirst(): " + linkedList.pollFirst());
		System.out.println("linkedlist.polllast(): " + linkedList.pollLast());
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		System.out.println("linked after poll() methods: " + linkedList);
		
	}

}
