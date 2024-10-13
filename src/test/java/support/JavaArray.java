package support;

public class JavaArray {




    public static void main(String[] args){
       int age = 16;
       int[] ages = {16,18,21,20,45};
       String[] users = {"Admin","Manager","Executive"};
        String user = "Admin";
        System.out.println(ages[2]);
        System.out.println(users[1]);

        //while loop
//        while(age < 18){
//            System.out.println("You are too young");
//            age++;
//        }
//
//        for(int i=16; i<18;i++){
//            System.out.println(i);
//            System.out.println("You are not old enough");
//        }
        for (int i = 0; i <ages.length; i++){
            System.out.println(ages[i]);

        }
        for (int i = 0; i <users.length; i++){
            System.out.println(users[i]);

        }

// same for loop above with enhanced for loop
        for(int a:ages){
            System.out.println(a);
        }
        for(String u:users){
            System.out.println(u);
        }


    }
}
