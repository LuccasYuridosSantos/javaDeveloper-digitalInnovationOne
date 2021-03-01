package funcoesDeAltaOrdem;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> returnNameInverse = text -> new StringBuilder(text).reverse().toString();
        System.out.println(returnNameInverse.apply("Luccas"));

        Function<String,Integer> convertStringParseInteger = string -> Integer.valueOf(string);
//        Function<String,Integer> convertStringParseInteger = string -> Integer::valueOf;//Método de referência
        System.out.println(convertStringParseInteger.apply("30"));


//        Function<String,Integer> convertStringCalDoubleValue;
//        convertStringCalDoubleValue = string -> Integer.parseInt(string) *2;
        Function<String,Integer> convertStringCalDoubleValue = string -> {
            return Integer.parseInt(string) * 2;
        };
        System.out.println(convertStringCalDoubleValue.apply("13"));
    }
}
