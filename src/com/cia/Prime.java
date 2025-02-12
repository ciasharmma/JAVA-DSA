package com.cia;
import java.util.Scanner;

public class Prime{
    public static boolean isprime(int n){

        if(n<=1)
        {
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if (n%i==0)
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();

        if(isprime(n)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }

        sc.close();
    }
}