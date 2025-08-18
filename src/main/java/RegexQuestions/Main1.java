package RegexQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        //1st way to write the regex
        Pattern p = Pattern.compile("s."); // . dot represents a single character
        Matcher m = p.matcher("sb");
        boolean b = m.matches();
        System.out.println(b);

        //2nd way to write a regex
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        //3d way to write a regex
        boolean b3  = Pattern.matches(".s", "as");
        System.out.println(b3);
    }
}
