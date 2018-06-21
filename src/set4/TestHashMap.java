package set4;

import set1.Set1Examples.Entry;
import set1.Set1Examples.HashMapClass;

public class TestHashMap {

	public int size;
	public Entry[] table;
	
	public TestHashMap(int length) {
		this.size = length;
		table = new Entry[this.size];
		for(int i=0; i < table.length; i++ ){
			table[i] = null;
		}
	}
	
	public void put(String key, int value){
		
		int hash = key.hashCode() % size;
		
		while(table[hash] != null && table[hash].getKey() != key)
				hash = (hash + 1) % size;
		
		Entry e = new Entry(key, value);
		table[hash] = e;
		
	}
	
	public int get(String key){
		int value = -1;
		
		int hash = key.hashCode() % size;
		
		while(table[hash] != null && table[hash].getKey() != key)
				hash = (hash + 1) % size;
		
		if (table[hash].getKey() == key ) {
			value = table[hash].getValue();
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Hash Map implementation
		
		TestHashMap hm = new TestHashMap(64);
		
		hm.put("chandra", 12);
		hm.put("madhu", 13);
		
		System.out.println(":" + hm.get("chandra"));
	}

public static class Entry{
		
		private String key;
		private int value;
		
		public Entry (String key, int value) {
			this.key = key;
			this.value = value;
		}
		
		public String getKey(){
			return key;
		}
		
		public int getValue() {
			return value;
		}
	}
}
