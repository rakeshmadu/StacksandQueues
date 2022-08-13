package com.stacksAndQueues;

import java.util.LinkedList;

public class Stacks {

	LinkedList<Integer> stack = new LinkedList<>();
	
	public void push(int value) {
		stack.add(0, value);
	}
	
	public void pop() {
		if(stack.size() > 0)
			stack.remove(0);
		else {
			System.out.println(" Stack is empty!");
			return;
		}
		
		peek();
	}
	
	public void peek() {
		if(stack.size() < 1) {
			return;
		}
		System.out.println(stack.get(0));
	}
	
	public void display() {
		for (Integer integer : stack) {
			System.out.print(" " + integer);
		}
		System.out.println();
	}
}
