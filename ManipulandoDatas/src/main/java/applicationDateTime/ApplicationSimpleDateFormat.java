package applicationDateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplicationSimpleDateFormat {
    public static void main(String[] args) {

        Date now  = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");

        String dataFormatada = formatter.format(now);

        System.out.println(dataFormatada);

    }
}
