package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Get Even Numbers from a List
*/
public class Question1 {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      list.add(7);
      list.add(8);
      list.add(9);
      list.add(10);
      List<Integer> list2 = list.stream()
              .filter(x ->x%2 ==0)
              .collect(Collectors.toList());
        System.out.println(list2);
    }
}
