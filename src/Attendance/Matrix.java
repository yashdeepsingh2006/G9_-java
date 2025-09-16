package Attendance;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {7,5,67,3,3},
            {8,6,3,2,7},
            {5,3,2,4,6},
            {5,3,2,4,5}
        };


        for(int[] arr1 : arr){
            int temp = Integer.MIN_VALUE;
            for(int i:arr1){
                if (i>temp){
                    temp = i;
                }
            }
            System.out.println(temp);
        }
    }
}
