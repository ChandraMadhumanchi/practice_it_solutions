package set1;

import java.util.ArrayList;
import java.util.Collections;

public class UnionOF2Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> AL1 = new ArrayList<Integer>();
		AL1.add(7);
		AL1.add(1);
		AL1.add(5);
		AL1.add(2);
		AL1.add(3);
		AL1.add(6);
		
	        
		ArrayList<Integer> AL2 = new ArrayList<Integer>();
		AL2.add(3);
		AL2.add(8);
		AL2.add(6);
		AL2.add(20);
		AL2.add(7);
		
		ArrayList<Integer> Al3 = unionofLists(AL1, AL2, AL1.size(), AL2.size());

		
		for(int i=0; i < Al3.size();i++){
			System.out.print(" " + Al3.get(i));
		}
	}

	public static ArrayList<Integer> unionofLists(ArrayList<Integer> AL1, ArrayList<Integer> AL2, int m, int n) {
		ArrayList<Integer> rL = new ArrayList<Integer>();

		if (m > n) {
			ArrayList<Integer> tempAL = AL1;
			AL1 = AL2;
			AL2 = tempAL;

			int temp = m;
			m = n;
			n = temp;
		}
		
		Collections.sort(AL1);
		for(int i=0; i < AL1.size();i++){
			System.out.print(" " + AL1.get(i));
		}
		for (int i = 0; i < n; i++) {
			if (binarySearch(AL1, 0, AL1.size(), AL2.get(i)) == -1) {
				//System.out.print(" "+ AL2.get(i));
				rL.add(AL2.get(i));
			}
		}

		return rL;
	}

	public static int binarySearch(ArrayList<Integer> AL1, int start, int end, int num) {

		int result = -1;

		if (end >= start) {
			
			int mid = (start + end)/2;
			
			if(AL1.get(mid) == num){
				return AL1.get(mid);
			}
			
			if(AL1.get(mid) > num){
				return binarySearch(AL1, start, mid-1, num);
			}
			
			return binarySearch(AL1,mid+1, end, num);
			
		}
		return result;
	}

}
