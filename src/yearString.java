import java.util.*;
import java.time.LocalDate;
public class yearString {
    public static void getYearFromDate(String date) {
        LocalDate inputDate = LocalDate.parse(date);
        // Get year from date
        int year = inputDate.getYear();
        System.out.println("Year extracted from date is : " + year);
    }
    public static void main(String args[]) {
        String date = "2000-07-13";
        getYearFromDate(date);
    }
}