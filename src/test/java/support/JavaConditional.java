package support;

public class JavaConditional {

    public static void main(String[] args){
        int age = 18;
        clubEntry(16);
        clubEntry(18);
        clubEntry(20);
        clubEntry(21);
        clubEntry(55);
    }
    public static void clubEntry(int age){
       // int age = 16;

        if (age < 18){
            System.out.println("No access to club");

        } else if (age >= 18 && age < 21) {
            System.out.println("No alcohol is served for you");

        } else{
            System.out.println("Welcome to the club");
        }

    }
}
