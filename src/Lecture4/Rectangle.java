package Lecture4;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
