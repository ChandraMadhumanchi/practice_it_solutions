package set1;

import java.util.Stack;

import set1.HashMap.Entry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Set1Examples {
	
	public static void main(String[] args) {
		// anagrams
		ArrayList<String> possibleValues2 =
			    new ArrayList<>(Arrays.asList("cat","tac","mat","tma","atm","rat"));
		
		HashMap<String,Set<String>> result = new HashMap<>();
		
		for(String word:possibleValues2){
			
			char[] chArr = word.toCharArray();
			Arrays.sort(chArr);
			String sortString = new String(chArr);
			
			if(result.containsKey(sortString)){
				Set<String> set = result.get(sortString);
				set.add(word);
				result.put(sortString, set);
			} else {
				Set<String> set = new HashSet<String>();
				set.add(word);
				result.put(sortString, set);
			}
		}
		
		for(java.util.Map.Entry<String, Set<String>> e: result.entrySet()){
			
			for(String s : e.getValue()){
				System.out.print(" "+ s +  "");
			}
			System.out.println(" ");
		}
		
		System.out.println("*************");
		
		// JAVA program to check whether two strings
		// are anagrams of each other
		//1) Sort both strings
		//2) Compare the sorted strings

		String s1 = "cat";
		String s2 = "tac";
		
		// If length of both strings is not same,
        // then they cannot be anagram
        if (s1.length() != s2.length())
            System.out.println("they cannot be anagrams");
		
		boolean isAnagram = false;
		if(s1.length() == s2.length()){
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			System.out.println("" + Arrays.equals(ch1, ch2));
			
			char[] a1 = s1.toCharArray(); char[] a2 = s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			 Boolean test = Arrays.equals(a1, a2);
			 System.out.println("chandra" + test);
			
		}
		
		// reverse the given sentense
		
		String  s = "chandra madhumanchi ram";
		char[] sArr = s.toCharArray();
		int i =0;
		
		for(int j = 0; j < sArr.length; j++){
			if(sArr[j]==' '){
				reverse(sArr,i,j-1);
				i=j+1;
			}
		}
        
		
		reverse(sArr,i,sArr.length-1);
		reverse(sArr,0,sArr.length-1);
		
		System.out.println("" + Arrays.toString(sArr));
		
		/*
		 * String reverse  with out space
		 */
		String strSort = "geeksforgeeks";
		
	
		
		
		Stack s3 = new Stack();
		
		for(i = 0; i < strSort.length(); i++){
			//System.out.println(strSort.charAt(i));
			s3.push(strSort.charAt(i));
		}
		
		System.out.println("Actual String : " + strSort );
		System.out.println("after reverse  : " );
		
		while(! s3.empty())
			System.out.print(" "+ s3.pop());
		
	} 
		
	
	
	public static void reverse(char[] sArr,int l, int r){
		while( l < r){
			char temp = sArr[l];
			sArr[l] = sArr[r];
			sArr[r] = temp;
			l++;
			r--;
		}
	}
	
	
	public static void sort(int[] arr,int l , int r){
		
		if( l < r){
			
			 int mid = (l+r)/2;
			 
			 sort(arr,l,mid);
			 sort(arr,mid+1,r);
			 
			 merge(arr,l,mid,r);
		}
	}
	
	public static void merge(int[] arr,int l, int mid,int r){
		
		// find the size of two sub arrays
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		// create temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		// copy the elements to two arrays
		
		for(int i = 0; i < n1; i++){
			L[i] = arr[l+i];
		}
		
		for(int j = 0; j < n2; j++ ){
			R[j] = arr[mid +1 + j];
		}
		
		// merge temp arrays
		
		int i= 0, j =0;
		int k = l;
		
		
		while(i < n1 && j < n2){
			
			if(L[i] < R[j]){
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1){
				arr[k] = L[i];
				i++;
				k++;
		}
		while(j < n2){
				arr[k] = R[j];
				j++;
				k++;
		}
		
	}
	
	public static class HashMapClass {
		
		public int size = 32;
		public Entry[] table;
		
		public HashMapClass() {
			table = new Entry[32];
			for(int i=0; i < size; i++ ){
				table[i] = null;
			}
		}
		
		public void put(String key, int value){
			
			int hash = key.hashCode() % size;
			
			while(table[hash] != null && table[hash].getKey() != key)
					hash = (hash + 1) % size;
			
			Entry e = new Entry(key, value);
			table[hash] = e;
			
		}
		
		public int get(String key){
			int value = -1;
			
			int hash = key.hashCode() % size;
			
			while(table[hash] != null && table[hash].getKey() != key)
					hash = (hash + 1) % size;
			
			if (table[hash].getKey() == key ) {
				value = table[hash].getValue();
			}
			return value;
		}
		
	}
	
	public static class Entry{
		
		private String key;
		private int value;
		
		public Entry (String key, int value) {
			this.key = key;
			this.value = value;
		}
		
		public String getKey(){
			return key;
		}
		
		public int getValue() {
			return value;
		}
	}

}


