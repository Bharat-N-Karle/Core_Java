package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Filter even and odd numbers with lambda
Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.*/
interface EvenOdd {
    void evenOdd(List<Integer> numbers);
}
public class Question4 {
    public static void main(String[] args) {

        EvenOdd evod = (numbers) -> {
            for (Integer i : numbers) {
                if (i % 2 == 0) {
                    System.out.println("Even number is: " + i);
                }
                else{
                    System.out.println("Odd number is: " + i);
                }
            }
        };
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        evod.evenOdd(numbers);
    }
}
