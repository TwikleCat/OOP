package lab1;
import practice2.Student;
import java.util.*;

public class GradeBook {
	private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades;

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
        this.grades = new HashMap<>();
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void inputGrades(Scanner scanner) {
        System.out.println("Please, input grades for students:");
        for (Student s : students) {
            System.out.print(s.getName() + ": ");
            int grade = scanner.nextInt();
            grades.put(s, grade);
        }
    }

    public void displayGradeReport() {
        double average = determineClassAverage();
        Student highest = findBestStudent();
        Student lowest = findWorstStudent();

        System.out.printf("Class average is %.2f.\n", average);
        System.out.println("Lowest grade is " + grades.get(lowest) + " (" + lowest + ").");
        System.out.println("Highest grade is " + grades.get(highest) + " (" + highest + ").");

        outputBarChart();
    }

    private double determineClassAverage() {
        return grades.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    private Student findBestStudent() {
        return Collections.max(grades.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    private Student findWorstStudent() {
        return Collections.min(grades.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    private void outputBarChart() {
        int[] freq = new int[11];
        for (int grade : grades.values()) {
            if (grade == 100) {
                freq[10]++;
            } else {
                freq[grade / 10]++;
            }
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < freq.length; i++) {
            if (i == 10)
                System.out.print("  100: ");
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
