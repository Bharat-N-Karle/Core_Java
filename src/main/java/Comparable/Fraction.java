package Comparable;
/*Create a Fraction class with numerator and denominator. Sort fractions by their decimal value.
Focus: Mathematical logic inside compareTo().*/

import java.util.ArrayList;
import java.util.Collections;

public class Fraction implements Comparable<Fraction> {
    private float numerator;
    private float denominator;
    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    float fraction = numerator / denominator;
    @Override
    public int compareTo(Fraction o) {
        return Float.compare(this.fraction, o.fraction);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                ", fraction=" + fraction +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Fraction> fractions = new ArrayList<Fraction>();
        fractions.add(new Fraction(1,2));
        fractions.add(new Fraction(3,4));
        fractions.add(new Fraction(5,6));
        System.out.println("Before Sorting" + fractions);
        Collections.sort(fractions);
        System.out.println("After Sorting" + fractions);
    }
}
