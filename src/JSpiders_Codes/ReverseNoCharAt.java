
/*
public class ReverseNoCharAt {

    public static void main(String[] args) {
        
        String str="JAVA";
       String rev="";

        System.out.println("Before: "+str);

        char[] ch=str.toCharArray();
       
        System.out.println(ch);
        int i=0;
        int j=ch.length-1;

        while(i<j){
            char temp=ch[i];//saving copy of first letter
            ch[i]=ch[j];//storing last letter to first letterplace
            ch[j]=temp;//storing copy reserved into the last letter place. hence swapping
            i++;j--;// i incremented and j decremented
        }
        System.out.println(ch);


    }
   
}

*/

// using for loop charAt
public class ReverseNoCharAt {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); 
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}


// without using charAt and without using 
// why ch is not using for loop