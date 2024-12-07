package support.CodingChallengesPractice;

import java.util.Scanner;

public class PrimeCheck {
    //create method to check if a number is prime
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
       //print prime numbers from 1 to n
        System.out.print("Enter the upper limit (n): ");
        int n = sc.nextInt();
        System.out.println("Prime numbers between 1 and " + n + ":");
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }


    }
}
