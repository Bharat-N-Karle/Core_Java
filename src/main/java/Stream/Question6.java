package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Sort numbers in ascending order
*/
public class Question6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 11, 21, 6, 53, 8, 9, 10);
        List<Integer> list1 = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list1);

    }
}
