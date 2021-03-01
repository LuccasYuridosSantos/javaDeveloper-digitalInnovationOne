package funcoesDeAltaOrdem;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
//        Predicate<String> isEmpty = value -> value.isEmpty();
//        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isEmpty = value -> {
            return value.isEmpty();
        };

        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("Luccas"));
    }
}
