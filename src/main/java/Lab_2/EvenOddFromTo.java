package Lab_2;

import java.util.Scanner;
public class EvenOddFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println("The Number " + i + " is Even");
            } else {
                System.out.println("The Number " + i + " is Odd");
            }
        }
    }
}
