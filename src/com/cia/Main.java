package com.cia;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
     Scanner input =  new Scanner(System.in);
        System.out.println("Enter the no a: ");
        int a = input.nextInt();

     System.out.println("Enter the no b: ");
        int b = input.nextInt();

     int c = a+b;
     System.out.println("The sum is: "+c);

        }
    }
