package applicationDateTime;

import java.time.LocalTime;

public class ApplicationLocalTime {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        System.out.println(now);

        LocalTime newHour = now.plusHours(5);

        System.out.println(newHour);

    }
}
