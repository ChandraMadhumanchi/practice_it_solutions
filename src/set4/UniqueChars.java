package set4;

public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("" + isUniqueChars("abc"));
		
		String name = "abc";
		
		boolean[] arr = new boolean[128];
		
		for(int i = 0; i < name.length(); i++ ){
			
			int val = name.charAt(i);
			char one1 = name.charAt(i);
			System.out.println("val:"+ val + "one1:" + one1 );
			if(arr[val]){
				System.out.println("flase");
			}
			else
			{
				arr[val] = true;
			}
		}
		
	}

	public static boolean isUniqueChars(String str){
		
		if(str.length() > 128) return false;
		
		boolean[] char_set = new boolean[128];
		
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			char one1 = str.charAt(i);
			System.out.println("val:"+ val + "one1:" + one1 );
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		
		return true;
	}
}
