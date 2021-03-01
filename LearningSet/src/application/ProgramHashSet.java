package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProgramHashSet {
    public static void main(String[] args) {

        HashSet<Double> studantGrade = new HashSet<>();
        HashSet<Integer> numbers = new HashSet<>();
        studantGrade.add(5.8);
        studantGrade.add(6.3);
        studantGrade.add(4.8);
        studantGrade.add(9.8);
        studantGrade.add(8.8);
        studantGrade.add(7.8);
        studantGrade.add(5.5);

        System.out.println(studantGrade);

        //remove o elemento desejado do set
        studantGrade.remove(5.5);

        System.out.println("------------------------------\n"+studantGrade);

        System.out.println("------------------------------\n"+studantGrade.size());

        Iterator<Double> iterator = studantGrade.iterator();
        System.out.println("------------------------------\n");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------\n");
        for (Double note : studantGrade){
            System.out.println(note);
        }

        studantGrade.clear();
        boolean isEmpty =studantGrade.isEmpty();

        System.out.println(isEmpty);

        numbers.add(4);
        numbers.add(2);
        numbers.add(23);
        numbers.add(14);
        numbers.add(55);





    }
}
