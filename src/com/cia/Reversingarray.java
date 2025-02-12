package com.cia;
import java.util.Scanner;
import java.util.ArrayList;

public class Reversingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        ArrayList<Integer> list= new ArrayList<>(10);
        System.out.println("Enter the values : ");
        for(int i=0;i<100;i++)
        {
            int n = sc.nextInt();
            if(n == -1)
                break;
            list.add(n);
        }
        System.out.print("Reversed array: ");
        for(int i=list.size()-1;i>=0;i--)
        {

            System.out.print(list.get(i)+" ");

        }

    }
}
