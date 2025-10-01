import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String uis="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        uis = s.nextLine();

        String reversedString="";
        reversedString=ReverseString(uis);
        checkPalindrome(uis,reversedString);
        s.close();
    }



    static String ReverseString(String x){
        String rev="";
        for(int i=x.length()-1;i>=0;i--){
            rev=rev+x.charAt(i);
        }
        System.out.println(rev);
        return rev;
    }

    static void checkPalindrome(String x1,String x2){
        if(x1.equalsIgnoreCase(x2)){
            System.out.println("Palindrome");
        }
        else{
        //     System.out.println("reverse string method with return type and palindrome");
                System.out.println("Not palindrome");
        }
    }
    
}
