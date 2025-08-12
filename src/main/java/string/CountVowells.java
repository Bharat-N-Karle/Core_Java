package string;

public class CountVowells {
    public static void main(String[] args) {
        String s = "bbbb";
        int VowellCount = 0;
        int ConsonantCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                VowellCount++;
            } else if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                ConsonantCount++;
            }
        }
        System.out.println(VowellCount);
        System.out.println(ConsonantCount);
    }
}
