package Oct_31_2025;

public class RemoveSpclChar {

    public static void main(String[] args) {
        String s=" He is a very very nice person, isn't it? ";//There is space at start and end
        s=s.trim();
        String[] sArr=s.split("[^a-zA-Z]+");
        System.out.println("->"+s.toUpperCase().charAt(3));
        System.out.println(sArr.length);
        for(String x:sArr){
            System.out.println(x);
        }
    }
}
