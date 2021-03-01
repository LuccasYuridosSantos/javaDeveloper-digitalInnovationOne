package applicationDateTime;

import java.time.LocalDateTime;

public class ApplicationLocalDateTime {

    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        LocalDateTime future = now.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(future);
    }
}
