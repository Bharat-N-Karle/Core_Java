package string;

public class StringMethods {
    public static void main(String[] args) {
        String str = "BHARAT";
        String str2= str.concat(" Karle");
        System.out.println(str);
        System.out.println(str2);
        String[] str3=str2.split(" ");
        for(String s:str3){
            System.out.println(s);
        }
        String str4=str.replace('B', 'b');
        System.out.println(str4);
        String str5=str.toLowerCase();
        System.out.println(str5);
    }
}
