/**
 * Which starting number, under one million, produces the longest [Collatz] chain?
 */
public class LongestCollatzSequence {
    /**
     * Calculates the Collatz Sequence of a given number.
     * @param startNumber - the first number in the Collatz sequence.
     * @param recursionCount - a counter to find the number of recursions - set to 0
     * @return count - the number of recursions that have occurred. -1 indicates an error
     */
    public static long calculateCollatzSequence(long startNumber, long recursionCount){
        if(startNumber <= 0){
            return -1;
        }
        recursionCount++;
        if(startNumber == 1){
            return recursionCount;
        }else if(startNumber % 2 == 0){
            return calculateCollatzSequence(startNumber / 2, recursionCount);
        }else{
            return calculateCollatzSequence((3 * startNumber) + 1, recursionCount);
        }
    }

    private static String findLargestChain(){
        final long MAX_NUMBER = 1000000;
        long largestChainStartNumber = 0;
        long currentChainSize = 0;
        for(long startNumber = 2; startNumber <= MAX_NUMBER; startNumber++){
            long chainSize = calculateCollatzSequence(startNumber, 0);
            if(chainSize > currentChainSize){
                largestChainStartNumber = startNumber;
                currentChainSize = chainSize;
            }

        }
        return largestChainStartNumber + "";
    }

    public static void main(String[] args){
        System.out.println(findLargestChain());
    }
}
