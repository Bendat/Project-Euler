/**
 *2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {
    private static int divisbleByFullRange(){
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 20;
        int number = 0;
        boolean canBeDivided = true;
        while(canBeDivided){
            number++;
            for(int y = MIN_NUMBER; y <=  MAX_NUMBER; y++){
                if(number % y == 0){
                    if(y ==  MAX_NUMBER){
                        canBeDivided = false;
                    }
                }else{
                    break;
                }
            }

        }
        return number;
    }
    
    public static void main(String[] args){
        System.out.println(divisbleByFullRange());
    }
}
