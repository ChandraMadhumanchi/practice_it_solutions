package set1;

public class Stack {

	private int size;
	private int[] stackArray;
	private int top;
	
	public static void main (String[] args){
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(6);
		s.push(5);
		s.pop();
		s.push(4);
		
		s.display();
	}
	
	public Stack(int size){
		
		this.size = size;
		this.stackArray = new int[size];
		top=-1;
	}
	
	public boolean isFull(){
		return (top == size-1);
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	// add items to stack
	
	public void push(int item){
		
		if(! isFull()){
			top++;
			this.stackArray[top] = item;
		}else{
			System.out.println("Stack is full");
		}	
	}
	
	public int pop(){
		if(! isEmpty()){
			return this.stackArray[top--];
		}else{
			System.out.println("Stack is full");
			return -1;
		}		
	}
	
	public void display(){
		
		for(int i=0; i < size; i++){
			System.out.println(stackArray[i]);
		}
	}
}
