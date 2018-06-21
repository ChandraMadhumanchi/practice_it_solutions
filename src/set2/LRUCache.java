package set2;

import java.util.*;

public class LRUCache {

	// https://www.programcreek.com/2013/03/leetcode-lru-cache-java/
	
	int capacity;
	HashMap<Integer,Node> map = new HashMap<Integer,Node>();
	Node head = null;
	Node end = null;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
	}
	
	public int get(int key){
		if(map.containsKey(key)){
			 Node n = map.get(key);
			 remove(n);
			 setHead(n);
			 return n.value;
		}
		return -1;
	}
	
	public void set(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else{
            Node created = new Node(key, value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
 
            }else{
                setHead(created);
            }    
 
            map.put(key, created);
        }
    }
	
	public void remove(Node n){
		if(n.pre != null){
			n.pre.next = n.next;
		} else {
			head = n.next;
		}
		
		if(n.next != null){
			n.next.pre = n.pre;
		} else {
			end = n.pre;
		}	
	}
	
	public void setHead(Node n){
		n.next = head;
		n.pre = null;
		
		if(head != null)
			head.pre = n;
		
		head =n;
		
		if(end == null)
			end = head;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRUCache lrc = new LRUCache(4);
		
		lrc.set(1, 1);
		lrc.set(2, 2);
		lrc.set(3, 2);
		lrc.set(4, 2);
		
		lrc.set(5, 5);
		
		System.out.println(" " + lrc.get(4));
	}

	class Node{
	    int key;
	    int value;
	    Node pre;
	    Node next;
	 
	    public Node(int key, int value){
	        this.key = key;
	        this.value = value;
	    }
	}
	
}
