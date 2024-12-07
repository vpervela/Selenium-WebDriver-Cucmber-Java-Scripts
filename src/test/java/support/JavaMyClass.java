package support;

public class JavaMyClass {
    public static void main(String[] args){

        String animalName = "Monkey", animalColor = "Brown";
        int  age  = 5;
        float weight = 1.23456F;
        boolean male = true;

        //print sum of strings
        System.out.println(animalColor + ' ' + animalName);
        System.out.println("Monkey's age is " + age);
        System.out.println("Monkey's weight is " + weight);
        System.out.println("Is Monkey Male? " + male);

        //Arithmetic operators
        System.out.println("Arithmetic Operators :");
        int a = 4,b = 7;
        System.out.println("Addition :" + (a+b));
        System.out.println("Subtraction :" + (a-b));
        System.out.println("Modulus :" + (b%a));
        System.out.println("Division :" + (b/a));
        System.out.println("Multiplication :" + (a*b));

        //comparison operators
        System.out.println("Comparison Operators :");
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //logical operators
        System.out.println("Logical Operators :");
        System.out.println(a<5 && a>1);
        System.out.println(a>1 || b==7);
        System.out.println(a!=7);



    }

}
