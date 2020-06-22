package exercise3;

public class Counter {

    public Counter(int startIndex, int endIndex) {
        forLoop(startIndex, endIndex);
        whileLoop(startIndex, endIndex);
        countWithRecursion(startIndex, endIndex);
    }

    /**
     * Method with a for loop
     */
    public void forLoop(int startIndex, int endIndex){
        for(int i = startIndex; i <= endIndex; i++){
            System.out.println(i);
        }
    }

    /**
     * Method with a while loop (Bonus, just to see there are different loops)
     */
    public void whileLoop(int startIndex, int endIndex){
        while(startIndex <= endIndex){
            System.out.println(startIndex);
            startIndex++;
        }
    }

    public void countWithRecursion(int startIndex, int endIndex){
        recursion(startIndex, endIndex);
    }

    /**
     * Method to count recursivly
     */
    private void recursion(int startIndex, int endIndex){
        if(startIndex <= endIndex){
            System.out.println(startIndex);
            recursion(++startIndex, endIndex);
        }
    }
}
