/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {
    private final static int MAX_NUMBER = 100;

    public static int sumOfNaturalSquares(){
        int valueHolder = 0;
        for(int x = 1; x <= MAX_NUMBER; x++){
            valueHolder += x * x;
        }
        return valueHolder;
    }
    public static int squareOfNaturalSums(){
        int valueHolder = 0;
        for(int x = 1; x <= MAX_NUMBER; x++){
            valueHolder += x;
        }
        valueHolder *= valueHolder;
        return valueHolder;
    }
    public static int sumSquareDifference(){
        return (squareOfNaturalSums() - sumOfNaturalSquares());
    }
    public static void main(String[] args){
        System.out.println(sumOfNaturalSquares());
        System.out.println(squareOfNaturalSums());
        System.out.println(sumSquareDifference());
    }

}


