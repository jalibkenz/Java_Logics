


public class Four1 {
	public static void main(String[] args){
        String str = "aabdefgshijjklrem";
        for(int i=0; i< str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
            	System.out.println (str.charAt(i));
            }
        }
        System.out.println(str.charAt(str.length()-1));
    }
}