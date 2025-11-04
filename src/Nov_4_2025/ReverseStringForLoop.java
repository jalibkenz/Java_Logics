package Nov_4_2025;

import java.util.Scanner;

public class ReverseStringForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse a String - using FOR loop");

        String str=sc.nextLine();//input java
        char[] strArr=str.toCharArray();
        char temp;
        int indexFromRight=str.length()-1;
        for (int i = 0; i < indexFromRight; i++) {
            //swapping from left to right
            temp=strArr[i];
            strArr[i]=strArr[indexFromRight];
            strArr[indexFromRight]=temp;
            indexFromRight--;

        }
        System.out.println(String.valueOf(strArr));
    }
}
