import java.util.ArrayList;
 import java.util.*;

import static java.lang.Long.SIZE;

//The following code contains some of the common Methods used by programmers.
public class Array_List_Examples {
    public static void main(String[] args) {

//      Before using an Arraylist we have to create an object for ArrayList ->
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> here = new ArrayList<>();
        ArrayList<Integer> Here = new ArrayList<>();
//        String [] ish= new String[SIZE];
//        Object [] farhaan=  ish;
//        System.out.println();
//        You might be wondering that why did i make a new object thats because to append the elements of this(the new one) arraylist to the  old one that i have already created.
//    The upper code initializes the Array list as an object created by me and named  this object as first.
        first.add(4);
        first.add(4);
        first.add(3);
        first.add(4);
        first.add(7);//this is on the fifth position
        first.add(5);
        first.add(2,50);//will act as a bully as it adjusts itself and pushes the other elements +1
        here.add(50);
        here.add(58);
        here.add(53);
        here.add(52);
        first.addAll(here);
        System.out.println(first);
        Object [] arr= first.toArray();//creation of the new object and assigning the matrial of the arraylist first to the String array (arr)

        System.out.println("Elements of first ArrayList"
                + " as Array: "
                + Arrays.toString(arr));//first array list will be converted to arrays and printed.
//        type the array list name you want to append and then type the arraylist name as a parameter which you want to T append

//        System.out.println("The last element occurence is at "+first.lastIndexOf(5));

//        first.clear();
//        here.clear();
//        .clear() is used to clear the ArrayList whatever data it holds in it. just name the  ArrayList name and the .clear annotation
//
//        first.clone();
//        for(int i=0;i<first.size();i++)
//        {
//            System.out.println(first.get(i));
//        }
//        System.out.println(Here.isEmpty());
//        returns true is a arraylist is empty
//      The two parameterized add() is used to attach the specified element in the specified index(both can be done by user).
//      This is the first method which is commonly used ->
//        for(int i=0;i<first.size();i++)
//        {
//     --- The .size() method is used to get the size of the arraylist and do various operations on the arraylist
//            System.out.println(first.get(i));
//        }
//        System.out.println("The index of " + first.indexOf(50));will give me the index of the element 50
//        System.out.println(first.get(5));//this gives me the element of the index which i enter as parameter
//    ---  The .indexOf() method is used to get the index of the element given in the parameter.

//        Syste

//        m.out.println(first.iterator()
//        System.out.println("The element at the 2nd index was "+first.get(2));
//        first.remove(2);
//        System.out.println("The element at this index is "+first.get(2));
//        first.removeAll(first);//If i assign it with the object like here and aslo the parameters if i give it same then the given arraylist gets empty all the elements gets removed
//        for(int i=0;i<here.size();i++)
//        {
//            System.out.println("The elements in this array list is " + here.get(i));
//        }
//        for(int i=0;i<first.size();i++)
//        {
//            System.out.println("The elements in the first array list is  " + first.get(i));
//        }
        System.out.println(first.containsAll(first));


    }

}