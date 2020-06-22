package exercise6;

import exercise6.exceptions.LimitExceededException;
import exercise6.exceptions.NegativeNumberException;
import exercise6.exceptions.NotEnoughMoneyException;

public class Bankautomat_with_exceptions {

    private double credits;
    private double WITHDRAWLIMIT = 1000;

    public Bankautomat_with_exceptions(double credits) {
        this.credits = credits;
    }

    public void depositMoney(double amount){

        try{
            if(amount < 0){
                throw new NegativeNumberException("You cannot deposit negative money");
            }

            this.credits += amount;

            System.out.println("Current credits: " + this.credits);

        }catch(NegativeNumberException e){
            System.err.println(e.getMessage());
        }
    }

    public void withdrawMoney(double amount){
        try{
            if(this.credits - amount < 0){
                throw new NotEnoughMoneyException("You cannot withdraw money anymore. Your credit is lower or equal to zero.");
            }

            this.WITHDRAWLIMIT -= amount;

            if(WITHDRAWLIMIT <= 0 ){
                throw new LimitExceededException("Your limit exeeded!");
            }

            this.credits -= amount;


            System.out.println("Current credits " + this.credits);

        }catch(NotEnoughMoneyException | LimitExceededException e){
            System.err.println(e.getMessage());
        }
    }
}
