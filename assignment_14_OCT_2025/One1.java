

import java.util.Set;
import java.util.TreeSet;

public class One1 {
 public static void main(String[] args) {
     String str = "abbedeefgghijk";
     Set<Character> s = new TreeSet<Character>();
     for (int i = 0; i < str.length(); i++) {
         s.add(str.charAt(i));
     }
     System.out.println(s);
 }
}




