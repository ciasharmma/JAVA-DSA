package com.cia;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] srr = {23,46,25,78,24,86,345,76,35,86};
        boolean found = false;

        System.out.println("Enter the value u want to insert into the array: ");
        int n = sc.nextInt();

        for(int i=0;i<srr.length;i++) {


            if (srr[i] == n) {
                System.out.println("the value is at " + (i + 1) + " th position");

                found = true;
                break;
            }
        }

            if (!found) {

                System.out.println("the value doesn't exits");

            }







    }
}
