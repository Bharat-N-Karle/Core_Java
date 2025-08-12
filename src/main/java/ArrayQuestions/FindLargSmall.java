package ArrayQuestions;

public class FindLargSmall {
    int largest(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    int smallest(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;

    }
    public static void main(String[] args){
        FindLargSmall find = new FindLargSmall();
        int[] a = {1,5,4,6,8,2};
        int result1 = find.largest(a);
        System.out.println("Largest Number is : " + result1);
        int result2 = find.smallest(a);
        System.out.println("Smallest Number is : " + result2);
	}

}
