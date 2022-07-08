package src.ds.hashTable;

public class HashTable {
	int size = 10;
	LinkedList[] list;
	
	public HashTable() {
		list = new LinkedList[size];
	}
	
	public void insert(int data) {
		int hash = calculateHash(data);
		
		if (list[hash] == null) {
			list[hash] = new LinkedList();
		}
		list[hash].insert(data);
	}
	
	int calculateHash(int data) {
		return data % 10;
	}
	
	public int get(int key) {
		int hash = calculateHash(key);
		if (list[hash] == null) return -1;
		return list[hash].search(key).data;
	}
	
	public void display() {
		for (LinkedList ls : list) {
			if (ls != null) {
				ls.display();				
			}
		}
	}
}
