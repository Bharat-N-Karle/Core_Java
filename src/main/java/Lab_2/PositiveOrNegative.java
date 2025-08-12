package Lab_2;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("a is Positive");
        }
        else if(a<0){
            System.out.println("a is negative");
        }
        else{
            System.out.println("a is Zero");
        }

    }

}
