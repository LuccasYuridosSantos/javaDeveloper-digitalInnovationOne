package application;

import entities.Product;

import java.util.*;

public class Program {
    public static void main (String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Table", 500.00));
        list.add(new Product("Computer", 5000.00));
        list.add(new Product("SmartPhone", 2000.00));

        // nesta forma usamos a classe MyComparator
        //list.sort(new MyComparator());
        /*
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare (Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ;
            }
        };*/


        /*
        Comparator<Product> comp =(p1 , p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ;
        };*/

        //Comparator<Product> comp =(p1 , p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }


    }
}
