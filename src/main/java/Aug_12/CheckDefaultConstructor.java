package Aug_12;

public class CheckDefaultConstructor {
    String Name;
    int Age;

    /*    int age=10;
        String Name="Bharat";*/
    /*
    defaultConstructor(){
        age=0;
        Name=null;
    }
    *  */
    CheckDefaultConstructor(String Name, int Age) {
        this.Name=Name;
        this.Age=Age;
    }
    public static void main(String[] args) {
        CheckDefaultConstructor c = new CheckDefaultConstructor("Bharat", 23);

    }
}
