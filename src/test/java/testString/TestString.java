package testString;

public class TestString {
    public static void main(String[] args) {
        String a = "abc";
        String b =  new String ("abc");
        System.out.println(a==b);//false
        System.out.println(a.equals(b));//true

        String c = new String();
        c = "abc";
        System.out.println(c ==b);//false
    }
}
