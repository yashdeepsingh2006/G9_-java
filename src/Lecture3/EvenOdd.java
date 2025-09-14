package Lecture3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if((a&1)==1){
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }
    }
}
