//char string arrays
public class RemoveRepeatedLetter {

    public static void main(String[] args) {
        String str="hello hhi howw rr uu";
        str=str.replace(" ","" ).toLowerCase();
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!=ch[i+1]){
                System.out.println(ch[i]+" ");
            }

        }
        System.out.println(ch[ch.length-1]);
    }
}