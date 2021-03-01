package funcoesDeAltaOrdem;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] names ={"Luccas", "Paulo", "Oliveiera", "Santos", "Java"};
        Integer[] numbers = {1,2,3,4,5,6};
        imprimirNomesFiltrados(names);

        imprimirTodos(names);
        imprimirDouble(numbers);
    }


    public static void imprimirNomesFiltrados(String[] names){
        String nomesParaImprimir = "";
        for (int i = 0; i < names.length; i++){
            if (names[i].equals("Luccas")){
                nomesParaImprimir += " "+names[i];
            }
        }
        System.out.println(nomesParaImprimir);

       String namesStream = Stream.of(names).filter(name -> name.equals("Santos"))
                .collect(Collectors.joining());

        System.out.println(namesStream);
    }

    public static  void imprimirTodos(String[] nomes){
//        for (String nome: nomes) {
//            System.out.println(nome);
//        }

//        Stream.of(nomes)
//                .forEach(nome -> System.out.println(nome));

        Stream.of(nomes)
                .forEach(System.out::println);
    }

    public static  void imprimirDouble(Integer[] numbers){
//        for (Integer number: numbers) {
//            System.out.println(number*2);
//        }

//        Stream.of(numbers)
//                .forEach(number -> System.out.println(number*2));

        Stream.of(numbers).map(number -> number*2)
                .forEach(System.out::println);

    }

}
