package com.cia;
import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args)
        {
        Scanner input = new Scanner(System.in);


        System.out.println("insert the position u want to have value of:  ");
            int n = input.nextInt();
     
       int c = fibo(n);
     
       System.out.println("the value at no is : " +c);


}
    public static int fibo(int n) {
        int c =0 ;
        int a = 0;
            int b = 1;
        for (int i = 3;i <= n;i++) {

            c = a + b;
            a = b;
            b = c;

        }
        return c;
        }
    }



/*import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci Series: " + generateFibonacci(n));
    }

    public static String generateFibonacci(int n) {
        if (n <= 0) return "";
        if (n == 1) return "0";

        StringBuilder series = new StringBuilder("0 1");
        int first = 0, second = 1;

        for (int i = 2; i < n; i++) {
            int next = first + second;
            series.append(" ").append(next);
            first = second;
            second = next;
        }

        return series.toString();

        
    }
} */
