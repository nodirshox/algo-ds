package src.ds.arrayList;

public class ArrayList {
    private final int INITIALIZE_SIZE = 10;
    private int[] list;
    private int capacity;

    public ArrayList() {
        list = new int[INITIALIZE_SIZE];
        capacity = 0;
    }

    public void add(int data) {
        if (list.length == capacity) {
            resize();
        }
        list[capacity++] = data;
    }

    private void resize() {
        int[] temp = new int [list.length * 2];
        System.arraycopy(list, 0, temp, 0, capacity);
        list = temp;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("ArrayList is empty");
            return;
        }

        for(int i = 0; i < capacity; i++) {
            System.out.print(list[i] + " - ");
        }
        System.out.println();
    }

    public int get(int index) {
        if (index < 0 || index >= capacity) {
            System.out.println("Out of index");
            return -1;
        }
        return list[index];
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public int length() {
        return capacity;
    }

    public boolean contains(int data) {
        for(int element:list) {
            if (element == data) {
                return true;
            }
        }

        return false;
    }
    public int indexOf(int data) {
        for (int i = 0; i < capacity; i++) {
            if (list[i] == data) {
                return i;
            }
        }

        return -1;
    }

    public void clear() {
        int[] temp = new int[INITIALIZE_SIZE];
        list = temp;
        capacity = 0;
    }
}
