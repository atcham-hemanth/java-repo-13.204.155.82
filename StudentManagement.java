public class StudentManagement {

    public static void main(String[] args) {

        System.out.println("===== Student Management System =====");

        String name = args[0];
        int id = Integer.parseInt(args[1]);
        int math = Integer.parseInt(args[2]);
        int science = Integer.parseInt(args[3]);
        int english = Integer.parseInt(args[4]);

        int total = math + science + english;
        double average = total / 3.0;

        String grade;

        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 50) grade = "C";
        else grade = "Fail";

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        System.out.println("Program Completed!");
    }
}




