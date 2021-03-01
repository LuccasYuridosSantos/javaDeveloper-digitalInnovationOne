package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProgramacaoFuncionallECalculoLambda02 {



    public static void main (String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Table", 500.00));
        list.add(new Product("Computer", 5000.00));
        list.add(new Product("SmartPhone", 2000.00));


        list.sort(ProgramacaoFuncionallECalculoLambda02:: compareProducts);
        list.forEach(System.out::println);

    }

    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }


}
