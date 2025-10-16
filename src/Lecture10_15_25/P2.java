package Lecture10_15_25;

public class P2 {
    static class Calculator{
        int a;
        int b;

        Calculator(int a, int b){
            this.a = a;
            this.b = b;
        }

        public int add(int a, int b){
            return a+b;
        }
        public int sub(int a, int b){
            return a-b;
        }
        public int mul(int a, int b){
            return a*b;
        }
        public int div(int a, int b){
            if(b==0){
                System.out.println("cant divide by zero");
                return -1;
            }
            return a/b;
        }

    }




    public static void main(String[] args) {
        Calculator c1 = new Calculator(2,4);

        System.out.println(c1.add(c1.a, c1.b));
        System.out.println(c1.sub(c1.a, c1.b));
        System.out.println(c1.mul(c1.a, c1.b));
        System.out.println(c1.div(c1.a, c1.b));
    }
}
