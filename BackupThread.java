package studentmanagement;

public class BackupThread extends Thread {

    private StudentManager manager;

    public BackupThread(StudentManager manager) {
        this.manager = manager;
    }

    @Override
    public void run() {

        System.out.println("\nBackup process started...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Backup interrupted.");
        }

        FileHandler.saveStudents(manager);

        System.out.println("Backup process completed.");
    }
}