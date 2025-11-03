

public class Two1 {
  public static void main(String[] args) {
    String str = "aabbbccdeff";
    str = str.toLowerCase();
    int[] arr = new int[26];
    for(int i=0; i<str.length(); i++) {
      arr[str.charAt(i) - 97]++;
    }
    for(int i=0; i<arr.length; i++) {
      if(arr[i] != 0) {
        System.out.println((char)(97+i) + " " + arr[i]);
      }
    }
  }
}


