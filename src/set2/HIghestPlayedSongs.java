package set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;



public class HIghestPlayedSongs {

	public static ConcurrentHashMap<String,Integer> cHM1 = new ConcurrentHashMap<String,Integer>();
	public static HashMap<String,Integer> cHM = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		try
		{
		// TODO Auto-generated method stub

		/*
		   A -> 2
		   B -> 8
		   C -> 10
		   D -> 12
		   E -> 8
		   F -> 12
		 */
			HashMap<String,Integer> hm = new HashMap<String,Integer>();
			
			hm.put("A", 1);
			hm.put("B", 1);
			hm.put("C", 1);
			hm.put("D", 1);
			
			for(Entry<String,Integer>entry: hm.entrySet()){
				
				System.out.println(entry.getKey() +"" + entry.getValue());
			}
			
			// Add here 
		addSongs("A",2);
		addSongs("B",8);
		addSongs("C",10);
		addSongs("D",12);
		addSongs("E",8);
		addSongs("F",12);
		addSongs("A",10);
		
		for(Entry<String,Integer> entry : cHM.entrySet()){
		
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		}catch(Exception ex){
			System.out.println("Exception caught:  " + ex.getMessage());
		}
		
		// Get here
		
		System.out.println("Song A played :" + getSongCount("A"));
		
		highestPlayedSongs(12);
		
		String a = "abc";
		String b = "abc";
		
		int c =a.compareTo(b);
		
	}
	
	public static void highestPlayedSongs(int count){
		
		// Sort method needs a List, so let's first convert map to List in Java 
		
		Set<Entry<String, Integer>> entries = cHM.entrySet();
		
		
		//List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries); 

		List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(cHM.entrySet());
		
		Collections.sort(listOfEntries, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
		
		List<Entry<String,Integer>> listofenes = new ArrayList<Entry<String,Integer>>(cHM.entrySet());
		
		Collections.sort(listofenes, new Comparator<Entry<String,Integer>>(){
			public int compare(Entry<String,Integer> o1,Entry<String,Integer> o2){
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(listOfEntries.size());
		
		// copying entries from List to Map 
		
		for(Entry<String, Integer> entry : listOfEntries){ 
			map.put(entry.getKey(), entry.getValue()); 
		}
		/*
		System.out.println("HashMap after sorting entries by values "); 
		Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
		for(Entry<String, Integer> mapping : entrySetSortedByValue){
			System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); 
			}*/

		String value = "12";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
            	System.out.print(entry.getKey() +"");
        }
		}
   
	}
	
	
	public static void addSongs(String songName,int nTPCount){
		if(cHM.containsKey(songName)){
			cHM.put(songName, cHM.get(songName) + nTPCount );
		}else{
			cHM.put(songName, nTPCount);
		}
	}

	public static int getSongCount(String songName){
		int songs = cHM.get(songName);
		return songs;
	}
}
