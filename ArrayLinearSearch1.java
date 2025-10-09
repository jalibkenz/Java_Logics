public class ArrayLinearSearch1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int searchItem=5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==searchItem) {
                System.out.println(searchItem+" found at index "+i);
                return;
            }
            
            
        }
        System.out.println("Search Item not Found in the Array");
    }
}