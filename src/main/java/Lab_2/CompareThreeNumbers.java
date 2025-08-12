package Lab_2;

import java.util.Scanner;
public class CompareThreeNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the Third number: ");
        int c = sc.nextInt();
        if(a>= b && a>=c){
            System.out.println("a is largest");
        }
        if(b >= a && b >= c){
            System.out.println("b is largest");
        }
        if(c >= a && c>= b){
            System.out.println("c is largest");
        }

    }


}
abstract class AbstractCjeck{
    protected abstract void run();
}
