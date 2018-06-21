package set4;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t = "oneWord";
		char[] t1 = t.toCharArray();
		reverse(t1,0,t1.length-1);
		System.out.println(""+ new String(t1));
		System.out.println(" above is single word reverse string");
		
		String rev = "chandra madhu andhra";
		char[] s = rev.toCharArray();
		
		
		int i = 0;
		for(int j=0; j < s.length; j++){
			
			if(s[j]==' '){
				
				reverse(s,i,j-1);
				i = j+1;
			}
		}
		reverse(s,i,s.length-1);
		reverse(s,0,s.length-1);
		
		System.out.println(""+ new String(s));

	}
	public static void reverse(char[] s,int left,int right){
		
		while(left < right){
			 char temp = s[left];
			 s[left] =  s[right];
			 s[right] =  temp;

			 left++;
			 right--;
		}
	}

}
