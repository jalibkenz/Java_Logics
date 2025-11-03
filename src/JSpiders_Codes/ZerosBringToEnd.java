import java.util.Arrays;

public class ZerosBringToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 0, 4, 5 };
        int[] b = new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            b[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(b));

    }
}
