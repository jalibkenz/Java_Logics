package Oct_31_2025;

public class CharDigitSeparator {


    public static void main(String[] args) {

        String str="abc2d4";

        String characters = str.replaceAll("[^a-z]","");
        System.out.println(characters);

        String digits = str.replaceAll("[^0-9]","");
        System.out.println(digits);
        str=str.concat("blabla");
        System.out.println(str);


    }
}
