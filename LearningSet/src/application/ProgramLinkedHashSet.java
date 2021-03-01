package application;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramLinkedHashSet {
    public static void main(String[] args) {

        Set<Integer> sequenceNumber = new LinkedHashSet<>();

        sequenceNumber.add(1);
        sequenceNumber.add(2);
        sequenceNumber.add(4);
        sequenceNumber.add(18);
        sequenceNumber.add(16);

        System.out.println(sequenceNumber);
        System.out.println("------------------------------");

        sequenceNumber.remove(4);
        System.out.println(sequenceNumber);
        System.out.println("------------------------------");

        System.out.println(sequenceNumber.size());
        System.out.println("------------------------------");

        Iterator<Integer> iterator = sequenceNumber.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------");

        for (Integer number: sequenceNumber) {
            System.out.println(number);
        }
        System.out.println("------------------------------");

        System.out.println(sequenceNumber.isEmpty());





    }
}
