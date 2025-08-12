package Lab_2;

public class FindSquareAndCubes {
    public static void main(String[] args){
        System.out.println("The Cube and Square from 1 to 10 are: ");
        for(int i=1;i<=10;i++){
            long square = i*i;
            long cube = square *i;
            System.out.println("Cube of " + i + " is " + cube + " And " + " Square of " + i + " is " + square );
        }
    }

}
