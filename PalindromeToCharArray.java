//WAP to check whether the given string is palindrome or not WITHOUT using charAt()

class PalindromeToCharArray {
    public static void main(String[] args) {
        String str = "malayalam";   
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (ch[i] != ch[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}