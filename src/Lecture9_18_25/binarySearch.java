package Lecture9_18_25;

import java.util.*;

public class binarySearch {

    public static int binarysearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarysearch(arr, left, mid - 1, target);
        } else {
            return binarysearch(arr, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,4,3,2,4,54,67,0};

        int target = sc.nextInt();
        int left = 0, right = arr.length - 1;
        System.out.print(binarysearch(arr, left, right, target));
        sc.close();
    }
}