package Lecture9_18_25;

import java.util.Scanner;

public class recursion {
    public static int fact(int n){
        if (n == 0) {
            return 1;
        }

        return n*fact(n-1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Value: ");
        int x = fact(scan.nextInt());
        System.out.println(x);
    }
}
