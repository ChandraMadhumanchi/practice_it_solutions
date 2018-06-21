package set2;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaab";
		System.out.println(s.matches("a{3}b?c*"));
		System.out.println(s.matches("aa|a[a-b]"));
		
		
		/*for(int i=0; i <= 255; ++i){
			System.out.println(i);
		}*/
		
		
	}

}
