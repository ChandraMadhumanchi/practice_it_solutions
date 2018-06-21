package set4;

public class FindFirstStringIsaSubsequenceofSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given two strings, find if first string is a subsequence of second
		System.out.println("" + match("hello world", "world"));
		System.out.println("" + match("hello world", "wld"));
		System.out.println("" + match("hello world", "whd"));
		
	
	}
	
	

	public static boolean match(String text, String query) {

		int m = text.length();
		int n = query.length();
		
		int j = 0;
		for (int i = 0; i < m && j < n; i++) {
			if (text.charAt(i) == query.charAt(j))
				j++;
			if (n == j)
				return true;
		}
		return false;
	}
}
