package exercise5;

public class Fibonacci {

    /**
     * Calculate n numbers of the fibonacci
     * @param endIndex index where to end
     */
    public void startFibonacci(int endIndex){
        int[] numberArray = new int[endIndex];

        // Default values for the first and second number
        numberArray[0] = 0;
        numberArray[1] = 1;

        System.out.println(numberArray[0]);
        System.out.println(numberArray[1]);

        //Start at 2 because we already have index 0 and 1
        for(int i = 2; i <= endIndex - 1; i++){
            numberArray[i] = numberArray[i - 1] + numberArray[i - 2];
            System.out.println(numberArray[i]);
        }
    }
}
