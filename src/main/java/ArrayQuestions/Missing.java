package ArrayQuestions;

public class Missing {
    int missing(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        int n = a.length + 1;
        int expsum = n*(n + 1) / 2;
        int number = expsum - sum;
        return number;
    }

    public static void main(String[] args) {
        Missing obj = new Missing();
        int[] a = {1, 2, 3, 4, 6, 5, 8, 7, 10};
        System.out.println(obj.missing(a));

    }
}
