import java.util.ArrayList;

/**
 *A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Palindrome{
    public static void main(String[] args){
        long startTime = System.nanoTime();

        System.out.print(makePalindrome());
        
        long endTime = System.nanoTime();
        double duration = (double)(endTime - startTime)/1000000;
        System.out.print("\nCompleted in " + duration + " milliseconds\n");

    }

    private static int makePalindrome(){
        int pal = 0;
        int result = 0;
        int firstNum = 0;
        int secondNum = 0;
        for(int i = 100; i < 1000; i++){
            for(int x = 100; x < 1000; x++){
                result = i*x;
                if(isPalindrome(result) == true){
                    if(result > pal){
                        pal = result;
                        firstNum = i;
                        secondNum = x;
                    }
                }
            }
        }
        System.out.print("The largest palindrome is made from " + firstNum +" x " +  secondNum + " and is: "); 
        return pal;
    }

    private static boolean isPalindrome(int x){
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while(x > 0){
            digits.add(x % 10);
            x /= 10;
        }
        int counter = 0;
        for(int i: digits){
            if(i != digits.get(((digits.size() - 1) - counter))){
                return false;
            }
            counter++;
        }
        return true;
    }
}
