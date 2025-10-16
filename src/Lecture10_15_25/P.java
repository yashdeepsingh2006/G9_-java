package Lecture10_15_25;

public class P {
    static int totalStudents = 0;

    static class Student {
        String name;
        int roll;
        int marks;
        Student(String name, int roll, int marks) {
            this.name = name;
            this.roll = roll;
            this.marks = marks;
            totalStudents++;
        }

        public String calculateGrade(int marks) {
            if(marks>=90){
                return "A";
            }else if(marks>=75){
                return "B";
            }else if (marks>=50){
                return "C";
            }else{
                return "F";
            }
        }

        public static void main(String[] args) {
            Student s1 = new Student("John", 1, 54);
            Student s2 = new Student("Jane", 2, 23);
            Student s3 = new Student("John", 3, 92);

            System.out.println("Total students: " + totalStudents);
            System.out.println(s1.calculateGrade(s1.marks));
            System.out.println(s2.calculateGrade(s2.marks));
            System.out.println(s3.calculateGrade(s3.marks));

        }
    }
}
