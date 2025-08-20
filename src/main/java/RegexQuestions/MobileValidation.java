package RegexQuestions;

public class MobileValidation {
    public static boolean validate(String str) {
        String regex = "^(\\+1\\s?)?(\\([2-9][0-9]{2}\\)|[2-9][0-9]{2})[-.\\s]?[2-9][0-9]{2}[-.\\s]?[0-9]{4}$";
        if(str.matches(regex)) {
            return true;
        }
        else {
            return false;
        }
        //or
        //return str.matches(regex);
    }
    public static void main(String[] args) {
        String varOcg = "123-456-7890";  // test input
        System.out.println(varOcg + " -> " + (validate(varOcg) ? "Valid" : "Invalid"));
    }
}
