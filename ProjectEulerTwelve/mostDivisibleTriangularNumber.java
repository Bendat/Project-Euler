/**
 * What is the value of the first triangle number to have over five hundred divisors?
 */
public class mostDivisibleTriangularNumber {
    private static int triangularNumber(){
        final int divisorNumber     = 500;
        boolean fiveHundredDivisors = false;
        for(int i = 0; !fiveHundredDivisors; i++) {
            int tNum = sumDecrements(i);
            int numOfDivisors = factorCounter(tNum);
            if(numOfDivisors >= divisorNumber){
                return tNum;
            }

        }
        return 0;
    }

    private static int sumDecrements(int n){
        if(n <=1){
            return 1;
        }
        return n + sumDecrements(n - 1);
    }

    private static int factorCounter(int n){
        int factorCount = 0;
        for(int i = 1; i*i <= n; i++) {
            if(n % i == 0){
                factorCount++;
            }
        }
        return factorCount*2;
    }

    public static void main(String[] args){
        System.out.println(triangularNumber());
    }
}
