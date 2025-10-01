import java.util.Scanner;

public class ReverseUserInput {

    public static void main(String[] args) {
        String uis="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        uis = s.nextLine();

        ReverseString(uis);
        s.close();
        
    }



    static void ReverseString(String x){
        String rev="";
        for(int i=x.length()-1;i>=0;i--){
            rev=rev+x.charAt(i);
        }
        System.out.println(rev);
    }
    
}
