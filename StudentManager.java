package studentmanagement;

import java.util.ArrayList;

public class StudentManager implements Manageable {

    
    private ArrayList<Student> students = new ArrayList<>();

  
    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    
    @Override
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n===== All Student Records =====");

        for (Student student : students) {
            student.displayStudent();
            System.out.println("------------------------------");
        }
    }

    
    @Override
    public void searchStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                System.out.println("\nStudent Found!");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    
    @Override
    public void updateStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {

                System.out.println("Student found.");

                System.out.print("Enter new course: ");
                String course = Main.scanner.nextLine();

                System.out.print("Enter new marks: ");
                double marks = Main.scanner.nextDouble();
                Main.scanner.nextLine();

                student.setCourse(course);
                student.setMarks(marks);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    
    @Override
    public void deleteStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    
    public ArrayList<Student> getStudents() {
        return students;
    }
}