package Lambda;
@FunctionalInterface
interface Addition{
    int add(int a,int b);
}
public class Question1 {
    public static void main(String[] args) {
        Addition addi = (a,b)-> a+b;
        int result = addi.add(10,20);
        System.out.println("Addition using lambda Expression: " + result);

    }
}
