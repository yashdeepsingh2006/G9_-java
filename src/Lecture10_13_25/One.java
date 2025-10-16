package Lecture10_13_25;

public class One {
    public static int a = 0;

    static class Book{
        String name;
        String author;

        Book(String name,String author){
            this.name=name;
            this.author=author;
            a++;
        }
    }

    public static void main(String[] args) {


        Book b1 = new Book("abc", "name");

        System.out.println(b1.name);
        System.out.println(b1.author);
        System.out.println(a);

        Book b2 = new Book("abc", "name");
        System.out.println(b2.name);
        System.out.println(b2.author);
        System.out.println(a);
    }
}
