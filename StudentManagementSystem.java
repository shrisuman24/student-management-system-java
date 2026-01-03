import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> deleteStudent();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        students.add(new Student(id, name));
        System.out.println("Student added successfully");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        for (Student s : students) {
            System.out.println(s.id + " - " + s.name);
        }
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        students.removeIf(s -> s.id == id);
        System.out.println("Student deleted if ID existed");
    }
}
