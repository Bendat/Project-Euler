import java.math.BigInteger;
/**
 * What is the sum of the digits of the number 2^1000?
 */
public class PowerDigitSum {
    private static int sumComponents() {
        BigInteger base = new BigInteger("2");
        String result = base.pow(1000).toString();
        int sum = 0;
        for (int position = 0; position < result.length(); position++) {
            sum += result.charAt(position) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumComponents());
    }
}

