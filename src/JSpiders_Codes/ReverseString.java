class ReverseString{
    public static void main(String[] args) {
        String s="Java";
        String revS="";

        for (int i = s.length()-1; i >= 0; i--) {
            revS=revS+s.charAt(i);
            
        }
        System.out.println(revS);
    }
}