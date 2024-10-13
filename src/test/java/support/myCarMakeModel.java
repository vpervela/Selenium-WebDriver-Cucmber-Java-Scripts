package support;

public class myCarMakeModel {
    private String make;
    private String model;
    private int fuelLevel;
    private int distance;

    //constructor to initialize make,model,fuelLevel and distance
    public myCarMakeModel(String make, String model, int fuelLevel) {
        this.make = make;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.distance = 0;
    }

    //getter method for make
    public String getMake() {
        return make;
    }

    //setter method for make
    public void setMake(String make) {
        this.make = make;
    }

    //getter for model
    public String getModel() {
        return model;
    }

    //setter for model
    public void setModel(String model) {
        this.model = model;
    }

    //getter for distance
    public int getDistance(){
        return distance;
    }

    //getter for fuelLevel
    public int getFuelLevel(){
        return fuelLevel;
    }

    //method to simulate car driving miles
    public void drive(int miles) {
        if (fuelLevel > 0) {
            distance += miles;
            fuelLevel--;
            System.out.println(make + " " + model + " drove " + miles +" miles.Total distance :" + distance + " miles.");
            System.out.println("Remaining fuel level is: " + fuelLevel);

        }else{
            System.out.println(make + " " + model + "cannot drive. The fuel is very low.");
        }
    }

    //create method for re-fuel
    public void fuelUp(int fuel){
        fuelLevel+= fuel;
        System.out.println(make + " " + model + "refueled " + fuel + "liters. Current fuelLevel is: " + fuelLevel);
    }

   public static void main(String[] args){
        //create two instances for car
       myCarMakeModel car1 = new myCarMakeModel("Toyota","Camry",5);
       myCarMakeModel car2 = new myCarMakeModel("Honda","Civic",10);

       //drive first car 50 miles
       car1.drive(50);
       //drive second car 25 miles
       car2.drive(25);

       //print details
       System.out.println(car1.getMake() + " " + car1.getModel()+ " has driven " + car1.getDistance() + " miles with " + car1.getFuelLevel() + " fuel left .");
       System.out.println(car2.getMake() + " " + car2.getModel()+ " has driven " + car2.getDistance() + " miles with " + car2.getFuelLevel() + " fuel left .");

       //re-fuel both cars
       car1.fuelUp(10);
       car2.fuelUp(20);

       //print details after fueling
       System.out.println(car1.getMake() + " " + car1.getModel()+ " current fuel level: " +car1.getFuelLevel());
       System.out.println(car2.getMake() + " " + car2.getModel()+ " current fuel level: " +car2.getFuelLevel());
   }
}
