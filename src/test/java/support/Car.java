package support;

public class Car {
    //create attributes for car class
    private int fuelLevel;
    private int distance;

    //constructor to initialize the car with fuel and distance
    public  Car(int startFuel){
        this.fuelLevel = startFuel;
        this.distance = 0;
    }

    //create method to simulate the car
    public void drive(int miles){
        if(fuelLevel>0){
            distance+= miles;
            fuelLevel--;
            System.out.println("You drove " +  miles + "miles.Total distance:"+ distance + "miles. Remaining fuel:"+ fuelLevel);
        }
        else{
            System.out.println("Cannot drive your fuelLevel is less");
        }
    }

    //create method to refuel the car
    public void fuelUp(int fuel){
        fuelLevel+= fuel;
        System.out.println("Your filled fuel is:" +  fuel + "units. Current fuelLevel in your car is:" +  fuelLevel);
    }
    //main method to call all the above methods
    public static void main(String[] args){
        Car myCar = new Car(10);
        myCar.drive(15);
        myCar.drive(10);
        myCar.fuelUp(2);
        myCar.drive(20);
        myCar.fuelUp(5);
    }
}


