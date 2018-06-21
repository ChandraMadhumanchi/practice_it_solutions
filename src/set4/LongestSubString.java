package set4;

import java.util.*;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String subString = returnLongestSubString("chandramadhumanchi");
		
		System.out.println("" + subString);
	}

	public static String returnLongestSubString(String s){
		
		int length = 0;
		String longStr = "";
		
		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
		
		for(int i=0; i < s.length(); i++){
			
			
			if(!lhm.containsKey(s.charAt(i))){
				
				lhm.put(s.charAt(i), i);
				
			}else{
				
				i = lhm.get(s.charAt(i));
				lhm.clear();
			}
			
			if(lhm.size() > length){
				length = lhm.size();
				longStr = lhm.keySet().toString();
				
			}
			
		}
		
		return longStr;
	}
}
