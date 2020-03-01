package stack.anupom.assignment4.q2;

//problem2 ->Solution
public class SingleLinkedStack {
	
	// Nested class 
	private static class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}

	private Node top;

	public boolean isEmpty() {
		return top == null;
	}

	// To read data from stack
	public int peek() {
		return top.data;
	}
	// Add data from stack 
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
	// To Delete data from Stake
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
	
	// To display the linked list
	public void display() {
		Node current = top;
		System.out.println();
		while (current != null)
		{
			System.out.println(" | "+current.data + " | ");
			System.out.println(" | ---- | ");
			current = current.next;
		}
		System.out.println(" |______|");	
		
	}
	public static  void transfer (SingleLinkedStack S, SingleLinkedStack T) {
		SingleLinkedStack tempStack =new SingleLinkedStack();
		while(!T.isEmpty()) {
			tempStack.push(T.pop());
		}
		while(!S.isEmpty()) {
			T.push(S.pop());
		}
		while(!tempStack.isEmpty()) {
			S.push(tempStack.pop());
		}
	}
	
	public static void main(String[] args) {
		SingleLinkedStack S = new SingleLinkedStack();
		S.push(1002);
		S.push(1003);
		S.push(1004);
		S.push(1005);
	
		//S.pop();
	
		System.out.println(" \nStack : S" );
		S.display();
		
		SingleLinkedStack T = new SingleLinkedStack();
		T.push(5002);
		T.push(5003);
		T.push(5004);
		T.push(5005);
		System.out.println(" \nStack : T" );
		T.display();
		
		
		System.out.println("\n\n After transfer S to T Sack T:");
		transfer(S,T);
		T.display();
	}
}
