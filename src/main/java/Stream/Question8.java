package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Convert a list of strings into uppercase.
*/
public class Question8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> list1 = list.stream()
                            .map(String::toUpperCase)
                            .collect(Collectors.toList());
        System.out.println(list1);
    }
}
