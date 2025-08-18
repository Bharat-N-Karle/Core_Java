package Lambda;
/*Check if a string is empty using lambda
Write a Java program to implement a lambda expression to check if a given string is empty.*/
interface CheckString{
    boolean isEmpty(String str);
}
public class Question2 {
    public static void main(String[] args) {
        CheckString str = (str1) -> {
            return str1.isEmpty();
        };
        boolean isString = str.isEmpty("");
        System.out.println("Returns True if String is Empty else false: " + isString);
    }
}
