class PrimeFactors{
    public final long PRIME = 600851475143L;

    private static long getLargestPrimeFactor(){
        long sum = PRIME; 
        long i = 2;

        while(i*i < sum){
            while( sum % i == 0){
                sum = sum / i;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args){
        PrimeFactors prime = new PrimeFactors();
        System.out.println(getLargestPrimeFactor());
    }
}
