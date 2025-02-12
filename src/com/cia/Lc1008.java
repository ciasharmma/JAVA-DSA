package com.cia;
import java.util.Scanner;
import java.util.Vector;

public class Lc1008{
    public static int maxsubarray(Vector<Integer> nums) {
        int n = nums.size();
        int r = 1;
        int sum = nums.get(0);
        int maxs = nums.get(0);

        while (r < n) {
            while (r < n && nums.get(r) > nums.get(r - 1)) {
                sum += nums.get(r);
                r++;
            }
            maxs = Math.max(maxs, sum);
            if (r < n) {
                sum = nums.get(r);
            }
            r++;

        }

        return maxs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> nums = new Vector<>();

        System.out.println("Enter numbers (Enter -1 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;  // Stop taking input when user enters -1
            nums.add(num);
        }

        if (nums.isEmpty()) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("Maximum Ascending Sum: " + maxsubarray(nums));
        }

        sc.close();
    }
    }



