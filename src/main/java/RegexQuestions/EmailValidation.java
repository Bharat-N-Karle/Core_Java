package RegexQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    void emailValidation() {
        String[] emails = {
                "karlebharat@gmail.com",
                "karlebharat",
                "bharat@gmail",
                "india@@gmail.com"
        };
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }
    }
    public static void main(String[] args) {
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.emailValidation();
    }
}
