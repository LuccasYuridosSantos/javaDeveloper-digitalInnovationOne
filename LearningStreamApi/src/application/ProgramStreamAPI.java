package application;

import model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProgramStreamAPI {

    public  static void main(String[] args) {

        //Cria uma coleção de students
        List<String> students = new ArrayList<>();

        //adicionando students para coleção
        students.add("Pedro");
        students.add("Thayse");
        students.add("Marcelo");
        students.add("Carla");
        students.add("Juliana");
        students.add("Thiago");
        students.add("Rafael");

        //stream().count() retorna a contagem de elementos da coleção
        System.out.println("Contagem: " + students.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: "+students.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menot numero de letras
        System.out.println("Menor numero de letras: "+students.stream().min(Comparator.comparingInt(String::length)));

        //Retorna o elemento que tem a letra R no nome
        System.out.println("Com a letra r no nome: "+students.stream().filter((student)->
                student.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção com nomes concatenados a quantidade de letra de cada nome
        System.out.println("Coleção com a quantidade de letras: " + students.stream().map(student ->
                student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()));

        //Retorna apenas os 3 primeiros elementos da coleção
        System.out.println("Retonar os 3 primeiros: "+ students.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elemetos: "+ students.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console, sem retorna outra coleção
        students.stream().forEach(System.out::println);

        // Retorna true se todos elementos possuem a letra W no nome
        System.out.println("Todos elementos com a letra W: " + students.stream().allMatch((element)-> element.contains("w")) );

        // Retorna true se algum elemento possuem a letra a minúscula no nome
        System.out.println("Algum elemento possui a letra a: "+ students.stream().anyMatch((e) -> e.contains("a")));

        //Retorna true se nenhum elemento possui a letra a minúscula no nome
        System.out.println("Nenhum elemento possui a letra a: " + students.stream().noneMatch((element) -> element.contains("a")));
        
        //Retorna o primeiro elemento da  coleção, se existir exibe no console
        System.out.print("Retorna o primeiro elemento: ");
        students.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        System.out.print("Operação encadeada:  ");
        System.out.println(students.stream()
                .peek(System.out::println)
                .map(student -> student.concat(" - ")
                        .concat(String.valueOf(student.length())))
                .peek(System.out::println)
//                .filter((student)->
//                        student.toLowerCase().contains("r"))
//                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(student -> student.substring(student.indexOf("-")+1))));


    }


}
