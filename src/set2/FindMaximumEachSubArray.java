package set2;

//Java Program to find the maximum for each and every contiguous subarray of size k.

public class FindMaximumEachSubArray
{
  // Method to find the maximum for each and every contiguous subarray of size k.
  static void printKMax(int arr[], int n, int k) 
  {
      int j, max;

      for (int i = 0; i <= n - k; i++) {  // n-k = 11 -3 = 8 // 10-3=7
           
          max = arr[i];

          for (j = 1; j < k; j++) 
          {
              if (arr[i + j] > max)
                  max = arr[i + j];
          }
          System.out.print(max + " ");
      }
  }

  // Driver method
  public static void main(String args[]) 
  {
      //int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	  int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
      int k = 3;
      System.out.println("k:"+ k + "   arr.length: "+ arr.length);
      printKMax(arr, arr.length, k);
  }
}