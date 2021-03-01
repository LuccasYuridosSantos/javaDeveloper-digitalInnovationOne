package entities;

public class Product /*implements Comparable<Product>*/{

    private String name;
    private Double price;

    public Product () {
    }

    public Product (String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Double getPrice () {
        return price;
    }

    public void setPrice (Double price) {
        this.price = price;
    }

    /* public boolean nonStaticProductPredicate(){ return price >=100.00; }*/

    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice()*1.1);
    }

    public void nonStaticPriceUpdate(){
        this.price = price * 1.1;
    }

    @Override
    public String toString () {
        return name +
                ", "+
                String.format("%.2f",price);
    }




   /* Retirado o Comparable
   @Override
    public int compareTo (Product o) {
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }*/
}
