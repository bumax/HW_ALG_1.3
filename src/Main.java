import model.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>() ;
        list.add(76);
        list.add(74);
        list.add(32);
        list.add(1);
        list.add(7);
        list.add(97);
        list.print();
        list.reverse();
        list.print();
    }
}