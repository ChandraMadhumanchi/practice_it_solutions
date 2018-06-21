package set2;

/*
 	Partition a set into two subsets such that the difference of subset sums is minimum
    Returns minimum possible difference between sums
// of two subsets
  	 input = {2,3,4,5,6,7}
	 2 groups
	  
	  // [4,1,2]
	  // [4,1][2] -> 2.5, 2 -> | 2.5 - 2 | = 0.5
	  // [4][1,2] -> 4, 1.5 -> | 4 - 1.5 | = 2.5
	  // [1][4,2] -> 1, 3 -> |1-3| = 2
	   
	   Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.

		If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.

		Example:
		
		Input:  arr[] = {1, 6, 11, 5} 
		Output: 1
		Explanation:
		Subset1 = {1, 5, 6}, sum of Subset1 = 12 
		Subset2 = {11}, sum of Subset2 = 11        
 */

public class OptimalSumBetween2sets {

	public static void main(String[] args) {

		int[] arr = new int[] {4,1,2};
		
		int n = arr.length;
		System.out.println("The minimum difference between two sets is " + 
                findMax(arr, n));
		
	}

	 public static int findMax(int[] arr, int n){
				    
		// Compute total sum of elements
	    int sumTotal = 0;
	    for (int i = 0; i < n; i++)
	         sumTotal += arr[i];
	      
	        // Compute result using recursive function
	        return findMaxDiff(arr, n, 0, sumTotal);
	 }
	  
	 	// Function to find the maxinum sum
	    public static int findMaxDiff(int arr[], int i,int sum,int sumTotal)
	    {
	        // If we have reached last element.
	        // Sum of one subset is sumCalculated,
	        // sum of other subset is sumTotal-
	        // sumCalculated.  Return absolute 
	        // difference of two sums.
	        if (i == 0)
	            return Math.abs((sumTotal-sum) - sum);
	      
	      
	        // For every item arr[i], we have two choices
	        // (1) We do not include it first set
	        // (2) We include it in first set
	        // We return minimum of two choices
	        return Math.min(findMaxDiff(arr, i - 1, sum  + arr[i-1], sumTotal),
	        		findMaxDiff(arr, i-1,sum, sumTotal));
	    }
}
