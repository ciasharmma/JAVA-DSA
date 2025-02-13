package com.cia;
import java.util.Scanner;


public class BinaryAdv {
    public static int Binary(int target,int[] arr){
        int start = 0;
        int end = arr.length -1;
        int result = -1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(arr[mid]<target)
            {
                start = mid+1;
            }
            else {
                result = arr[mid];
                end = mid-1;
        }

        }
        return result;
        }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target: ");
        int target = sc.nextInt();
        int[] arr = {2,5,6,7,9,12,14,16,18,20};

        int res = Binary(target,arr);

        System.out.println("the no is :" +res);
        sc.close();

    }

}
//
//package com.cia;
//
//import java.util.Scanner;
//
//public class BinaryAdv {
//    public static int Binary(int target, int[] arr) {
//        int start = 0;
//        int end = arr.length - 1; // ✅ Corrected end index
//        int result = -1; // Default value if no greater element exists
//
//        while (start <= end) { // ✅ Use while loop for binary search
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] == target) {
//                return arr[mid]; // ✅ Return immediately if found
//            } else if (arr[mid] < target) {
//                start = mid + 1; // ✅ Move right
//            } else {
//                result = arr[mid]; // ✅ Store possible smallest greater element
//                end = mid - 1; // ✅ Move left to find smaller greater element
//            }
//        }
//        return result; // ✅ Return smallest greater element or -1 if none exists
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your target: ");
//        int target = sc.nextInt();
//        int[] arr = {2, 5, 6, 7, 9, 12, 14, 16, 18, 20};
//
//        int res = Binary(target, arr);
//        System.out.println("The number is: " + res);
//        sc.close();
//    }
//}
//
