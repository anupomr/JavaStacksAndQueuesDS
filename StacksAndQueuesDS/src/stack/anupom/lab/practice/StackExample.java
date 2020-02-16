package stack.anupom.lab.practice;

import java.util.Stack;

public class StackExample {//Using system Library 
	

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		System.out.println("Empty Stack : "+ stack);
		System.out.println("Empty Stack : "+ stack.isEmpty());
		
		stack.push(1001);
		stack.push(1002);
		stack.push(1003);
		stack.push(1004);

		
		System.out.println("Non-Empty Stack : "+ stack);
		System.out.println("Non-Empty Stack Pop operation : "+ stack.pop());
		System.out.println("Non-Empty Stack : After Pop operation "+ stack);
		System.out.println("Non-Empty Stack : search operation "+ stack.search(1));
		System.out.println("Non-Empty Stack : "+ stack.isEmpty());
		
		
		// String Stack
		Stack<String> stackOfCard=new Stack<>();
		
		
		stackOfCard.push("Jack");
		stackOfCard.push("Queen");
		stackOfCard.push("King");
		stackOfCard.push("Ace");
		
		System.out.println(" Stack => "+ stackOfCard);
		System.out.println();
		
		String cardAtTop=stackOfCard.pop();
		
		System.out.println("Stack.pop() : "+ cardAtTop);	
		System.out.println("Current Stack :  "+ stackOfCard);
		System.out.println();
		
		cardAtTop =stackOfCard.peek();
		System.out.println("Stack.peek() "+ cardAtTop);
		System.out.println("Current Stack :  "+ stackOfCard);
		
	}

}
