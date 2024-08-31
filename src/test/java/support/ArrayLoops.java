package support;

import java.util.ArrayList;

public class ArrayLoops {
    public static void main(String[] args){
        //create arrayList for names,ids,booleans
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<Boolean> isGrad = new ArrayList<>();

        //add values to arraylist
        names.add("Tom");
        ids.add(101);
        isGrad.add(true);

        names.add("Jerry");
        ids.add(102);
        isGrad.add(false);

        names.add("Greg");
        ids.add(103);
        isGrad.add(true);

        names.add("Stacy");
        ids.add(104);
        isGrad.add(true);

        //print array
        printArrayList(names,ids,isGrad);

        //arraylist of days to check friday
        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        //check if it is friday
        isItFridayYet(daysOfWeek);
    }
    //method to print each element of array
    public static void printArrayList(ArrayList<String> names, ArrayList<Integer> ids , ArrayList<Boolean> isGrad){
        int count = 0;
        for(String name : names){
            System.out.println("Name:" + name + " ID: " + ids.get(count) + " isGrad: " + isGrad.get(count));
            count++;
        }

    }
    
    //method to check if it is friday
    public static void isItFridayYet(ArrayList<String> days){
        for(String day : days){

            if(day.equals("Friday")){
                System.out.println("TGIF!");

                break;
            }
            System.out.println(day);
        }
    }
}
