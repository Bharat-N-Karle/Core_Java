package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Remove duplicate elements from a list of integers.
*/
public class Question10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 3, 2, 5);
        List<Integer> list1 = list.stream()
                            .distinct()
                            .collect(Collectors.toList());
        System.out.println(list1);
    }
}
