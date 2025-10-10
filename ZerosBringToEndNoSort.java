import java.util.Arrays;

public class ZerosBringToEndNoSort {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 8, 0, 3, 0, 0, 4, 5, 2 };
        int[] arrNZ = new int[arr.length];
        int[] arrZ = new int[arr.length];
        int indexNZ=0;
        int indexZ=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]!=0){
                    arrNZ[indexNZ++]=arr[i];
            }
            else{
                arrZ[indexZ++]=arr[i];
            }
        }

        System.out.println("indexNZ->"+indexNZ);
        System.out.println("indexZ->"+indexZ);
        System.arraycopy(arrZ, 0, arrNZ, indexNZ-1+1, indexZ-1+1);//-1 as loop exists with ++
        System.out.print(Arrays.toString(arrNZ));
    }
}
