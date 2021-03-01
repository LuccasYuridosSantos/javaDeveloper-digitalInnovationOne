package application;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
       // treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna o primeiro elemento no topo da árvore
        System.out.println(treeCapitais.first());
        System.out.println("-------------------------------------------------------");

        //retorna o ultimo elemento no topo da árvore
        System.out.println(treeCapitais.last());
        System.out.println("-------------------------------------------------------");

        //retorna o primeiro elemento abaixo da árvore do elemento parametrizado
        System.out.println(treeCapitais.lower("Floranópolis"));
        System.out.println("-------------------------------------------------------");

        //retorna o primeiro elemento acima da árvore do elemento parametrizado
        System.out.println(treeCapitais.higher("Floranópolis"));
        System.out.println("-------------------------------------------------------");

        //Exibe todas as capitais
        System.out.println(treeCapitais);
        System.out.println("-------------------------------------------------------");

        //Retorna o primeiro elemento no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());
        System.out.println("-------------------------------------------------------");

        //Retorna o ultimo elemento no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());
        System.out.println("-------------------------------------------------------");

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();
        System.out.println("-------------------------------------------------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-------------------------------------------------------");
        for (String tree: treeCapitais) {
            System.out.println(tree);
        }



    }
}
