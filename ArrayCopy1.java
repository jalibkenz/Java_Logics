import java.util.Arrays;

public class ArrayCopy1 {
    public static void main(String[] prajwal) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={11,22,33,44,55};

        int[] temp= new int[arr1.length+arr2.length];

        System.arraycopy(arr1, 0, temp, 0, arr1.length);
        System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
        System.out.println(Arrays.toString(temp));
    }
}