package ArrayQuestions;

public class SumArray {
    int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        SumArray suma = new SumArray();
        int[] a = {5,4,2,7};
        int result = suma.sumArray(a);
        System.out.println("Sum is : " + result);
    }

}
