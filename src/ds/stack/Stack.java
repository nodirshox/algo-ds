package src.ds.stack;

public class Stack<T> {
    Node top;
    final int CAPACITY = 5;
    int size;
    public Stack() {
        size = 0;
        top = null;
    }

    class Node {
        T data;
        Node previous;
        Node(T data) {
            this.data = data;
        }

        T getData() {
            return data;
        }
    }

    public void push(T data) {
        Node newNode = new Node(data);

        // if stack is full
        if (size == CAPACITY) {
            System.out.println("Stack is full");
            return;
        }

        // if stack is empty
        if (isEmpty()) {
            top = newNode;
            size++;
            return;
        }

        newNode.previous = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        Node temp = top;
        top = top.previous;
        size--;
        return temp.getData();
    }

    public T top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        top = null;
        size = 0;
    }
}
