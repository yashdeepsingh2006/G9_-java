package Lecture9_18_25;
import java.util.Arrays;

public class diagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int prod = 1;
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){

                if(i == j){
                    prod *= arr[i][j];
                }
            }
        }
        System.out.println("Product: "+prod);
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if(i == j){
                    arr[i][j] =  prod;
                }
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
