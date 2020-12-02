package november7;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		s.peek();
		System.out.println(s.pop());
		s.peek();
		
		System.out.println(s);
		System.out.println(s.empty());
	}

}
