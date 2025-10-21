

public class Four2 {

	public static void main(String[] args) {
    String str="acb code ffghh nike";
    str=str.replace(" ", "").toLowerCase();
   for (int i=0; i< str.length()-1; i++) {
    if (str.charAt(i) == str.charAt(i+1)) {
    	System.out.print(str.charAt(i));
    }
}
System.out.println(str.charAt(str.length()-1));
}
}
