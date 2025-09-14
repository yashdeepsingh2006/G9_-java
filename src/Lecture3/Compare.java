package Lecture3;

public class Compare {
    public static void main(String[] args){
        int a = 0;
        while(a>0){
            System.out.println(a);
        } // does not run once as condition is false
        do{
            System.out.println(a);
        }
        while(a>0); // runs once even if condition is false
    }
}
