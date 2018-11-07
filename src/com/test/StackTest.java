package com.test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			Integer a = iterator.next();
			if (a == 3) {
				stack.pop();
			}
			System.out.println(a);
		}
		
		ArrayList<Integer> list;
		
//		Deque<Integer> deque =  new LinkedList<>();
//		deque.push(5);
//		deque.push(6);
//		deque.push(7);
//		Iterator<Integer> iterator2  = deque.iterator();
//		while (iterator2.hasNext()) {
//			Integer a = iterator2.next();
//			System.out.println(a);
//		}
		
	}
}
