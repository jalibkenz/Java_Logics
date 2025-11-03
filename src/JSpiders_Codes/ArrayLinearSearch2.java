public class ArrayLinearSearch2 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int searchItem = 5;
        linearSearch(arr, searchItem);

    }

    static void linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println(x + " found at index " + i);
                return;
            }

        }
        System.out.println("Search Item not Found in the Array");

    }
}