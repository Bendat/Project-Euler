package ProjectEulerOne;

public class SumOfThreeFive {
    public static void main(String[] args) {
        System.out.println(bruteForce());
        System.out.println("------------------------");
        System.out.println(getSum());
    }

    public static int getSum() {
        return makeSeries(3, 999) + makeSeries(5, 999) - makeSeries(15, 999);
    }

    public static int makeSeries(int n, int p) {
        return n * (p / n) * ((p / n) + 1) / 2;
    }

    public static int bruteForce() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}