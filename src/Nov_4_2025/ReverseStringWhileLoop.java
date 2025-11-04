package Nov_4_2025;

import java.util.Scanner;

public class ReverseStringWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse a String - using WHILE loop");

        String str=sc.nextLine();//input java
        char[] strArr=str.toCharArray();
        char temp;
        int indexFromRight=str.length()-1;
        int indexFromLeft=0;
        while(indexFromLeft<indexFromRight){
            //swapping from left to right
            temp=strArr[indexFromLeft];
            strArr[indexFromLeft]=strArr[indexFromRight];
            strArr[indexFromRight]=temp;
            indexFromRight--;
            indexFromLeft++;
        }
        System.out.println(String.valueOf(strArr));
    }
}
