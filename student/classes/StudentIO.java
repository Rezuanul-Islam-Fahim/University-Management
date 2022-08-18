package student.classes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class StudentIO {
    private File file;
    private FileWriter writer;
    private FileReader reader;
    private BufferedReader bfr;

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

    public Student searchFromFile(String studentId) {
        Student student = new Student();

        try {
            file = new File("Database/StudentData.txt");
            reader = new FileReader(file);
            bfr = new BufferedReader(reader);
            String temp;
            int counter = 0;

            while ((temp = bfr.readLine()) != null) {

                if (temp.contains(studentId)) {
                    student.setId(temp);
                    counter++;
                } else {
                    switch (counter) {
                        case 1: {
                            student.setName(temp);
                            counter++;
                        }
                            ;
                            break;
                        case 2: {
                            student.setAge(Integer.parseInt(temp));
                            counter++;
                        }
                            ;
                            break;
                        case 3: {
                            student.setGender(temp);
                            counter++;
                        }
                            ;
                            break;
                        case 4: {
                            student.setCGPA(Double.parseDouble(temp));
                            counter++;
                        }
                            ;
                            break;
                        case 5: {
                            student.setCreditPassed(Integer.parseInt(temp));
                            counter++;
                        }
                    }
                }
            }

            bfr.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }
}
