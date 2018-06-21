package set1;

public class numberofCoins {

	public static void main(String[] args) {
/*
		The minimum number of coins for a value V can be computed using below recursive formula.
		If V == 0, then 0 coins required.
		If V > 0
		   minCoin(coins[0..m-1], V) = min {1 + minCoins(V-coin[i])} 
		                               where i varies from 0 to m-1 
		                               and coin[i] <= V 
		                      */         
		int[] arr = {1,5,2};
		int sum = 10;
		
		System.out.println("minimum coins is : "+ minCoins(arr,arr.length,sum));
		
		
	}
	
	public static int minCoins(int[] coinsArr,int L,int V){
		
		if (V == 0) return 0;
		
		int result = Integer.MAX_VALUE;
		
		for(int i = 0; i< L; i++){
			
			if(coinsArr[i] < V){
				
				int sub_result = minCoins(coinsArr,L,V-coinsArr[i]);
				
				if(sub_result != Integer.MAX_VALUE && sub_result + 1 < result)
					result = sub_result + 1;
			}
		}
		return result;
	}

}
