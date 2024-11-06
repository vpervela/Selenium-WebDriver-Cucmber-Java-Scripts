package support.CodingChallengesPractice;

import java.util.Scanner;

//Print numbers from 1 to n.
//For multiples of 3, print "Foo";
//for multiples of 5, print "Bar";
// for multiples of 7, print "Qux".
//If a number is divisible by both 3 and 5, print "FooBar",
//and if divisible by all three (3, 5, and 7), print "FooBarQux"
public class PrintNumber {
    //create method to print FooBarQux for multiples of 3,5,7 respectively
    public static void printFooBarQux(int n){
        for(int i = 1; i <= n; i++) {
            //if divisible by all three (3, 5, and 7), print "FooBarQux"
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FooBarQux");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FooBar"); //if divisible by both 3 and 5, print "FooBar"
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("BarQux"); //if divisible by both 5 and 7, print "BarQux"
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FooQux"); //if divisible by both 3 and 7, print "FooQux"
            } else if (i % 3 == 0) {
                System.out.println("Foo"); //if divisible by 3, print "Foo"
            } else if (i % 5 == 0) {
                System.out.println("Bar"); //if divisible by 5, print "Bar"
            } else if (i % 7 == 0) {
                System.out.println("Qux"); //if divisible by 7, print "Qux"
            } else {
                System.out.println(i); //print the number if not divisible by 3, 5, or 7
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printFooBarQux(n);

    }
}
