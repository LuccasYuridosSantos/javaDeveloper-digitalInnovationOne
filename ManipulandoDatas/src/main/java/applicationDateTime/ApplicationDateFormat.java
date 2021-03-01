package applicationDateTime;

import java.text.DateFormat;
import java.util.Date;

public class ApplicationDateFormat {

    public static void main(String[] args) {

        Date now = new Date();

        String dateToStr = DateFormat.getDateInstance().format(now);

        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);

        System.out.println(dateToStr);

    }
}
