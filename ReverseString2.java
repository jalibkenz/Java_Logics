//reverse a string WITHOUT using chatAt()

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "java"; 
        System.out.println("B4: " + str);

        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        System.out.println("After reverse: " + new String(ch));
    }
}