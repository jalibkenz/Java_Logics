//WAP to check whether the given string is palindrome or not using charAt()

class PalindromeCharAt{
    public static void main(String[] args) {
        String str="malayalam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}