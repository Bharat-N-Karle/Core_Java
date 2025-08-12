package ArrayQuestions;

public class Reverse {
    public int[] reverse(int[] a){
        for(int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        return a;

    }
    public static void main(String[] args) {
        Reverse rev = new Reverse();
        int[] a = {1, 3, 5, 4};
        int[] result = rev.reverse(a);
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
