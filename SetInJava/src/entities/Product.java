package entities;

public class Product implements Comparable<Product>{

    private String name;
    private Double price;


    public Product(){
    }

    public Product(String name, Double price){
        this.name= name;
        this.price=price;
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

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (!getName().equals(product.getName())) return false;
        return getPrice().equals(product.getPrice());
    }

    @Override
    public int hashCode () {
        int result = getName().hashCode();
        result = 31 * result + getPrice().hashCode();
        return result;
    }

    @Override
    public int compareTo (Product other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }

    @Override
    public String toString () {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
