// //Remove Duplicates in a String
// import java.util.LinkedHashSet;
// public class Logics1 {
//     public static void main(String[] args) {
//         String str = "aaabbbbccccdddde";
//         char[] ca = str.toCharArray();
//         String rev = "";
//         LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
//         for (char x : ca) {
//             lhs.add(x);
//         }
//         for (Character c : lhs) {
//             rev += c;
//         }
//         System.out.println(rev);
//     }
// }





// remove duplicate words in a sentence
// import java.util.LinkedHashSet;
// class Logics1 {
//     public static void main(String[] args) {
//         String str = "Hello how how are you";
//         String cleanStr = "";
//         String[] strArray = str.split(" ");
//         LinkedHashSet<String> lhs = new LinkedHashSet<String>();
//         for (String x : strArray) {
//             lhs.add(x);
//         }
//         for (String x : lhs) {
//             if (cleanStr.isEmpty()) {
//                 cleanStr += x;
//             } else
//                 cleanStr += " " + x;
//         }
//         System.out.println(cleanStr);
//     }
// }



// remove duplicate values in given array ,values number

// wap to check whether given string is panagram or not



// anagram
import java.util.Arrays;
public class Logics1 {

    public static void main(String[] args) {
        String str1="race";
        String str2="care";

        char[] str1A= str1.toCharArray();
        char[] str2A= str2.toCharArray();

        if (str1.length()==str2.length()) {

            Arrays.sort(str1A);
            Arrays.sort(str2A);

            if (Arrays.equals(str1A,str2A)){
                System.out.println("same same so ANAGRAM");
            }
            else System.out.println("Not anagram");
            
        }
        else System.out.println("Not anagram");
    }
}
