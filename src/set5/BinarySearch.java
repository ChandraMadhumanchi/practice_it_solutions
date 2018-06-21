package set5;

import java.util.Stack;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,6,7,8,9,10};
		int n,key;
	    n = arr.length-1;
	    key = 10;
	    
	    System.out.println("run at binarySearch Index:" + binarySearch(arr,0,n,key));
	    
	    System.out.println("run at binarySearchTest Index:" + binarySearchTest(key,arr,0,n));
	    
	    System.out.println("run at binaryTest Index:" + binaryTest(arr,0,n,key));
	    
	   // String exp = "a+b*(c^d-e)^(f+g*h)-i";
       // System.out.println(infixToPostfix(exp));
	}
		
	public static int binaryTest(int[] arr,int left,int right, int key){
		
		while (left < right){
			
			int mid = left + right / 2;
			
			if(arr[mid] == key)
				return mid;
			
			if(arr[mid] > key){
				right = mid -1;
			} else {
				left = mid + 1;
			}
		}
		
		return -1;
	} 
	public static int binarySearchTest(int key,int[] arr,int left,int right){
		
		while (left < right){
			
			int mid = left + right / 2;
			
			if( arr[mid] == key)
				return mid;
			
			if(arr[mid] > key)
				right = mid-1; //return binarySearchTest(-key,--arr,---left,--mid-1);
			else
				left = mid +1; //return binarySearchTest(key,arr,mid+1,right);
				
		}
		
		return -1;
	}	
	
	public static int binarySearch(int arr[],int low,int high,int key){
		
		if(low < high){
			
			int mid = low + high / 2;
			
			if (arr[mid] == key)
				return mid;
			
			if ( arr[mid] > key)
				return binarySearch(arr,low,mid-1,key);
			else
				return binarySearch(arr,mid+1,high,key);
			
		}
		return -1;
		
	}

	public static String infixToPostfix(String infix){
		String postFix = new String("");
		
		Stack<Character> st = new Stack<Character>();
		
		for( int i=0; i < infix.length(); i++ ){
			
			char c = infix.charAt(i);
			if(Character.isLetterOrDigit(c))
				postFix = postFix + infix.charAt(i);
			else if (c == '(')
				st.push(c);
			else if (c == ')')
			{
				while(!st.isEmpty() && st.peek() != '(')
					postFix = postFix + st.pop();
					
			}
			else
			{
				while(!st.isEmpty() && prec (c) < prec(st.peek()))
					postFix = postFix + st.pop();
				
				st.push(c);
			}
		}
		
		return postFix;
	}
	
	public static int prec(char c){
		
		switch (c){
		
		case '+' :
		case '-' :
			return 1;
		
		case '*' :
		case '/' :
			return 2;
		case '^':
            return 3;
		}
		return -1;
	}
	
}
