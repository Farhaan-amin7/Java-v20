import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class Gregorian_Calnedar {
    public static void main(String[] args) throws InterruptedException {
//        Calendar gmt = Calendar.getInstance();
//        System.out.println(gmt.get(Calendar.DATE));
//        System.out.println(52 - gmt.get(Calendar.WEEK_OF_YEAR ));
//        System.out.println(gmt.get(Calendar.HOUR_OF_DAY)+" : "+Calendar.MINUTE+" : "+ Calendar.SECOND);
//        LocalDateTime l= LocalDateTime.now();
//        System.out.println(l);
//        LocalDate k= LocalDate.now();
//        System.out.println(k);
//        LocalTime h= LocalTime.now();
//        System.out.println(h.getMinute());
        LocalDateTime smash1= LocalDateTime.now();
        System.out.println(smash1);
        DateTimeFormatter smash= DateTimeFormatter.ofPattern("dd-MM-yyy -- E HH:mm");
//        String s= smash.format();
//        System.out.println(smash);
//        System.out.println();

        String s = smash1.format(smash);
        System.out.println(s);

//        for (int i = 0; i < 500; i++) {
//            Thread.sleep(100);
//            System.out.println(TimeZone.getAvailableIDs()[i]);
//
//        }
    }
}