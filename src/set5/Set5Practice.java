package set5;

import java.util.*;

public class Set5Practice {

	public static void main(String[] args) {
		// Union of 2 lists

		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(2);
		list1.add(3);
		list1.add(7);
		list1.add(9);
		list1.add(9);
		list1.add(9);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list1.add(2);
		list1.add(2);
		
		HashSet<Integer> result = new HashSet<Integer>();
		for(Integer num:list1){
			result.add(num);
		}
		
		for(Integer num:list2){
			result.add(num);
		}

		for(Integer num : result ){
			System.out.print(num + " ");
		}
		System.out.println("");
		System.out.println("===================================");
		
		HashSet<Integer> hs = new HashSet<>();
        
		for(Integer num:list1){
			hs.add(num);
		}
        
		for(Integer num:list2){
			if(hs.contains(num))
				System.out.print(num + " ");
		}
        
		System.out.println("===================================");
		System.out.println("");
        
		List<Integer> list3 = unionof2Lists(list1, list1.size(), list2, list2.size());

		for (int i : list3) {
			System.out.print(" " + i);
		}
	}

	public static List<Integer> unionof2Lists(List<Integer> l1,int m,List<Integer> l2,int n){
		
		List<Integer> union = new ArrayList<Integer>();
		
		if(m > n){
			List temp = l1;
			l1 = l2;
			l2 = temp;
			
			int t = m;
			m = n;
			n = m;
			
		}
		Collections.sort(l1);
		
		for(Integer num: l1){ 
			System.out.print(num + " ");
		}
		
		
		int left =0; int right = l1.size();
		for(int i=0; i < n; i++){
			if(BinarySearch(l1,0,right,l2.get(i)) == -1){  //if(BinarySearch(l1,0,right,l2.get(i)) == -1){ union
				union.add(l2.get(i));
			}
		}	
		return union;
	}

	public static int BinarySearch(List<Integer> list,int left,int right,int num){
		
		if(left < right){
			
			int mid = (left + right)/2;
			
			if(list.get(mid) == num)
				return list.get(mid);
			else if (list.get(mid) > num)
				return BinarySearch(list,left, mid-1, num);
			else
				return BinarySearch(list, mid+1,right, num);
		}
		
		return -1;
	}

	public static void Stackmain(String[] args){
		
		Stack s = new Stack(5);
		s.push(2);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(1);
		s.pop();
		s.push(3);
		
		s.display();
	}
  
    public static void Queuemain(String[] args){
	  
	   
	   Queue q = new Queue(3);
	   
	   q.add(3);
	   q.add(5);
	   q.add(4);
	   q.remove();
	   q.display();
	   
	   
	   
	   
	   
   }


}

class Queue {
	int size;
	int arr[];
	int front,rear,totalItems;
	
	Queue(){
		
	}
	Queue(int size){
		this.size = size;
		this.arr = new int[size];
		totalItems = 0; front=rear=-1;
	}
	
	public boolean isFull(){
		return(totalItems==this.size-1);
	}
	
	public boolean isEmpty(){
		return(totalItems == 0);
	}
	
	public void add(int element){
		if(!isFull()){
			rear = size % this.arr.length;
			
			this.arr[rear] = element;
			totalItems++;
		}else{
			System.out.println("Queue is full");
		}
	}
	
	public int remove(){
		if(!isEmpty()){
			front = size % this.arr.length;
			
			int retelement = this.arr[front];
			totalItems--;
			return retelement;
		}else{
			System.out.println("Queue is empty");
			return -1;
		}
	}
	
	public void display(){
		for(int i=0; i < totalItems; i++){
			System.out.print(" "+ this.arr[i]);
		}
	}
}

class Stack{
	
	int[] arr;
	int size;
	int top;
	
	Stack(int size){
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	public boolean isFull(){
		return (top == size -1);
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public void push(int element){
		if(!isFull()){
			top++;
			this.arr[top] = element;
		} else {
			System.out.println("Stack is full");
		}
	}
	
	public int pop(){
		
		if(!isEmpty()){
			int pop_element = this.arr[top--];
			return pop_element;
		}else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void display(){
		for(int i = 0; i < size; i++){
			System.out.print(" " + this.arr[i]);
		}
	}
}