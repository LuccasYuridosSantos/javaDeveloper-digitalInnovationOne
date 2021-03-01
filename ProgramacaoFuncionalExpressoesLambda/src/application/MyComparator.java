package application;

import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare (Product pro1, Product pro2) {
        return pro1.getName().toUpperCase().compareTo(pro2.getName().toUpperCase()) ;
    }
}
