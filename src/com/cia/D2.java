package com.cia;
import java.util.Scanner;
import java.util.Arrays;

public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println("Enter 3x3 Elememts: ");

        for(int row = 0;row< arr.length ;row++)
        {
            for(int col = 0;col<arr[row].length ; col++)
            {
                arr[row][col] = sc.nextInt();
            }
            System.out.println();
        }

//       for(int row = 0;row< arr.length ;row++)
//       {
//            System.out.println(Arrays.toString(arr[row]));
//       }
        for(int[] a :arr)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
