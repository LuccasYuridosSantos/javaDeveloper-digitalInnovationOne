package application;

import java.util.LinkedList;
import java.util.Queue;

public class TrainerQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Juliana");
        queue.add("Pedro");
        queue.add("Carlos");
        queue.add("Larissa");
        queue.add("João");

        queue.forEach(System.out::println);

        //String firstElement = queue.peek();
        System.out.println("------------------\n"+queue.peek());

        String firstRemove = queue.poll();
        //queue.forEach(System.out::println);
        System.out.println("------------------\n"+firstRemove);

        queue.add("Daniel");
        System.out.println("------------------\n"+queue);

        System.out.println("------------------\n"+queue.size());
        System.out.println("------------------\n"+queue.isEmpty());
        System.out.println("------------------\n"+queue.contains("Carlos"));


    }
}
