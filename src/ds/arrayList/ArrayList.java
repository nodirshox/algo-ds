package src.ds.arrayList;

public class ArrayList {
    int size = 10;
    int[] list;
    int capacity;

    public ArrayList() {
        list = new int[size];
        capacity = 0;
    }

    public void add(int data) {
        if (list.length == capacity) {
            resize();
        }
        list[capacity++] = data;
    }

    public void resize() {
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

    public int getByIndex(int index) {
        if (index < 0 || index > capacity) {
            System.out.println("Out of index");
            return -1;
        }
        return list[index];
    }

    public boolean isEmpty() {
        return capacity == 0;
    }
}
