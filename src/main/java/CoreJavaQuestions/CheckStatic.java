package CoreJavaQuestions;

public class CheckStatic {
    static int var = 10;
    void run(){
        System.out.println(var);
    }
    public static void main(String[] args) {
        int var = 15;
        CheckStatic checkStatic = new CheckStatic();

        System.out.println(var);
        checkStatic.run();
    }
}
