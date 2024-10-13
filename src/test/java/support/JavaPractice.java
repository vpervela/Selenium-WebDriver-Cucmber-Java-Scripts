package support;

public class JavaPractice {


    public static void printStuff(String str, int var, boolean b){
        System.out.println("This is my String: " + str);
        System.out.println("This is my int: " + var);
        System.out.println("This is my Boolean: " + b);
    }

    public static void sumString(String str1, String str2){
        System.out.println("Welcome to Automation : " + str1 +" with " + str2);
    }

    public static void arithmeticOper(int x, int y){

        System.out.println("Sum of two numbers: " +(x+y));
        System.out.println("Subtraction of two numbers: " +(x-y));
        System.out.println("Multiplication of two numbers: " +(x*y));
        System.out.println("Division of two numbers: " +(x/y));
        System.out.println("Remainder/Modulus of two numbers: " +(x%y));

    }

    public static void compareOper(int a, int b){

        System.out.println("Compare two numbers: " +(a==b));
        System.out.println("Compare two numbers: " +(a != b));
        System.out.println("Compare two numbers: " +(a<b));
        System.out.println("Compare two numbers: " +(a>b));
        System.out.println("Compare two numbers: " +(a>=b));
        System.out.println("Compare two numbers: " +(a<=b));
    }
    public static void logicalOper(int num1, int num2){
        System.out.println("LogicalCompare two numbers: " +(num1<num2 && num1>0));
        System.out.println("LogicalCompare two numbers: " +(num1<num2 || num1>=0));
        System.out.println("LogicalCompare two numbers: " +!(num1<num2));
    }

    public static void main(String[] args){

        printStuff("Welcome",10,true);
        sumString("Selenium","Java");
        arithmeticOper(25,3);
        compareOper(100,20);
        logicalOper(10,5);


    }
}
