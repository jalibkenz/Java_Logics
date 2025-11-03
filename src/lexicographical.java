import java.util.*;

public class lexicographical {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        //String[] arr=new String[16];
        int len=s.length();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<len-2;i++){
            String res="";
            for(int j=0;j<3;j++){
                res+=s.charAt(j);
            }
            list.add(res);
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println("First"+list.get(0));
        System.out.println("Last"+list.get(list.size()-1));
    }
}
