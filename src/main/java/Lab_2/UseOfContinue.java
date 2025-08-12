package Lab_2;

public class UseOfContinue {
    public static void main(String[] args){
        int [][]x={{10,20,30},{40,50,60}};
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                if(x[i][j] ==30){
                    continue;
                }
                System.out.println("Elements of Array are: " + x[i][j]);
            }
            System.out.println("");

        }
    }
}
