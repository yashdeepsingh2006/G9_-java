package Lecture2;
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String operator = in.next();
        char op = operator.charAt(0);
        switch(op){
            case '+':
                System.out.println("Sum of "+ a+ " "+ b + " is: "+ (a+b));
                break;
            case '-':
                System.out.println("Diff is: " +(a-b));
                break;
            case '*':
                System.out.println("Product is: "+(a*b));
                break;
            case '/':
                if(b!=0){
                    System.out.println("Division is: "+ (a/b));
                }
                break;
            case '%':
                System.out.println("Modulo is: "+ (a%b));
                break;
            default:
                System.out.println("Please enter the correct operation");
                break;
        }


    }
}
