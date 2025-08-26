package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 11, 21, 6, 53, 8, 9, 10);
        List<Integer> list1 = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
