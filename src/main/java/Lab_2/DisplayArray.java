package Lab_2;

public class DisplayArray {
    public static void main(String[] args){
        int [][]x={{10,20,30},{40,50,60}};
        int size1=x[0].length;
        int size2=x.length;
        for(int i=0;i<size2;i++){
            for(int j=0;j<size1;j++){
                System.out.println("Elements of Array are: " + x[i][j]);
            }

        }
    }

}
