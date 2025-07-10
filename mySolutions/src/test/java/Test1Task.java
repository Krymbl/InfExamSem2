
import TaskExamPractice.TaskExam;
import TaskExamPractice.Attendance;
import TaskExamPractice.Courses;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1Task {
    static List<Attendance> attendance = new ArrayList<>();
    static List<Courses> courses = new ArrayList<>();

    @BeforeAll
    public static void init() {

        try (BufferedReader brC = new BufferedReader(new FileReader("courses.txt"));
             BufferedReader brA = new BufferedReader(new FileReader("attendance.txt"))){

            String line = brA.readLine();
            while (line!= null) {
                String[] line2 = line.split("\\|");
                attendance.add(new Attendance(Integer.parseInt(line2[0]), Integer.parseInt(line2[1]), line2[2]));
                line = brA.readLine();
            }

            line = brC.readLine();
            while (line!= null) {
                String[] line2 = line.split("\\|");
                courses.add(new Courses(Integer.parseInt(line2[0]), line2[1], Integer.parseInt(line2[0])));
                line = brC.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Test

    void TestAssert() {
        assertEquals("История: 12", TaskExam.search(courses, attendance));
    }




}
