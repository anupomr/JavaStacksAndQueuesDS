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
}
