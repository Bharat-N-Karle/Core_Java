package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Find the length of each string in a list of strings.
*/
public class Question11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bharat", "karle", "pune", "maharashtra");
        List<Integer> list1 = list.stream()
                            .map(String::length)
                            .collect(Collectors.toList());
        System.out.println(list1);
    }
}
