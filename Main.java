package studentmanagement;

import java.util.Scanner;

public class Main {

    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        
        FileHandler.loadStudents(manager);

        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Backup Data");
            System.out.println("7. Exit");
            System.out.println("=================================");

            try {

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        addStudent(manager);
                        break;

                    case 2:
                        manager.viewStudents();
                        break;

                    case 3:
                        System.out.print("Enter Student ID to search: ");
                        int searchId = scanner.nextInt();
                        scanner.nextLine();

                        manager.searchStudent(searchId);
                        break;

                    case 4:
                        System.out.print("Enter Student ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();

                        manager.updateStudent(updateId);
                        break;

                    case 5:
                        System.out.print("Enter Student ID to delete: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine();

                        manager.deleteStudent(deleteId);
                        break;

                    case 6:
                        BackupThread backup = new BackupThread(manager);
                        backup.start();
                        break;

                    case 7:
                        FileHandler.saveStudents(manager);
                        System.out.println("Thank you for using Student Management System!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter 1-7.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Please enter the correct value.");
                scanner.nextLine();
                choice = 0;
            }

        } while (choice != 7);

        scanner.close();
    }

    
    private static void addStudent(StudentManager manager) {

        try {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();

            if (age <= 0 || marks < 0 || marks > 100) {
                System.out.println("Invalid age or marks.");
                return;
            }

            Student student = new Student(
                    id,
                    name,
                    course,
                    age,
                    marks
            );

            manager.addStudent(student);

        } catch (Exception e) {

            System.out.println("Invalid input. Student was not added.");
            scanner.nextLine();
        }
    }
}
