package com.cia;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("  \"Calculatotr program\" ");
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the operation : ");
        int ch = input.nextInt();

        if (ch ==1)
        {
            System.out.println("give operand a : ");
            int a = input.nextInt();
            System.out.println("give operand b : ");
            int b = input.nextInt();
            int c=a+b;
            System.out.println("the sum of the no is: "+c);

        }
        if (ch ==2)
        {
            System.out.println("give operand a : ");
            int a = input.nextInt();
            System.out.println("give operand b : ");
            int b = input.nextInt();
            int c=a-b;
            System.out.println("the sum of the no is: "+c);

        }
        if (ch == 3)
        {
            System.out.println("give operand a : ");
            int a = input.nextInt();
            System.out.println("give operand b : ");
            int b = input.nextInt();
            int c=a*b;
            System.out.println("the sum of the no is: "+c);

        }
        if (ch == 4)
        {
            System.out.println("give operand a : ");
            int a = input.nextInt();
            System.out.println("give operand b : ");
            int b = input.nextInt();
            int c=a/b;
            System.out.println("the sum of the no is: "+c);

        }
    }
}
