package DataTypesAndLoops;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Formatter;

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

        LocalTime nowTime= LocalTime.now();
        p(nowTime);
        LocalTime timeHired=LocalTime.of(3,33,33);
        p(timeHired);
        LocalTime anHourFromNow=nowTime.plusHours(1);
        p(anHourFromNow);
        p(anHourFromNow.minusHours(2));


        LocalDateTime nowDateTime=LocalDateTime.now();p(nowDateTime);
        LocalDateTime timeHiredDate=LocalDateTime.of(2008,Month.APRIL,21,13,0,0);
        p(nowDateTime);
        System.out.println(nowDateTime.isBefore(timeHiredDate));

        Period period=Period.of(3,5,12);
        p(period);

        nowDateTime=nowDateTime.minus(period);
        p(nowDateTime);

        DateTimeFormatter dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        p(now.format(dtf));

        DateTimeFormatter patternFormatter=DateTimeFormatter.ofPattern("yyyy/dd/M");
        p(now.format(patternFormatter));

    }

    public static void p(Object o) {
        System.out.println(o);


    }
}
