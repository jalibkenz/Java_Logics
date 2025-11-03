
import java.util.LinkedHashSet;
import java.util.Set;


class One2 {
	 public static void main(String[] args) {
	     String str = "ab bedee fghjke mmmnoo";
	     str = str.replace(" ", "").toLowerCase();
	     Set<Character> s = new LinkedHashSet<Character>();
	     for (int i = 0; i < str.length(); i++) {
	         s.add(str.charAt(i));
	     }
	     System.out.println(s);
	 }
	}