package support;

import java.util.ArrayList;

public class CoffeeMachine {


    private ArrayList<String> order;

    //constructor to create new arraylist instance that will be modified later
    public CoffeeMachine(){
        this.order = new ArrayList<String>();
    }


    public void addOrder(String drink){
        order.add(drink);
    }
//to edit order by name of drink
    public void editOrder(String drink){
        order.remove(drink);
    }

    //edit drink by index
    public void editOrder(int index){
        order.remove(index);
    }

    //edit order by name of drink and index
    public void editOrder(int index,String replcaeDrink){
        order.set(index,replcaeDrink);
    }

    //clear order
    public void clearOrder(String drink){
        order.clear();
    }

    public String makeCoffee(String size){
        return size + "Coffee";
    }
    //overloading
    public String makeCoffee(String size,String milk){
        return size + "Coffee with " + milk;
    }

    public String makeLatte(String size){
        return size + "Latte";
    }

    public String makeLatte(String size,String milk){
        return size + "Latte with " + milk;
    }

    public String makeMocha(String size){
        return size + "Mocha";
    }

    //overloading
    public String makeMocha(String size,String milk){
        return size + "Mocha with " + milk;
    }



    public ArrayList<String> getOrder() {
        return order;
    }




    public static void main(String[] args) {
        CoffeeMachine cafeY = new CoffeeMachine();
        String hella = cafeY.makeCoffee("Hella");
        cafeY.addOrder(hella);
        System.out.println(cafeY.getOrder());

        String regLatte = cafeY.makeLatte("Venti");
        String fancyLatte = cafeY.makeLatte("Venti","Soy Milk");
        cafeY.addOrder(regLatte);
        cafeY.addOrder(fancyLatte);
        System.out.println(cafeY.getOrder());

    }

}
