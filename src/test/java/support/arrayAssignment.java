package support;

public class arrayAssignment {
    public static void main(String[] args) {
        // create arrays with different data types
        String names[] = {"John","Peter","Sara","Kate"};
        int ids[] = {101,102,103,104};
        boolean status[] = {true,false,true,true};
        printArrayNames(names);
        printArrayIDs(ids);
        printArrayStatus(status);

        //array for days
        String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        isItFridayYet(days);
    }
    public static void printArrayNames(String[] name) {
        System.out.println("Elements from Names Array:");
        for(String s:name) {
            System.out.println(s);
        }
        System.out.println();
    }
    public static void printArrayIDs(int[] ID) {
        System.out.println("Elements from IDs Array:");
        for(int id:ID) {
            System.out.println(id);
        }
        System.out.println();
    }
    public static void printArrayStatus(boolean[] state) {
        System.out.println("Elements from Status Array:");
        for(boolean status:state) {
            System.out.println(status);
        }
        System.out.println();
    }
    public static void isItFridayYet(String[] days) {
        for(String day: days) {

            if(day.equalsIgnoreCase("Friday")) {
                System.out.println("TGIF!");
                break;
            }
            System.out.println(day);
        }
    }

}
