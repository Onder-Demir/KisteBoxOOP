import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner: Used to read user input
        Scanner scanner = new Scanner(System.in);

        // Our manager object that handles students
        StudentManager manager = new StudentManager();

        int choice; // user's menu choice

        //  menu loop
        do {
            System.out.println("\n--- Student Manager ---");
            System.out.println("1. Add student");
            System.out.println("2. List students");
            System.out.println("3. Remove student");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // add student
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    Student s = new Student(id, name, age);
                    manager.addStudent(s);
                    break;

                case 2:
                    // list all students
                    manager.listStudents();
                    break;

                case 3:
                    //remove by ID
                    System.out.print("Enter ID to remove: ");
                    int delId = scanner.nextInt();
                    scanner.nextLine();
                    manager.removeStudentById(delId);
                    break;

                case 0:
                    System.out.println("Exiting... Bye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }
}
