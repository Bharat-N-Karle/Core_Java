package string;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check: ");
        String s = sc.nextLine();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println("not a palindrome");
            }
        }
        System.out.println("Palindrome String");
    }
}
