package set5;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWords {

	public static void main(String[] args) {
		
		String givenStr = "Never Odd Or Even";
		
		char[] s = givenStr.toCharArray();
		
		int i=0;
	    for(int j=0; j<s.length; j++){
	        if(s[j]==' '){
	        	reverse(s, i, j-1);        
	            i=j+1;
	        }
	    }
	    
	    reverse(s, i, s.length-1);
	  
	    reverse(s, 0, s.length-1);
		
	    System.out.println("===>"+ new String(s));
	    
	    /*
	    String mystr = "Never".toLowerCase();
	    
	    Stack st = new Stack<>();
	    
	    for(i=0; i < mystr.length(); i++){
	    	st.push(mystr.charAt(i));
	    }
	    String s1 ="";
	   
	    while(!st.empty()){
	    	s1 = s1 + st.pop();
	    }
	    System.out.println("");
	    System.out.println(""+s1);
	    if(mystr.equals(s1))
	    		System.out.println("palindrim! ");
	    */	
	}
	
	public static void reverse(char[] s, int i, int j){
	    while(i<j){
	        char temp = s[i];
	        s[i]=s[j];
	        s[j]=temp;
	        i++;
	        j--;
	    }
	}

}
