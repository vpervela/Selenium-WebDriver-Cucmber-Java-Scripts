package support;

public class MyArrayHW {
    public static void main(String[] args){
        //create an array of different data types
        Object[] mixArr = {"John",101,true,"Abraham",102,false,"Lincoln",103,true};

        //call a method to print each line of array
        printArr(mixArr);

        //create an array of days
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        //call method to check if it is friday
        isItFridayYet(days);
    }
    //create method that print each element of array
    public static void printArr(Object[] array){
        System.out.println("List of Elements in mixArr: ");
        for (int i=0; i<array.length;i+=3){
            System.out.println(array[i] +","+ array[i+1]+","+array[i+2]);
        }
    }
    //create method to check if it is Friday
    public static void isItFridayYet(String[] days){
        System.out.println("Check if it is Friday: ");
        for (String day : days) {
            System.out.println(day);
            if (day.equalsIgnoreCase("Friday")) {
                System.out.println("TGIF");
                break;
            }
        }
    }
}
