package Doesnt_have_to_do_anything_with_class;

public class SelectionSort {
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_index = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {13,2,3,43,5,6,17,8,98,0};
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
