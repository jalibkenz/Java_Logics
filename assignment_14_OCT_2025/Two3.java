

import java.util.Map;
import java.util.TreeMap;

public class Two3 {

	    public static void main(String[] args) {
	        String str = "hi hello hi hi hello bye bye";
	        String[] arr = str.split(" ");
	        Map<String, Integer> m = new TreeMap<String, Integer>();
	        for(int i=0; i<arr.length; i++) {
	            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
	        }
	        m.forEach((k, v) -> System.out.println(k + "->" + v));
	    }
	}

