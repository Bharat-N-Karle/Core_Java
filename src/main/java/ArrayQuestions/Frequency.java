package ArrayQuestions;

public class Frequency {

    void frequency(int[] a){
        boolean[] visited = new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if (visited[i]) continue;
            int freq=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    freq++;
                    visited[j] = true;

                }
            }
            System.out.println("Frequency of " + a[i] +" => " + freq);
        }

    }
    public static void main(String[] args){
        Frequency f = new Frequency();
        int[] a = {1,1,1,1,2,5,3,5,5,5};
        f.frequency(a);
    }
}
