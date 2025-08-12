package Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*Create a Product class with name and price. Implement Comparable so that products are sorted by price (ascending), and if prices are equal, sort by name (alphabetically).
Focus: Multi-level comparison.*/
public class Product implements Comparable<Product> {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(Product o) {
        int pricecompare = Double.compare(this.price, o.price);
        if (pricecompare == 0) {
            return this.name.compareTo(o.name);
        }
        return  pricecompare;
    }

    @Override
    public String toString() {

        return name + " " + price;
    }

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product("Taxi", 65000));
        list.add(new Product("Bike", 45000));
        list.add(new Product("Car", 55000));
        System.out.println("Before Sorting" + list);
        Collections.sort(list);
        System.out.println("After Sorting" + list);
    }
}
