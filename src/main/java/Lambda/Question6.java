package Lambda;

import java.util.Arrays;
import java.util.List;

/*
Write a Java program to implement a lambda expression to find the average of a list of doubles.
*/
interface Average{
    double average(double s, int nu);
}
public class Question6 {
    public static void main(String[] args) {
        List<Double> nums = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        double sum = 0;
        int n = nums.size();
        for(double num : nums){
            sum += num;
        }
        Average av1 = (s , nu) -> s/nu;
        double result = av1.average(sum, n);
        System.out.println("Average using lambda Expression: " + result);
    }
}
