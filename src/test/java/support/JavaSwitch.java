package support;

public class JavaSwitch {

    public static void userRole(String user){
        switch (user){
            case "Admin" :
                System.out.println("Welcome Admin");
                break;
            case "Manager" :
                System.out.println("Welcome Manager");
                break;
            case "Executive" :
                System.out.println("Welcome Executive");
                break;
            default :
                System.out.println("No such user found");


        }
    }

    public static void main(String[] args){
       String user = "Admin";
       userRole("Admin");
        userRole("Manager");
        userRole("Executive");


    }
}
