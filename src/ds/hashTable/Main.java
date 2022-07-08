package src.ds.hashTable;

public class Main {
	public static void main(String[] args) {
		testLinkedList();
		testHashTable();
	}
	
	public static void testLinkedList() {
		System.out.println("=== Testing LinkedList ===");
		LinkedList list = new LinkedList();
		list.display();
		list.insert(4);
		list.insert(2);
		list.insert(5);
		list.insert(9);
		list.display();
		System.out.println(list.search(5));
		System.out.println("=== End ===\n");
	}
	
	public static void testHashTable() {
		System.out.println("=== Testing HashTable ===");
		HashTable table = new HashTable();
		table.insert(55);
		table.insert(54);
		table.insert(94);
		table.display();
		System.out.println(table.get(54));
		System.out.println("=== End ===\n");
	}
}
