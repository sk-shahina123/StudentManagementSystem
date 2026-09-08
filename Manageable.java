package studentmanagement;

public interface Manageable {

    void addStudent(Student student);

    void viewStudents();

    void searchStudent(int studentId);

    void updateStudent(int studentId);

    void deleteStudent(int studentId);
}
