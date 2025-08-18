package Lab_3;

class FirstProgram{
    // Private variable named age
    private int age = 23;
    // Private Method
    private void getAge(){
        System.out.println("The age is from private member: " + age);
    }
    public void accessPrivateMembers(){
        System.out.println("The age is : " + age);
        getAge();
    }

}
public class Main {
    public static void main(String[] args) {
        FirstProgram firstProgram = new FirstProgram();
        firstProgram.accessPrivateMembers();
    }
}
