package set4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class AnagramsAlgorithm {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>(Arrays.asList(""));
		
		List anograms = new ArrayList<String>();
		Map<String, Set<String>> anagramsMap = new HashMap<String, Set<String>>();
		
		// How to read data from file
		File f = new File("./test.txt");
		FileReader in;
		String line = null;
		try {
			in = new FileReader(f);
			BufferedReader br= new BufferedReader(in);
			
			while((line = br.readLine()) != null){
				String[] strArr = line.split(" ");
				for(String str : strArr){
					al.add(str);
				}
			}
			
			
			for(String word: al){
				char[] tmp = word.toCharArray();
				Arrays.sort(tmp);
				String sortkey = new String(tmp).toLowerCase();
				if (anagramsMap.get(sortkey) == null) {
	                Set<String> values = new HashSet<String>();
	                values.add(word);
	                anagramsMap.put(sortkey, values);
	            } else {
	                Set<String> values = anagramsMap.get(sortkey);
	                values.add(word);
	                anagramsMap.put(sortkey, values);
	            }
			}
			
			for (Map.Entry<String, Set<String>> entry : anagramsMap.entrySet()) {
	           // if (entry.getValue().size() == 1) continue;
	            for (String s : entry.getValue()) {
	                System.out.print(s + " ");
	            }
	            System.out.println();
	        }
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}
	
	

}
