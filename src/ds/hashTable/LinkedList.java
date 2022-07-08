package src.ds.hashTable;

public class LinkedList {
	Node tail;
	Node head;
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
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
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println();
	}
	
	public Node search(int data) {
		if (isEmpty()) return null;
		Node current = head;
		
		while(current != null) {
			if (current.data == data) return current;
			current = current.next;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
