public class FetchAjacentElementsThatAddsUpToAValue {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 2, 4, 5, 1, 0, 9, 3, 6 };
        int sumVal = 9;
        for (int i = 0; i <= arr.length - 2; i++) {

            if (arr[i] + arr[i + 1] == sumVal) {
                System.out.println("Found->" + arr[i] + " and " + arr[i + 1] + " that sums to " + sumVal);
            }

        }
    }
}
