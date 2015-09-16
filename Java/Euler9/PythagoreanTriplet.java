/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class PythagoreanTriplet {
    private static void generateTriple(){
        int aSquare;
        int bSquare;
        int c;
        int cSquare;
        for(int a = 1; a<1000; a++){
            for(int b = 1; b < 1000; b++){
                aSquare = a * a;
                bSquare = b * b;
                cSquare = aSquare + bSquare;
                //checks that number is whole
                if(Math.sqrt(cSquare) % 1 == 0) {
                    c = (int)Math.sqrt(cSquare);
                    if(a + b + c == 1000){
                        System.out.println(a*b*c);
                        System.out.println(a+b+c);
                        System.out.println(a + " " + b + " " + c);
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        generateTriple();
    }
}
