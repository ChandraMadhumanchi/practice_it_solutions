package set4;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "Ruby of Andhra", "ZCZAjjfsdfnj", "Pythonasdjhasd asd", "Javaasd asdasd asd" };

		Arrays.sort(words);
		
		/*
       
        for(int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < 4; ++j) {
                if (words[i].compareTo(words[j]) > 0) {

                    // swap words[i] with words[j[
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
*/
        System.out.println("In lexicographical order:");
        for(int i = 0; i < 4; i++) {
            System.out.println(words[i]);
        }
        
        // reverse String
        
        System.out.println("Reverse String start here:");
        String strString ="GeeksforGeeks";
        System.out.println(strString);
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer(strString).reverse();
        char[] charArr = strString.toCharArray();
        for(int i=charArr.length-1; i >= 0; i--){
        	//System.out.print("" + charArr[i]);
        	sb.append(charArr[i]);
        }
        
        System.out.println(""+ sb.toString());
        if(sb1.equals(strString))
			System.out.println("True");
        else
        	System.out.println("False");
        
        for(int i=0; i < charArr.length; i++){
        	
        	char temp = charArr[i];
        	charArr[i] = charArr[(charArr.length - 1) - i];
        	charArr[(charArr.length - 1) - i] = temp;
        }
        System.out.println(new String(charArr));
	}

}
