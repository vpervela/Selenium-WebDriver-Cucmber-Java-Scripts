package support;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(50,30,"Honda","Civic");
//        car1.drive(30);
//        car1.fuelUp(10);
//        car1.drive(30);
//        car1.fuelUp(10);
        //Drive car1 50 miles
        car1.drive(50);

        //print distance and fuelLevel of car1
        System.out.println("First Car Information with travel Details: ");
        System.out.println(car1);

        //second car instance
        Car car2 = new Car(60, 25,"Toyota","Rav4");
        car2.drive(25);

        //print distance and fuelLevel of car2
        System.out.println("Second Car Information with travel Details: ");
        System.out.println(car2);

      //Fuelup the two cars
        car1.fuelUp(20);
        car2.fuelUp(15);

        //print out the distance and fuel one more time
        System.out.println("After Fuel Up:");
        System.out.println(car1);
        System.out.println(car2);


    }
}
