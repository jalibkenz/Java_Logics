import java.util.LinkedHashMap;
import java.util.Map;

class FrequencyOfWords {
    public static void main(String[] args) {
        String str="hi hi how are are are you";
        String[] str_arr=str.split(" ");
        Map<String,Integer> str_lhm =new LinkedHashMap<String,Integer>();
        for (String x:str_arr){
            str_lhm.put(x, str_lhm.getOrDefault(x,0)+1);
        }

        str_lhm.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });

    }
}
