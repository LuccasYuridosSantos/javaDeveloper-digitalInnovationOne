package applicationList;

import java.util.List;
import java.util.Vector;

public class ApplicationVector {
    public static void main(String[] args) {
        List<String> sports = new Vector<>();

        //adiconando elementos
        sports.add("Basket");
        sports.add("Volei");
        sports.add("Futsal");
        sports.add("Atletismo");
        sports.add("Rugby");
        System.out.println(sports);

        //alterando o valor
        sports.set(0,"Volei de Praia");
        System.out.println(sports);

        // Remove um elemento por index ou por especificação de elemento
        sports.remove(3);
        System.out.println(sports);

        sports.remove("Rugby");
        System.out.println(sports);

        // retorna o elemento de acordo com index especificado
        System.out.println(sports.get(0));

        //laço de repetição dinamico para lista (foreach)
        for (String sport: sports) {
            System.out.println(sport);
        }

        //retorna o tamanho
        System.out.println(sports.size());

    }
}
