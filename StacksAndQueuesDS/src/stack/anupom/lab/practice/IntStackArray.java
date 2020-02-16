package stack.anupom.lab.practice;

public class IntStackArray {//Stack Implementation on array	
	private int[] stack;
	private int size;
	private static final int INITIAL_SIZE=10;	

	public IntStackArray() {
		stack = new int[INITIAL_SIZE];
		size = 0;
	}

}
