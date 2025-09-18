package Lecture9_17_25;

import java.util.Arrays;
import java.util.Scanner;

public class Cache {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of cache: ");
        int size = scan.nextInt();

        int[] cache = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Cache data: ");
            cache[i] = scan.nextInt();
        }

        System.out.print("Cache elements: " + Arrays.toString(cache));
    }

}
