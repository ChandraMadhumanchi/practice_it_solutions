package set2;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] rArr = new int[] {1,2,3,4,5,6};
		int order = 2; // rotate 2 positions 6,5,1,2,3,4,5
		
		// First method
		
		int[] nums = new int[] {1,2,3,4,5,6};
		int k = 2; // rotate 2 positions 6,5,1,2,3,4,5
		
		
		        int[] ar = new int[nums.length];
		        for (int i = 0; i < nums.length; i++) {
		            ar[(i + k) % nums.length] = nums[i];
		            System.out.println( i + " :"+ k + "%" + nums.length + ":=>"+ (i + k) % nums.length + "=" + nums[i] );
		        }
		        for (int i = 0; i < nums.length; i++) {
		            nums[i] = ar[i];
		        }
		    
		        for(int i = 0; i < nums.length; i++){
		        			System.out.print( nums[i] + " ");
		        }
		
		        System.out.println( "end");
		        
		//Second method
		
		// divide array into 2 parts [1,2,3,4] [5,6]
		//[6,5] [4,3,2,1] [6,5,1,2,3,4]
		
		//if(order > rArr.length){
		//	order = order % rArr.length;
		//}
	 
		//length of first part
		int a = rArr.length - order; 
		
		System.out.println(a + ":" + order + ":" + rArr.length);
		
		reverse(rArr,0,a-1);
		reverse(rArr,a,rArr.length-1);
		reverse(rArr,0,rArr.length-1);
		
		System.out.print("[");
		for(int i =0; i < rArr.length; i++ ){
			System.out.print(rArr[i] + " " );
		}
		System.out.print("]");
	}

	public static void tempReverse(int[] rArr,int left,int right){
		while(left < right){
			int temp = rArr[left];
			rArr[left] = rArr[right];
			rArr[right] = temp;
			
			left++;
			right--;
		}
	}
	public static void reverse(int[] rArr,int l,int r){
		while(l < r){
			int temp = rArr[l];
			rArr[l] = rArr[r];
			rArr[r] = temp;
			l++;
			r--;
		}
		
		System.out.print("[");
		for(int i =0; i < rArr.length; i++ ){
			System.out.print(rArr[i] + " ");
		}
		System.out.print("]");
		
		System.out.println("-------");
	}
}
