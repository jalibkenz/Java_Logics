

public class PrimeGenerator {


    public static void main(String[] args) {
        int till=50;

        for (int i=1; i<=till;i++){
            boolean prime=true;
            for(int j = 2; j<= Math.sqrt(i); j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime) {
                System.out.println(i);
            }
        }
    }
}
