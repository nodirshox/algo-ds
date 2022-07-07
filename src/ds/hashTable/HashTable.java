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
	
	public void display() {
		for (LinkedList ls : list) {
			if (ls != null) {
				ls.display();				
			}
		}
	}
}
