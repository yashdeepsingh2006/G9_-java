package Lecture9_22_25;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        int target = 4;
        for (int i = 0; i <= arr.length - target; i++) {
            if (arr[i] == target) {
                System.out.println(i);
            }
        }
    }
}
