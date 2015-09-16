class Fibonacci{

	public static int sequence(){
	    int x = 0;
        int y = 1;
		int z = 0;
		int sum = 0;
		while(z <= 4000000){
			z = y;
			y += x;
			x = z;
	        if(y % 2 == 0){
				sum += y;
		    }
		}
	    return sum;
	}

	public static void main(String[] args){
        long startTime = System.nanoTime();
	    System.out.println(sequence());
        long endTime = System.nanoTime();
        double duration = (double) (endTime - startTime) /1000000;
        System.out.println("---------------------------\n Program executed in " + duration + " milliseconds.");
	} 
}