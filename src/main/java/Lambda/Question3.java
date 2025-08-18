package Lambda;
interface CaseChangeOfAlphabets {
    String lowerCase(String s);
}
public class Question3 {
    public static void main(String[] args) {
        CaseChangeOfAlphabets csoA = (str) -> str.toLowerCase();
        String str = csoA.lowerCase("BHARAT");
        System.out.println("The Lowercase String is:  " + str);
    }
}
