package student.classes;

import java.io.File;
// import java.io.FileReader;
import java.io.FileWriter;
// import java.io.BufferedReader;

public class StudentIO {
    private File file;
    private FileWriter writer;
    // private FileReader reader;
    // private BufferedReader bfr;

    public void writeIntoFile(Student student) {
        try {
            file = new File("Database/StudentData.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new FileWriter(file, true);
            writer.write(student.getId() + "\r\n");
            writer.write(student.getName() + "\r\n");
            writer.write(student.getAge() + "\r\n");
            writer.write(student.getGender() + "\r\n");
            writer.write(student.getCGPA() + "\r\n");
            writer.write(student.getCreditPassed() + "\r\n");
            writer.write("\r\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
