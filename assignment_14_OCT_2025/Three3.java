

import java.util.Map;
import java.util.TreeMap;

public class Three3 {
	    public static void main(String[] args){
	        String str = "hi hello hi hello hi hi bye";
	        String[] arr=str.split(" ");
	        Map<String, Integer> m = new TreeMap<String, Integer>();
	        for(int i = 0; i< arr.length; i++){
	            m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
	        }
	        m.forEach((K,V)->{
	        if(V == 1){
	            System.out.println(K+"  "+V);
	        }
	    });
	}
}
