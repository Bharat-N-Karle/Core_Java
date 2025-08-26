package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Strings Starting with "A"
*/
public class Question15 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Aanand", "Banana", "Cat");
        List<String> list1 = list.stream()
                    .filter(s->s.toLowerCase().startsWith("a"))
                    .collect(Collectors.toList());
        System.out.println(list1);
    }
}
