package exercise6;

public class Bankautomat {

    private double credits;
    private double WITHDRAWLIMIT = 1000;

    public Bankautomat(double credits) {
        this.credits = credits;
    }

    public void depositMoney(double amount){
        this.credits += amount;
        System.out.println("Current credits: " + getCredits());
    }

    public void withdrawMoney(double amount){
        this.credits -= amount;
        System.out.println("Current credits; " + getCredits());
    }

    public double getCredits() {
        return credits;
    }

    public double getWITHDRAWLIMIT() {
        return WITHDRAWLIMIT;
    }
}
