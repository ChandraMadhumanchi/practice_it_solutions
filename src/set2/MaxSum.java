package set2;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {2,-5,8,2,-10,2,4};
		int maxSum = 0;
		int tempSum = 0;
		for(int i=0; i < arr.length; i++){
			tempSum += arr[i];
			
			if(maxSum < tempSum)
				maxSum = tempSum;
			if(tempSum < 0)
				tempSum = 0;
		}
		// Another 
		int s = 0;
		int t = 0;
		for(int i=0; i < arr.length; i++){
			t += arr[i];
			
			if( s < t)
				s = t;
			
			if(t < 0)
				t = 0;
		}
		System.out.println("maxSum : "+ maxSum);
		System.out.println("maxSum : "+ s);
	}

}
