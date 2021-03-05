package parallelStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class ParallelStreams {

    public static void main(String[] args) {
//        long inicio = System.currentTimeMillis();
//        LongStream.range(1,100000).forEach(num ->fatorial(num));//serial streams
//        long fim = System.currentTimeMillis();
//
//        System.out.println("Tempo de execução serial: "+(fim-inicio));
//
//
//        inicio = System.currentTimeMillis();
//        LongStream.range(1,100000).parallel().forEach(num ->fatorial(num));//parallel
//        fim = System.currentTimeMillis();
//
//        System.out.println("Tempo de execução parallel: "+(fim-inicio));


        List<String> names = Arrays.asList("Marcelo", "Antonia", "Alberto", "André", "Sebastião");
        names.parallelStream().forEach(System.out::println);

    }

    public  static long fatorial(long num){
        long fat = 1L;

        for (int i= 2; i<= num; i++ ){
            fat *= i;
        }

        return fat;
    }
}
