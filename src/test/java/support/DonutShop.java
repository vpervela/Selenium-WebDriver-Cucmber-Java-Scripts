package support;

public class DonutShop {
    public String name = "Ozzy's Donut Shop";
    public int area = 1400;
    private int rent = 6000;



    public DonutShop(String name, int area, int rent){
        this.name = name;
        this.area = area;
        this.rent = rent;
    }

    public String[] sellDonuts(String type, int qty){
        //you need to create an array for how many donuts
        String[] donuts = new String[qty];
        for(int i=0; i<qty; i++){
            donuts[i] = makeDonut(type);
        }
        return donuts;
    }



    private String makeDonut(String type){
        return type + " Donut";
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
