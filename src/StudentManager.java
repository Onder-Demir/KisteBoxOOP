import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    // List of all students managed by this class
    private List<Student> students = new ArrayList<>();

    // Adds a new student to the list
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    // Prints all students in the list
    public void listStudents() {

        // If the list is empty, show message
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n--- Student List ---");

        // For-each loop:
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Removes a student by ID
    public boolean removeStudentById(int id) {

        Student toRemove = null;

        // Search for the student with the given ID
        for (Student s : students) {
            if (s.getId() == id) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student removed: " + toRemove.getName());
            return true;
        } else {
            System.out.println("Student with ID " + id + " not found.");
            return false;
        }
    }

}
