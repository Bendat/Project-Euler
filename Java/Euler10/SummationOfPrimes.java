/**
 * Find the sum of all the primes below two million.
 */
public class SummationOfPrimes {
    private static boolean isPrime(long n) {
        // fast even test.
        if(n == 2){
            return true;
        }else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    private static long sumPrimes(){
        final long NUMBER_CAP = 2000000;
        long result = 0;
        for(long i = 2; i < NUMBER_CAP; i++){
            if(isPrime(i)){
                result += i;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(sumPrimes());
    }
}
