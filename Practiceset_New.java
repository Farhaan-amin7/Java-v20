
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practiceset_New {
    public static void main(String[] args) {
//        Question number one through Hashsets
//        ArrayList<String> studentNnames = new ArrayList<>();
//        studentNnames.add("Farhaan");
//        studentNnames.add("Sahil");
//        studentNnames.add("Tanseef");
//        studentNnames.add("Harry");
//        studentNnames.add("Waseem");
//        studentNnames.add("Sheema");
//        studentNnames.add("Danish");
//        studentNnames.add("Furqaan");
//        studentNnames.add("saalim");
//        studentNnames.add("Faheem");
//
//        for (Object x : studentNnames
//        ) {
//            System.out.println(x);
//
//        }
//        HashSet<Integer> op = new HashSet<>();
//        op.add(100);
//        op.add(130);
//        op.add(150);
//        op.add(190);
//        op.add(500);
//        op.add(600);
//        op.add(100);
//        System.out.println(op);
//        System.out.println(op.contains(100));
//        System.out.println(op.size());
//        Question number 2 Through java.Calendar.
          Date d=  new Date();
        System.out.println(d.getHours() +" : " + d.getMinutes() +" : " + d.getSeconds());
        Calendar ui= Calendar.getInstance();
        System.out.println(ui.get(Calendar.HOUR_OF_DAY ) +" : "+ui.get(Calendar.MINUTE)+" : "+ui.get(Calendar.SECOND));
//      Question number last through java. time . api
        LocalDateTime gt= LocalDateTime.now();
        DateTimeFormatter gy= DateTimeFormatter.ofPattern("hh : mm : ss ");
        Object s= gt.format(gy);
        System.out.println(s);


    }
}