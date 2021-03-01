package application;

import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        //Queue <String> filaBanco2 = new LinkedList<>();

        filaBanco.add("Luccas");
        filaBanco.add("Antõnia");
        filaBanco.add("Alberto");
        filaBanco.add("Juliana");
        filaBanco.add("Cristina");
        filaBanco.add("Debora");

        System.out.println(filaBanco);

        //método poll retorna o primeiro elemento da fila e também remove o mesmo
        String clientAtendido = filaBanco.poll();

        System.out.println(clientAtendido);

        System.out.println(filaBanco);

        //método peek retorna apenas o primeiro elemento da fila
        String firstClient = filaBanco.peek();

        System.out.println(firstClient);

        //método  element retorna o primeiro elemento, se estiver vazio irá retornar uma Exception
        String primeiroClienteOuErro = filaBanco.element();

        //String firstClientOrError = filaBanco2.element();

        System.out.println(primeiroClienteOuErro);

        //System.out.println(firstClientOrError);

        for (String fileBank : filaBanco) {
            System.out.println("==> "+fileBank);
        }

        Iterator<String> iterator = filaBanco.iterator();

        while (iterator.hasNext()){
            System.out.println("--> " + iterator.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());
    }
}
