package applicationList;

import java.util.*;

public class ApplicationList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Luccas");
        nomes.add("José");
        nomes.add("Antônio");
        nomes.add("MArcio");
        nomes.add("Lucia");
        nomes.add("Mabile");

        System.out.println(nomes);

        //faz ordenação dos nomes
        Collections.sort(nomes);

        System.out.println(nomes);

        //método de alteração informamos o index e qual valor será atribuido
        nomes.set(1, "Juliana");

        System.out.println(nomes);

        //remoção de elemento por index
        nomes.remove(4);

        System.out.println(nomes);

        //irá fazer a remoção se o elemento passado for igual algum existente
        nomes.remove("Lucia");
        System.out.println(nomes);


        //capturar valor pasando o index
        String nome = nomes.get(0);
        System.out.println(nome);

        //método para saber o tamanho da lista
        int tamanho = nomes.size();
        System.out.println(tamanho);


        //método para saber se determinado elemento existe na lista retornando um booleano
        boolean contains = nomes.contains("Luccas");
        System.out.println(contains);

        //método para saber se a lista está vazia
        boolean empty = nomes.isEmpty();
        System.out.println(empty);

        //método para limpar toda a lista
        //nomes.clear();
        //System.out.println(nomes);


        for(String nomeItem: nomes) {
            System.out.println(nomeItem);
        }

        //Coleção de interadores
        Iterator<String> iterator = nomes.iterator();;

        //com iterator e o método hasNext será retornado um true se ainda existir um elemento na lista
        while (iterator.hasNext()){
            //este método irá retornar o elemento que estiver na posição que se encontra o interador
            System.out.println("-->> " + iterator.next());
        }







    }
}
