package DataTypesAndLoops;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CurrentDate {
    public LocalDateTime DateChecker12(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        int test=now.getHour();

        System.out.println(dtf.format(now));

        return now;
    }

    public String tellMeAMorPM(){

        String noonChecker = null;

        int l=
        LocalDateTime.now().getHour();


    if( (LocalDateTime.now().getHour()+7)<12){
        noonChecker="AM";

    }
    else
    {noonChecker="PM";}
        System.out.println(noonChecker);
        return noonChecker;
    }
}   