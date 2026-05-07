import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Management System =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter Marks in Science: ");
        int science = sc.nextInt();

        System.out.print("Enter Marks in English: ");
        int english = sc.nextInt();

        int total = math + science + english;
        double average = total / 3.0;

        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Name      : " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Math      : " + math);
        System.out.println("Science   : " + science);
        System.out.println("English   : " + english);
        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);
        System.out.println("Grade     : " + grade);

        System.out.println("\nProgram Executed Successfully!");
    }
}


