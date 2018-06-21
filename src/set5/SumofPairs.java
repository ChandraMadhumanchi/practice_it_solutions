package set5;

import java.util.HashMap;

public class SumofPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,8,10,4,12,34,12,3,9,8,6};
		
		HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
		int target = 14;
		for(int i= 0; i < arr.length; i++){
			if(hMap.containsKey(arr[i])){
				System.out.println(hMap.get(arr[i]) + "," + i);
			}else{
				hMap.put(target-arr[i],i);
			}
		}
		
		int sum = 15;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0; i < arr.length; i++){
			
			if(hm.containsKey(arr[i])){
				System.out.println(hMap.get(arr[i]) + "," + i);
			} else {
				hMap.put(sum-arr[i], i);
			}
		}
		
		
	}
}
