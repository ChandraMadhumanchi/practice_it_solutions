package set1;

import java.util.*;
//import org.apache.commons.collections.ListUtils;

public class UnionOF2ListsUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lst1 = new ArrayList<Integer>(Arrays.asList(2,5,6,8));
		
		List<Integer> lst2 = new ArrayList<Integer>(Arrays.asList(2,3,2,4,7,8,2,8));
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer num : lst1){
			set.add(num);
		}
		
		
		for(Integer num : lst2){
			if(!set.contains(num)){
				set.add(num);
			}
		}
		
		System.out.println("Approach1: ");
		for(Integer num: set){
		    System.out.print(num + " ");
		}
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		System.out.println("");
		System.out.println("Intersection: ");
		for(Integer num : lst2){
			if(lst2.contains(num)){
				set1.add(num);
			}
		}
		
		System.out.println("");
		for(Integer num1: set1){
		    System.out.print(num1 + " ");
		}
		/*
		 * 
		 * 
		 */
		System.out.println("");
		
		 System.out.println("Approach2 union:");
		 
		set.addAll(lst1);
		set.addAll(lst2);
		List<Integer> a= new ArrayList<>(set);
		for(Integer r: a){
		    System.out.print(r + " ");
		}
		
	}

}
