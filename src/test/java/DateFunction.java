import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ramkumar on 20/04/2017.
 */
public class DateFunction {

    public static void main(String args[]) throws ParseException {
        String date="27/04/2017";
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        Date d=df.parse(date);

        String month=new SimpleDateFormat("MMMM").format(d);
        String year=new SimpleDateFormat("yyyy").format(d);
        System.out.println(month);
        System.out.println(year);

        Date CD=new Date();
        System.out.println(CD);
        String day1=new SimpleDateFormat("dd").format(CD);
        String month1=new SimpleDateFormat("MMMM").format(CD);
        String year1=new SimpleDateFormat("yyyy").format(CD);
        System.out.println(day1+"/"+month1+"/"+year1);


    }
}
