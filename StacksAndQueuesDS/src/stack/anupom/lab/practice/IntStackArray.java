package stack.anupom.lab.practice;

public class IntStackArray {//Stack Implementation on array	
	private int[] stack;
	private int size;
	private static final int INITIAL_SIZE=10;	

	public IntStackArray() {
		stack = new int[INITIAL_SIZE];
		size = 0;
	}
	public int size() {
		return size;
	}
	
	public int capacity() {
		return stack.length;
	}
	public int capacityRemaining() {
		return stack.length-size;
	}
	
	public void empty() {
		for (int i = 0; i < stack.length; i++) {
			stack[i]=0;
		}
	}
	
	private void compress() {
		if(size<stack.length) {
		int newCapacity=size;
		int[] newStack= new int[newCapacity];
		for (int i = 0; i < stack.length; i++) {
			newStack[i]=stack[i];
		}
		stack=newStack;
		}
	}
	private void doubleCapasity() {
		int newCapacity=2*stack.length;
		int[] newStack= new int[newCapacity];
		for (int i = 0; i < stack.length; i++) {
			newStack[i]=stack[i];
		}
		stack=newStack;
	}
	
	
	
	public void push(int value) {
		if(size==stack.length)
			doubleCapasity();
		stack[size]=value;
		size++;
	}
	public int pop() {
		if(size==0)
			throw new ArrayIndexOutOfBoundsException();
		int result=stack[size-1];
		stack[size-1]=0;
		size--;
		return result;
	}
	
	
	public int peek() {
		if(size==0)
			throw new ArrayIndexOutOfBoundsException();
		int result=stack[size-1];		
		return result;
	}
	public static void main(String[] args) {
		IntStackArray myStack=new IntStackArray();
		myStack.push(5);
		myStack.push(15);
		myStack.push(25);
		System.out.println("Pop Stack: " + myStack.pop());

	}
}
