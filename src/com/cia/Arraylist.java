package com.cia;
import java.util.Scanner;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(100);

        System.out.println("Enter value to be added: ");
        for (int i = 0; i < 100; i++) {

            int n = sc.nextInt();
            list.add(n);
            if (n == -1) {
                break;
            }

        }
        sc.close();
        for (int i = 0; i < (list.size())-1; i++) {
            System.out.println("value at " + (i + 1) + ":" + list.get(i));

        }
    }}
