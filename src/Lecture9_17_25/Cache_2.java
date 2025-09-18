package Lecture9_17_25;

import java.util.Arrays;
import java.util.Scanner;

public class Cache_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of cache: ");
        int size = scan.nextInt();

        int[] cache = new int[size];
        for(int i = 0; i < cache.length; i++){
            for (int j = size - 1; j > 0; j--) {
                cache[j] = cache[j - 1];
            }
            System.out.print("Cache Data: ");
            cache[0] = scan.nextInt();
        }
        System.out.print("Cache elements: " + Arrays.toString(cache));
    }
}
