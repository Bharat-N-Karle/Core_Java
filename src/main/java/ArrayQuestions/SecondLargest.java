package ArrayQuestions;

public class SecondLargest {
    public int secondLargest(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length-2];
    }
    public static void main(String[] args){
        SecondLargest sec = new SecondLargest();
        int[] a = {5,7,6,2,8};
        int result = sec.secondLargest(a);
        System.out.println("Second Largest Element in the array is : " + result);

    }
}
