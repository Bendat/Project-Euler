/**
 * What is the 10001st prime number?
 */
public class SelectPrime {
    private static boolean isPrime(int n) {
        boolean prime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    private static int generatePrimesTo(final int n){
        int x = 2;
        int counter = 0;
        while (counter != n){
            if(isPrime(x)){
                counter++;
                if(counter == n){
                    break;
                }
            }
            x++;
        }
        return x;
    }

    public static void main(String[] args){
       System.out.println(generatePrimesTo(10001));
    }
}
