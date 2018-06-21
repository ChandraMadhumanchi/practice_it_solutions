package set5;

import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args) {
		  String[] tokens = new String[] { "2", "1", "+", "3", "*" };
		  
		//System.out.println(evalRPN(tokens));
		//String infix = "15 + 2 -3 ";
		//System.out.println(infixToPostfix(infix));
		//String[] tokens = new String[] { "15", "2", "+", "3", "-" };
		//System.out.println(evalRPN(tokens));
		
		//test(tokens);
		//int[] arr = {-2,-3,6,2};
		//System.out.println("Sum : " + sum(arr));
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;
        printKMax(arr, k);
        
		/*
		Valid input:
			"15 + 2 - 3" -> 14
			"145" -> 145
			"1 + 233 / 233" -> 2
			"2 * 3 + 12 / 6" -> 8

			Invalid input:
			"1 1"
			"+ 1"
			"1 + 2 +"
			"+ 1 1"
			"1+2"
		*/
		
		//String exp = "15+2-3";
		
		//String result = getPostNotation(exp);
		
		//System.out.println("result: " + result);
	}

	public static String getPostNotation(String exp){
		String result = new String("");
		Stack<Character> st = new Stack<Character>();
		for(int i = 0; i < exp.length(); i++){
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c)){
				result += c+" ";
			}else{
				while( !st.isEmpty() && Prec(c) <= Prec(st.peek()))
					result += st.pop()+" ";
				st.push(c);
			}
		}
		
		while(!st.isEmpty())
			result += st.pop()+" ";;
		return result;
	}
	
	public void test (){
		System.out.println("test");
	}
	
	public static String infixToPostfix(String exp){
		
		String result = new String("");
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i< exp.length(); i++){
			
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result += c;
			}else{
				while(!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
						result += stack.pop();
				
				stack.push(c);
			}
				
		}
		
		// pop all the operators from the stack
		while(!stack.isEmpty())
			result += stack.pop();
		
		return result;
	}
	
	public static int Prec(char ch){
		
		switch (ch){
			
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		}
		
		return -1;
	}

	public static int evalRPN(String[] tokens) {
		int sum = 0;

		String operands = "+-*/";

		Stack<String> stack = new Stack<String>();

		for (String t : tokens) {
			if (!operands.contains(t)) {
				stack.push(t);
			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operands.indexOf(t);
				switch (index) {
				case 0:
					stack.push(String.valueOf(a + b));
					break;
				case 1:
					stack.push(String.valueOf(b - a));
					break;
				case 2:
					stack.push(String.valueOf(a * b));
					break;
				case 3:
					stack.push(String.valueOf(b / a));
					break;
				}
			}
		}
		sum = Integer.valueOf(stack.pop());
		return sum;
	}

	public static void testOne(String[] exps){
		String opera = "+-*/";
		Stack<String> st = new Stack<String>();
		for(String str : exps){
			if(! opera.contains(str)){
				st.push(str);
			} else {
				int a = Integer.valueOf(st.pop());
				int b = Integer.valueOf(st.pop());
				int index = opera.indexOf(str);
				switch(index){
				case 0 : 
					st.push(String.valueOf(a+b));
					break;
				case 1 :
					
				}
			}
		}
	}
	public static void test(String[] inputs){
		
		String strOperator = "+-*/";
		Stack<String> st = new Stack<String>();
		for(String token : inputs){
			if(!strOperator.contains(token)){
				st.push(token);
			} else {
				
				int a = Integer.valueOf(st.pop());
				int b = Integer.valueOf(st.pop());
				int index = strOperator.indexOf(token);
				
				
				switch (index ){
				case 0 :
					st.push(String.valueOf(a+b));
					break;
				case 1 :
					st.push(String.valueOf(b-a));
					break;
				case 2 :
					st.push(String.valueOf(a*b));
					break;
				case 3 :
					st.push(String.valueOf(b/a));
					break;	
				}
			}
		}
		System.out.println(st.pop());
	}

	public static int sum (int[] arr){
		int sum = 0 , tempSum =0;
		for(int i=0; i < arr.length; i++ ){
			
			tempSum = tempSum + arr[i];
			
			if (sum < tempSum)
				sum = tempSum;
			
			if(tempSum < 0)
				tempSum = 0;
		}
		return sum;
	} 

    public static void  printKMax(int[] arr,int k){
    	
    	int n = arr.length;
    	
    	for(int i = 0; i < n -k; i++){
    		
    		int max = arr[i];
    		
    		for( int j = 1; j < k ; j++){
    			
    			if(arr[i + j] > max )
    				max = arr[ i + j];
    		}
    		System.out.print(" " +max );
    	}
    	
    }
}
