package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Find the sum of all numbers in a list.
*/
public class Question13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long sum = list.stream()
                    .mapToLong(x->x)
                    .sum();
        System.out.println(sum);
    }
}
