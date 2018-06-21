package set4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

import set1.Set1Examples.Entry;


public class MaximumOccuringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		FileReader f = new FileReader("/Users/nisum/Desktop/GAP/findmostoccuranceofWord.txt");
		BufferedReader br = new BufferedReader(f);
		
		String line = null;
		
		while((line = br.readLine()) != null){  // n times
			
			String[] words = line.toLowerCase().split(" ");  // constancts times
			
			for(String word: words){ // n times
				
				if(!hm.containsKey(word)){
					hm.put(word, 1);
				}else{
					hm.put(word, hm.get(word) + 1);
				}
			}
		}
		
		int count = 0;
		String maxOccuranceWord = null;
		for(Map.Entry<String,Integer> e : hm.entrySet()){  // n times O(n2)
			
			if(e.getValue() > count){
				count = e.getValue();
				maxOccuranceWord = e.getKey();
			}
		}
		
		System.out.println(maxOccuranceWord + ": times " + count );
		
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}

}
