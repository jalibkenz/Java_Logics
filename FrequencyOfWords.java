import java.util.LinkedHashMap;
import java.util.Map;


class FrequencyOfWords {
    public static void main(String[] args) {
        String str="hi hi how are are are you";

        //cutting sentence to words 
        System.out.println("//cutting sentence to words");
        String[] str_arr=str.split(" ");
        Map<String,Integer> str_lhm =new LinkedHashMap<String,Integer>();
        for (String x:str_arr){
            str_lhm.put(x, str_lhm.getOrDefault(x,0)+1);
        }

        //frequency of words
        System.out.println("//frequency of words");
        str_lhm.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });

        //unique words
        System.out.println("Unique words");
        str_lhm.forEach((k,v)->{
            if(v==1){
                System.out.println(k+"->"+v);
            }
        });

        //cutting sentence to chars
        System.out.println("//cutting sentence to chars");
        char[] str_char=str.toCharArray();
        Map<Character,Integer> char_lhm =new LinkedHashMap<Character,Integer>();
        for (Character x:str_char){
            char_lhm.put(x,char_lhm.getOrDefault(x,0)+1);
        }
        for (int i=0; i<=str.length()-1;i++){
            
        }
        
        //frequency of char
        System.out.println("//frequency of char");
        char_lhm.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });
        //unique char
        System.out.println("//unique char");
        char_lhm.forEach((k,v)->{
            if(v==1){
                System.out.println(k+"->"+v);
            }
        });
    }
}
