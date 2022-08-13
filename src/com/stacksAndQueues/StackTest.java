package com.stacksAndQueues;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stacks stack = new Stacks();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.display();
		
//		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
		
	}

}
