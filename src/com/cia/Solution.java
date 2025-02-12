package com.cia;

import java.util.*;

class Solution {
    // Method to calculate nC2 (n choose 2)
    private int nC2(int n) {
        return (n * (n - 1)) / 2;
    }

    public int tuple(List<Integer> nums) {
        int n = nums.size();

        // Using HashMap instead of unordered_map in C++
        Map<Integer, Integer> freq = new HashMap<>();

        // Double loop to calculate product frequency
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums.get(i) * nums.get(j);
                freq.put(product, freq.getOrDefault(product, 0) + 1);
            }
        }

        int count = 0;
        // Iterating over the hashmap
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int product = entry.getKey();
            int frequency = entry.getValue();
            count += 8 * nC2(frequency);
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums = Arrays.asList(2, 3, 4, 6, 5, 7, 8); // Example input
        System.out.println("Result: " + sol.tuple(nums));
    }
}

