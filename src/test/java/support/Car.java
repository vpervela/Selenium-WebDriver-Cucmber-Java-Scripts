package support;

public class Car {
    //create attributes for car class
    private int fuelLevel;
    private int distance = 0;
    private String make;
    private String model;
    private int mpg ;
    private final int maxFuelLevel = 100;


    //constructor to initialize car with attributes fuel and distance
    public Car(int fuelLevel, int mpg,String make,String model){
        this.fuelLevel = fuelLevel;
        this.mpg = mpg;
        this.make = make;
        this.model = model;
    }

    //create drive method
    public void drive(int miles){
        if(fuelLevel>0) {
            int fuelNeeded = miles / mpg;
            if (fuelLevel >= fuelNeeded) {
                distance += miles;
                fuelLevel = fuelLevel - fuelNeeded;
                System.out.println("You drove" + miles + "miles.Total distance traveled is: " + distance + "miles.Remaining fuel is: " + fuelLevel);
            } else {
                int possibleMiles = fuelLevel * mpg;
                distance += possibleMiles;
                fuelLevel = 0;
                System.out.println("You ran out of fuel after driving" + possibleMiles + " miles.Total distance traveled:" + distance + " miles.");
            }
        }
        else{
                System.out.println("You cannot drive. Your fuel level is low");
            }
    }

    //create method to fuelup
    public void fuelUp(int fuel) {
        if (fuel > 0) {
            int newFuelLevel = fuelLevel + fuel;
            if (newFuelLevel > maxFuelLevel) {
                System.out.println("Fuel tank full.You can only add " + (maxFuelLevel - fuelLevel) + " units.");
                fuelLevel = maxFuelLevel;
            } else {
                fuelLevel = newFuelLevel;
                System.out.println("You filled the fuel:" + fuel + "units. Current FuelLevel is:" + fuelLevel);

            }
        }
        else{
                System.out.println("Your fuel amount must be positive");

            }


        }


    public int getDistance() {
        return distance;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    @Override
    public String toString(){
        return "Car(" + make + " " + model + ") - Distance: " + distance + " miles, Fuel Level: " + fuelLevel + " units, MPG: " + mpg;

    }
}

