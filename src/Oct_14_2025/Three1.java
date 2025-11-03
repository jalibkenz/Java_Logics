

import java.util.Map;
import java.util.TreeMap;

public class Three1 {
    public static void main(String[] args) {
        String str = "abcdefghhhjjkk smn";
        Map<Character, Integer> m = new TreeMap<Character, Integer>();
        for(int i=0; i<str.length(); i++) {
            m.put(str.charAt(i), m.getOrDefault(str.charAt(i), 0) + 1);
        }
        m.forEach((k, v) -> {
            if (v == 1) {
                System.out.println(k + "->" + v);
            }
        });
    }
}