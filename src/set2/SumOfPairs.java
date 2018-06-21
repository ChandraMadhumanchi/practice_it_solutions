package set2;

import java.util.*;

public class SumOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetSum = 18;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		HashMap<Integer,Integer> stMap = new HashMap<Integer,Integer>();
		
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(3,6,8,10,12));
		al.add(8);
		al.add(10);
		al.add(4);
		al.add(6);

		for (int i = 0; i < al.size(); i++) {
			// System.out.println(al.get(i));
			if (hm.containsKey(al.get(i))) {
				stMap.put(al.get(hm.get(al.get(i))), al.get(i));
			} else {
				hm.put(targetSum - al.get(i), i);
				//System.out.println(targetSum - al.get(i));
			}
		}
		
		for(int i=0; i < al.size(); i++){
			
			if(hm.containsKey(al.get(i))){
				System.out.println(al.get(hm.get(al.get(i))) + "," + al.get(i));
			}
		}

		
		 
		  ArrayList<Integer> AList = new ArrayList<Integer>();
		  //{1,8,3,2,7,8,4,5,6,2} AList.add(1); AList.add(8); AList.add(3);
		  AList.add(2); AList.add(7); AList.add(2); AList.add(4); AList.add(5);
		  AList.add(6); AList.add(8);
		  
		  Map<Integer,Integer> mPairs = sumOfPairs(AList,10);
		  System.out.print("["); for(Integer key: mPairs.keySet()){
		 
		  System.out.print("(" + key + "," + mPairs.get(key) + ")"); }
		  System.out.print("]");
		 
		 

	}

	public static Map<Integer, Integer> sumOfPairs(ArrayList<Integer> AL, int targetSum) {

		Map<Integer, Integer> rMap = new HashMap<Integer, Integer>();

		Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < AL.size(); i++) {

			if (tempMap.containsKey(AL.get(i))) {
				rMap.put(AL.get(tempMap.get(AL.get(i))), AL.get(i));
			} else {
				tempMap.put(targetSum - AL.get(i), i);
			}
		}
		return rMap;
	}

    
}
