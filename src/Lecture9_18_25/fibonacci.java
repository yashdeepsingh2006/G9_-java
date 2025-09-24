package Lecture9_18_25;

import java.util.Scanner;

public class fibonacci {
    public static int fib(int n){
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
