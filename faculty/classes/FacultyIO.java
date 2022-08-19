package faculty;

import java.io.File;
import java.io.FileWriter;
public class FacultyIO {
    private File file;
    private FileWriter writer;

    public void writeIntoFile(Faculty faculty) {
        try {
            file = new File("Database/StudentData.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new FileWriter(file, true);
            writer.write(faculty.getId() + "\r\n");
            writer.write(faculty.getName() + "\r\n");
            writer.write(faculty.getDepartment() + "\r\n");
            writer.write("\r\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
