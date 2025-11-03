

import java.util.Set;
import java.util.TreeSet;

class One3 {
	 public static void main(String[] args) {
	     String str = "hi hi hello hi hello bye bye";
	     String[] arr = str.split(" ");
	     Set<String> s = new TreeSet<String>();
	     for (int i = 0; i < arr.length; i++) {
	         s.add(arr[i]);
	     }
	     for (String a : s) {
	         System.out.println(a);
	     }
	 }
	}