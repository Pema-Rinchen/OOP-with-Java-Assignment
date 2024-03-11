import java.util.ArrayList;
import java.util.List;

// Student class
class Student {
    private String studentId;
    private String name;
    private List<Course> courses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);
    }
}

// Course class
class Course {
    private String courseId;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course(String courseId, String name, Teacher teacher) {
        this.courseId = courseId;
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    // Getters and setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }
}

// Teacher class
class Teacher {
    private String teacherId;
    private String name;

    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }

    // Getters and setters
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Main class
public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create teacher
        Teacher teacher = new Teacher("T001", "John Doe");

        // Create course
        Course course = new Course("C001", "Mathematics", teacher);

        // Create students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        // Enroll students in the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course details
        System.out.println("Course: " + course.getName());
        System.out.println("Teacher: " + course.getTeacher().getName());
        System.out.println("Students enrolled:");
        for (Student student : course.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
