package com.cia;
import java.util.Scanner;
public class Minstring {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            char arr[] = str.toCharArray();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                count = 0;
                for (int j = 0; j < arr.length - 1; j++) {
                    if ((arr[j] - arr[j + 1]) == 1) {
                        char temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        count++;
                    }
                }
                if (count == 0)
                    break;
            }
            System.out.println(new String(arr));
        }
    }

