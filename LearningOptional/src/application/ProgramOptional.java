package application;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ProgramOptional {

    public static void main(String[] args){
        System.out.println("Valor opcional que está presente");
        Optional<String> optionalString = Optional.of("Valor Presente");
        optionalString.ifPresentOrElse(System.out::println, ()-> System.out.println("não está presente"));

        System.out.println("\nValor opcional que não está presente");
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, ()-> System.out.println("null = não está presente"));

        System.out.println("\nValor opcional que não está presente");
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(System.out::println, ()-> System.out.println("empty = não está presente"));

        /*System.out.println("\nValor opcional que lança erro NullPointException");
         *Optional<String> optionalNullErro = Optional.of(null);
         *optionalNullErro.ifPresentOrElse(System.out::println, ()-> System.out.println("erro = não está presente"));
        */

        System.out.println("****Valor inteiro opcional****");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("****Valor double opcional****");
        OptionalDouble.of(55.3).ifPresent(System.out::println);

        System.out.println("****Valor longo opcional****");
        OptionalLong.of(33L).ifPresent(System.out::println);

        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println,
                ()-> System.out.println("Valor não está presente"));

        if(optionalString.isPresent()){
            String valor = optionalString.get();

            System.out.println(valor);
        }

        optionalString.map((valor)-> valor.concat("*****")).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new);
    }

}
