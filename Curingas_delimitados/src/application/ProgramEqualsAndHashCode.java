package application;

import entities.ClientHashCodeAndEquals;

public class ProgramEqualsAndHashCode {
    public static void main (String[] args) {

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println("----------------------------------*----------------");

        ClientHashCodeAndEquals c1 = new ClientHashCodeAndEquals("Maria", "Maria@.com");
        ClientHashCodeAndEquals c2 = new ClientHashCodeAndEquals("Maria", "Alex.@com");

        System.out.println(c1.equals(c2));
        System.out.println(c2.hashCode());
        System.out.println(c1.hashCode());


    }

}
