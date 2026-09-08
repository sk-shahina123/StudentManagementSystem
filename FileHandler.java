package studentmanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {

    private static final String FILE_NAME = "students.txt";

    
    public static void saveStudents(StudentManager manager) {

        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Student student : manager.getStudents()) {

                writer.println(
                    student.getStudentId() + "," +
                    student.getName() + "," +
                    student.getCourse() + "," +
                    student.getAge() + "," +
                    student.getMarks()
                );
            }

            System.out.println("Student data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving student data: " + e.getMessage());
        }
    }

    
    public static void loadStudents(StudentManager manager) {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 5) {

                    int studentId = Integer.parseInt(data[0]);
                    String name = data[1];
                    String course = data[2];
                    int age = Integer.parseInt(data[3]);
                    double marks = Double.parseDouble(data[4]);

                    Student student = new Student(
                        studentId,
                        name,
                        course,
                        age,
                        marks
                    );

                    manager.getStudents().add(student);
                }
            }

            System.out.println("Student data loaded successfully.");

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error while loading student data: " + e.getMessage());
        }
    }
}