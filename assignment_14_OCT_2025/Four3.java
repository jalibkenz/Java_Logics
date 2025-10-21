

public class Four3 {
	public static void main(String[] args) {
    String str = "hi hi hello hello bye bye bye";
    String[] arr = str.split(" ");
    for (int i=0; i<arr.length-1; i++) {
        if (!arr[i].equals(arr[i+1])) {
        	System.out.println(arr[i]);
        }
    }
    System.out.println(arr[arr.length-1]);
}
}

