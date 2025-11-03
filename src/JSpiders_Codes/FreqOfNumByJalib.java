import java.util.Map;
import java.util.TreeMap;

public class FreqOfNumByJalib {
    public static void main(String[] args) {
        System.out.println("Frequency of Characters in a String");
        String text="12233344445555567890";

        char[] textCA=text.toCharArray();

        Map<Character,Integer> textTM=new TreeMap<Character,Integer>();
        for(Character x:textCA){
            textTM.put(x,textTM.getOrDefault(x,0)+1);
        }

        System.out.println("\n\nFrequency of characters");
        textTM.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });
        System.out.println("\n\nUnique characters");
        textTM.forEach((k,v)->{
            if (v==1) {
                System.out.println(k+"->"+v);
            }
            
        });

        
        freqOfMultiDigitNumbers("1 2 -2 3 3 3 4 4 4 4 5 5 5 5 5 6 7 8 9 0");
        

    }


    static void freqOfMultiDigitNumbers(String s){
        String[] sSA=s.split(" ");
        Map<String,Integer> sTM=new TreeMap<String,Integer>();
        for (String x : sSA) {
            sTM.put(x,sTM.getOrDefault(x,0)+1);
        }

        System.out.println("\n\n\nFrequency of words");
        sTM.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });

        System.out.println("\n\nUnique words");
        sTM.forEach((k,v)->{
            if(v==1){
                System.out.println(k+"->"+v);
            }
        });
    }
}
