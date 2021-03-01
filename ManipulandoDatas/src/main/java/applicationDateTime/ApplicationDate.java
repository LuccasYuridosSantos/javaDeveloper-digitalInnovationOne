package applicationDateTime;

import java.time.Instant;
import java.util.Date;

public class ApplicationDate {
    public static void main(String[] args) {

        //exemplo 01
        Date novaData = new Date();

        System.out.println(novaData);

        //exemplo 02
        long currrentTimeMillis = System.currentTimeMillis();

        System.out.println(new Date(currrentTimeMillis));

        //exemplo 03
        Date pass = new Date(1513124807691L);

        Date future = new Date(1613124807691L);

        boolean isAfter = pass.after(future);
        boolean isBefore = pass.before(future);

        System.out.println(isAfter);

        System.out.println(isBefore);


        //exemplo 04
        Date dataPass = new Date(1513124807691L);
        Date dataFuture = new Date(1613124807691L);
        Date dataEqual = new Date(1613124807691L);

        /* Comparando se a datas são iguais*/
        boolean isEquals = dataFuture.equals(dataEqual);

        System.out.println(isEquals);

        /* Comparando uma data com a outra*/
        int compareCaseOne = dataPass.compareTo(dataFuture);
        int compareCaseTwo = dataFuture.compareTo(dataPass);
        int compareCaseThree = dataFuture.compareTo(dataEqual);

        System.out.println(compareCaseOne+"\n"+compareCaseTwo+"\n"+compareCaseThree);

        /*Exemplo 5 conversão entre Date e Instant*/

        Date begin = new Date();
        System.out.println(begin);

        Instant instant = begin.toInstant();
        System.out.println(instant);
    }
}
