package Lab_2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("a is Even");
        }
        else{
            System.out.println("a is Odd");
        }
    }

}
