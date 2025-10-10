import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={11,22,33,44,55};
        int[] arr3={111,222,333,444,555};


        System.out.println(Arrays.toString(EasyCopyArray(EasyCopyArray(arr1,arr2),arr3)));
    }
    
    //Created Cascading Type Logic to copy Arrays
    public static int[] EasyCopyArray(int[] arrX1, int[] arrX2){
        int[] arrConcat = new int[arrX1.length+arrX2.length];
        System.arraycopy(arrX1, 0, arrConcat,0, arrX1.length);
        System.arraycopy(arrX2, 0, arrConcat,arrX1.length-1+1, arrX2.length);
        return arrConcat;
    }


}
//Write a program to merge three arrays into a single array