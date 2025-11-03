import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str="Hello and  welcome!";
        System.out.println(str);
        String[] strArr=str.split("\\s+");
        System.out.println(String.join(" ",strArr));

        String s1="aA";
        String s2="aAA";

        System.out.println(s1.compareTo(s2));

    }


}