package set1;

public class Queue {

	private int maxSize;
	private int[] queueArray;
	private int rear,front,totalItems;
	
	public Queue(int size){
		this.maxSize = size;
		this.queueArray = new int[this.maxSize];
		rear = -1; front = -1; totalItems = 0;
	}
	
	public boolean isFull(){
		return( totalItems == this.queueArray.length);
	}
	
	public boolean isEmpty(){
		return ( totalItems == 0);
	}
	
	public void add(int item){
		
		if (isFull()) {
			System.out.println("Circular Queue is full. Element cannot be added");
        }
        else {
            rear = (rear + 1) % queueArray.length;
            queueArray[rear] = item;
            totalItems++;
            
            if (front == -1) {
				front = rear;
			}
        }
	}
	
	
	public int remove(){
		
		if (isEmpty()) {
            System.out.println("Circular Queue is empty. Element cannot be retrieved");
            return -1;
        }
        else {
        	int old_item = this.queueArray[front];
        	queueArray[front] = 0;
            front = (front + 1) % queueArray.length;
            totalItems--;
            return old_item;
        }
	}
	
	public void show(){
		
		for(int i =0 ; i <maxSize; i++ ){
			System.out.println(queueArray[i]);
		}
	}
}
