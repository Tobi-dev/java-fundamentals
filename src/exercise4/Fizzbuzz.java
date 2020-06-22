package exercise4;

public class Fizzbuzz {

    public Fizzbuzz(){

    }

    public void startFizzbuzz(int startIndex, int endIndex){
        for(int i = startIndex; i <= endIndex; i++){
            if(i % 5 == 0 && i % 7 == 0){
                System.out.println("Fizzbuzz");
            }else if(i % 5 == 0){
                System.out.println("Fizz");
            }else if(i % 7 == 0){
                System.out.println("Buzz");
            }
        }
    }
}
