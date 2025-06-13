package lab1;
import practice2.Student;
import java.util.*;

public class GradeBookTest {

	public static void main(String[] args) {
		Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "Intro to Programming");

        List<Student> students = List.of(
            new Student(1, "Student A"),
            new Student(2, "Student B"),
            new Student(3, "Student C"),
            new Student(4, "Student D"),
            new Student(5, "Student E"),
            new Student(6, "Student F"),
            new Student(7, "Student G"),
            new Student(8, "Student H"),
            new Student(9, "Student I"),
            new Student(10, "Student J")
        );

        GradeBook gradeBook = new GradeBook(course, students);
        gradeBook.displayMessage();

        Scanner scanner = new Scanner(System.in);
        gradeBook.inputGrades(scanner);
        gradeBook.displayGradeReport();
    }

	}


