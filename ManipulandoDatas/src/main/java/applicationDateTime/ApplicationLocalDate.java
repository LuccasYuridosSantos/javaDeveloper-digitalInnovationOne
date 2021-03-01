package applicationDateTime;

import java.time.LocalDate;

public class ApplicationLocalDate {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate lastDay = today.minusDays(1);

        System.out.println(lastDay);

    }
}
