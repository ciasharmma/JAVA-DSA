package com.cia;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 14, 16, 18, 35, 46, 78, 89, 90};
        int start = 0;
        int end = arr.length - 1;

        System.out.print("Enter the value you want to search: ");
        int n = sc.nextInt();

        boolean found = false; // To track if element is found

        while (start <= end) {
            int mid = start + (end - start) / 2; // Correct mid calculation

            if (arr[mid] == n) {
                System.out.println("The element is at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] > n) {
                end = mid - 1; // Search in left half
            } else {
                start = mid + 1; // Search in right half
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
