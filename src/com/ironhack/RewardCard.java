package com.ironhack;

public class RewardCard extends CreditCard {

    private int points;
    private static int counter = 0;
    private double MAX_SALARY = 2000;



    public RewardCard(String accountHolder, double balance, int points) {
        super(accountHolder, balance);
        this.points = points;
        counter++;
    }

    public RewardCard(String accountHolder, int points) {
        super(accountHolder);
        this.points = points;
    }

    public static int getCounter() {
        return counter;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public void addBalance(double balance) {
        super.addBalance(balance + 5);
        this.points += balance * 0.5;
    }

    public static void showDifference(RewardCard rewardCard1, RewardCard rewardCard2) {
        System.out.println(rewardCard1.getBalance() - rewardCard2.getBalance());
    }


}
