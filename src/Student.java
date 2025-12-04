public class Student {

    // Student's ID number (primary key)
    private int id;

    // Student's name
    private String name;

    // Student's age
    private int age;

    // Constructor: Used to create a new Student object.
    public Student(int id, String name, int age) {
        this.id = id;       // this.id = parametre id
        this.name = name;   // this.name = parametre name
        this.age = age;     // this.age = parametre age
    }

    // Getter: used to read the id value
    public int getId() {
        return id;
    }

    // Getter: used to read the name
    public String getName() {
        return name;
    }

    // Setter: used to update the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter: used to read the age
    public int getAge() {
        return age;
    }

    // Setter: used to update the age
    public void setAge(int age) {
        this.age = age;
    }

    // toString(): Custom format to print the student to the console
    @Override
    public String toString() {
        return "Student { " +
                "ID = " + id +
                ", Name = '" + name + '\'' +
                ", Age = " + age +
                " }";
    }
}
