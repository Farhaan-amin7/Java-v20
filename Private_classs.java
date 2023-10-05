import java.util.ArrayDeque;

public class Private_classs {
    public static void main(String[] args) {
        ArrayDeque<Integer> link = new ArrayDeque<>();
        ArrayDeque<Integer> link1 = new ArrayDeque<>();
        link1.add(7);
        link1.add(5);
        link1.add(4);
        link1.add(3);

        link.add(500);
        link.add(50);
        link.addFirst(250);
        link.addLast(300);
        link.addAll(link1);
        link.pop();
        link1.removeAll(link1);
        System.out.println(link1);
//        System.out.println(link.element());

    }

}