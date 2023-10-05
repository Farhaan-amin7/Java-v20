import java.util.HashSet;





public class my_Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(10);
        myHashSet.add(200);
        myHashSet.add(300);
        myHashSet.add(400);
        myHashSet.add(500);
        myHashSet.add(500);//Hash set does not retain duplicate items.
        System.out.println(myHashSet.size());//size should be four.
//      System.out.println(myHashSet.contains(300));
        System.out.println(myHashSet);




        System.out.println();
    }
}