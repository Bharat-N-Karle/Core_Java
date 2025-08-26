package Lambda;
/*
Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
*/
interface PrimeOrNot {
    void check(int n);
}
public class Question8 {
    public static void main(String[] args) {
        PrimeOrNot prim = (n)-> {
          for(int i=1;i<n;i++){
              if(n%i==0){
                  System.out.println("N is Not prime");
                  break;
              }
              else {
                  System.out.println("N is Prime");
                  break;
              }
          }
        };
        prim.check(2);
    }
}
