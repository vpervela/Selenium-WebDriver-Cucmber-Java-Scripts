package support;

public class PancakeHouse {
    public String name = "Samuel's Pancake House";
    public int squareFeet = 1400;

    private int rent = 5000;
    private int grossIncome = 1000000;

    public PancakeHouse(String name,int squareFeet,int rent){
        this.name = name;
        this.squareFeet = squareFeet;
        this.rent = rent;
    }

    public void makePancake(int x){
        int count = 0;
        while(count<x){
            System.out.println("Making Pancakes");
            count++;
        }
    }

    public void makeEggs(int x){
        int i = 0;
        while(i<x){
            System.out.println("Making Eggs");
            i++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int collectProfit(int profit){
        int collected = grossIncome - profit;
        return collected;
    }
}
