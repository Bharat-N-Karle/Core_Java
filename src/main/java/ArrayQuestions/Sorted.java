package ArrayQuestions;

public class Sorted {
    public Boolean sorted(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Sorted sor = new Sorted();
        int[] a = {1, 2, 50, 45};
        Boolean val = sor.sorted(a);
        System.out.println(val);
    }
}

