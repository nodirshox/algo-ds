package src.ds.hashTable;

public class LinkedList {
	Node tail;
	Node head;
	class Node {
		int value;
		Node next;
		
		Node(int value) {
			this.value = value;
			this.next = null;
		}
	}
	
	public void insert(int value) {
		Node newNode = new Node(value);
		
		if(isEmpty()) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		
		while(current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
