package Lambda;

import java.util.Arrays;

/*Sort strings alphabetically using lambda
Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.*/
interface SortString{
    String sortString(String str);
}
public class Question5 {
    public static String sort(String input){
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static void main(String[] args) {
        SortString sorts = (String input) ->sort(input);
                String word1 = "Bharatkarle";
        System.out.println(sorts.sortString(word1));
    }
}
