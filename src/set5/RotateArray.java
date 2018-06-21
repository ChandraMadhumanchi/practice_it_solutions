package set5;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7};
		int rotate = 3;
		
		// approach 1
		/*
		int[] result = new int[arr.length]; 
		
		for(int i =0; i < rotate; i++){
			System.out.println("=>" + arr[arr.length - rotate+i]);
			result[i] = arr[arr.length - rotate+i];
		}
		
		int j= 0;
		
		for(int i = rotate; i < arr.length; i++){
			System.out.println("=>"+arr[j]);
			result[i] = arr[j];
			j++;
		}
		
		System.out.println("****" +Arrays.toString(result));
		System.arraycopy( result, 0, arr, 0, arr.length );
		System.out.println("====" + Arrays.toString(result));
		*/
		rotate(arr,rotate);
	}

	public static void rotate(int[] arr,int order){
		
		if(arr.length < 0 || order ==0 ){
			throw new IllegalArgumentException("illegal Arguments");
		}
		
		// divide the array into 2 parts;
		
		// length of the first part
		
		int a = arr.length - order;
		
		reverse(arr,0,a-1);
		System.out.println("1" + Arrays.toString(arr));
		reverse(arr,a,arr.length - 1);
		System.out.println("1" + Arrays.toString(arr));
		reverse(arr,0,arr.length - 1);
		System.out.println("1" + Arrays.toString(arr));
		
	}
	
	public static void reverse(int[] arr,int left, int right){
		
		if(arr == null || arr.length == 1) return;
		
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left ++;
			right --;
		}
		
	}
}
