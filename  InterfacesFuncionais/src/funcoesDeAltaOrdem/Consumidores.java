package funcoesDeAltaOrdem;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {



        Consumer<String> imprimirFrase = System.out::println;
//        Consumer<String> imprimirFrase = frase -> System.out.println(frase);
        imprimirFrase.accept("Hello World!!");
    }
}
