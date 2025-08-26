package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F");
        List<String> list1 = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
