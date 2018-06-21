package set1;

public class HashMap {

	private static int size = 32;
	Entry [] table;
	
	
	public HashMap(){
		table = new Entry[size];
		for(int i =0; i < size; i++){
			table[i] = null;
		}
	}
	
	public void put (String key,int value){
		
		int hash = key.hashCode() % 32;
		
		while(table[hash] != null && table[hash].getKey() != key)
				hash = hash + 1 % size;
		
		Entry e = new Entry(key,value);
		table[hash] = e;
	}
	
    public int get (String key){
		
		int hash = key.hashCode() % 32;
		
		while(table[hash] != null && table[hash].getKey() != key){
			hash = hash + 1 % size;
		}
		if(table[hash] != null && table[hash].getKey() == key)
			return table[hash].getValue();
		else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		hm.put("SFO", 2);
		hm.put("FRE", 8);
		
	    System.out.println("" + hm.get("FRE"));
	  
	}

	public class Entry{
		
		private String key;
		private int value;
		
		public Entry(String key,int value){
			this.key = key;
			this.value = value;
		}
		
		public String getKey(){
			return key;
		}
		
		public int getValue(){
			return value;
		}
	}
}
