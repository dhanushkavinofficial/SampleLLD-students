import java.util.ArrayList;
import java.util.List;

// Address Class
class Address {
    private String street, city, state, zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + state + " - " + zipCode;
    }
}

// Course Class
class Course {
    private int courseId;
    private String courseName;
    private int credits;

    public Course(int id, String name, int credits) {
        this.courseId = id;
        this.courseName = name;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return courseName + " (" + credits + " credits)";
    }
}

// Student Class
class Student {
    private int studentId;
    private String name;
    private int age;
    private String email, phoneNumber;
    private Address address;
    private List<Course> courses;

    public Student(int studentId, String name, int age, String email, String phoneNumber, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.courses = new ArrayList<>(); // DSA: dynamic list
    }

    // Getter & Setter Methods
    public void addCourse(Course course) {
        courses.add(course); // DSA: adding to ArrayList
    }

    public void removeCourse(Course course) {
        courses.remove(course); // DSA: remove from ArrayList
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address.getFullAddress());
        System.out.println("Courses Enrolled:");
        for (Course c : courses) { // DSA: iterate list
            System.out.println(" - " + c);
        }
        System.out.println("---------------------------------");
    }
}

// Main Class
public class StudentSystem {
    public static void main(String[] args) {
        Address addr1 = new Address("MG Road", "Bangalore", "Karnataka", "560001");
        Student s1 = new Student(101, "Dhanush", 21, "dhanush@example.com", "9876543210", addr1);

        Course c1 = new Course(1, "Mathematics", 4);
        Course c2 = new Course(2, "Physics", 3);

        s1.addCourse(c1);
        s1.addCourse(c2);

        s1.displayDetails();

        // Remove a course example
        s1.removeCourse(c2);
        System.out.println("After removing Physics:");
        s1.displayDetails();
    }
}
