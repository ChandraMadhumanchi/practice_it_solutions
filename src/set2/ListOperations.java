package set2;

import java.util.*;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		grades.add(10);
		grades.add(12);
		grades.add(45);
		grades.add(12);
		grades.add(35);
		
		int total = 0;
		
		Collections.sort(grades);
		

		for(Integer grade: grades){
			System.out.println(grade + "");
			total += grade;
		}
		
		System.out.println("The avarage is : "+ total/grades.size());
		
		
		
		HashSet<String> names = new HashSet<String>();
		
		names.add("chandra");
		names.add("madhu");
		names.add("ram");
		names.add("krishna");
		
		System.out.println("The size of the hash set is" + names.size());
		
		for(String name: names){
			System.out.println(name + "");
		}
		
		
		TreeSet<String> namesTS = new TreeSet<String>();
		
		namesTS.add("chandra");
		namesTS.add("madhu");
		namesTS.add("ram");
		namesTS.add("krishna");
		
		System.out.println("The size of the hash set is" + namesTS.size());
		
		for(String name: namesTS){
			System.out.println(name + "");
		}
	}

}
