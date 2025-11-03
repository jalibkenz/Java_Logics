import java.util.Arrays;

public class Merge2ArrayAndSort {
    public static void main(String[] args) {

        int[] arr1 = {5,4,3,2,1};
        int[] arr2 = {200,100,300,400,500};


        int[] temp= new int[arr1.length+arr2.length];
        
        int index=0;
        for (int i=0; i<arr1.length; i++) {
            temp[i]=arr1[i];
            index=i;
        }

        index++;
        
        for (int i=0; i<arr1.length; i++) {
            temp[index+i]=arr2[i];
        }

        Arrays.sort(temp);

        System.out.println(Arrays.toString(temp));
        
    }
}
