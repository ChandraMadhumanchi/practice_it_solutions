package set5;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbaddcc";
		char[] ch = str.toCharArray();
		
		int tail = 1;
		int j;
		for(int i =1; i < ch.length; ++i){
			for(j = 0; j < tail; j++){
				
				if(ch[i] == ch[j])
						break;
			}
			if(j == tail){
				ch[tail] = ch[i];
				++tail;
			}else{
				ch[tail] = 0;
				++tail;
			}
			
		}
		
		String str2 = String.valueOf(ch);
		System.out.println("" + str2);
		
		
		String[] str1 = "aabbaddcc".split("");
		
		String temp ="";
		for(int i=0; i < str1.length; i++ ){
			
			if(!temp.contains(str1[i])){
				temp = temp + str1[i];
			}
		}
		System.out.println(""+temp);
		
	}

}
