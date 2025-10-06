package Doesnt_have_to_do_anything_with_class;

import java.util.Scanner;

public class BinarySearch {

    public static int search(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int key = 9;
        System.out.println("Index: " + search(arr,key));
    }
}
