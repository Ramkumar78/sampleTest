package DataTypesAndLoops;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExamples {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate hireDate = LocalDate.of(2008, Month.APRIL, 30);
        LocalDate aWeekFromNow = now.plusWeeks(2);
        p(aWeekFromNow);
        LocalDate aWeekAgo = now.minusWeeks(1);
        p(aWeekAgo);
        System.out.println(hireDate.isBefore(now));
        p(hireDate);
        p(now);
    }

    public static void p(Object o) {
        System.out.println(o);


    }
}
