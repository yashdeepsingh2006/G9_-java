package Lecture2;

public class Operators {
    public static void main(String[] args){
        int a = 20;
        int b = 5;
        // Arithmetic Operations
        System.out.println("Sum is: "+ (a+b)); // Adds two numbers
        System.out.println("Difference is: "+ (a-b)); // Subtracts two numbers
        System.out.println("Product is: "+ (a*b)); // Product of two numbers
        System.out.println("Division is: "+(a/b)); //Division of two numbers
        System.out.println("Modulo is: "+(a%b)); // Remainder of two numbers

        //Relational Operators
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a > b: " + (a > b));     // false
        System.out.println("a < b: " + (a < b));     // true
        System.out.println("a >= b: " + (a >= b));   // false
        System.out.println("a <= b: " + (a <= b));   // true

        // Logical Operators
        System.out.println(a > 0 && b < 0); //false
        System.out.println(a > 0||b >0); //true
        System.out.println(!(a<0)); //true

        //Ternery Operator
        System.out.println(a>0 ? true : false); //true

    }
}
