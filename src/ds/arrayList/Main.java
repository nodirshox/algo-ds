package src.ds.arrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.display();
        list.add(4);
        list.add(3);
        list.add(7);
        list.display();
        System.out.println(list.getByIndex(1));
        System.out.println(list.getByIndex(5));
        System.out.println(list.getByIndex(-1));
    }
}
