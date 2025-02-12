package com.cia;
import java.util.Scanner;
import java.util.ArrayList;

public class Maxvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> list= new ArrayList<>(10);
        int max = 0;
        System.out.println("Enter the values : ");
        for(int i=0;i<100;i++)
        {
            int n = sc.nextInt();
            list.add(n);
            if(n == -1)
            break;
        }

        for(int i=0;i<list.size();i++)
        {
            int temp = 0;

            list.get(i);
            if(list.get(i)>max)
            {
                max = list.get(i);
            }

        }
        System.out.print("max value: "+max);
    }
}
