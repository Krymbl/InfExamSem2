package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskExam {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Grades> grades = new ArrayList<>();
        List<Attendance> attendances = new ArrayList<>();

        try (BufferedReader brStudents = new BufferedReader(new FileReader("students.txt"));
             BufferedReader brCourses = new BufferedReader(new FileReader("courses.txt"));
             BufferedReader brGrades = new BufferedReader(new FileReader("grades.txt"));
             BufferedReader brAttendance = new BufferedReader(new FileReader("attendance.txt"))) {

            String line = brStudents.readLine();

            while (line != null) {
                String[] line2 = line.split("\\|");
                students.add(new Student(Integer.parseInt(line2[0]), line2[1], Integer.parseInt(line2[2]), line2[3]));
                line = brStudents.readLine();
            }

            line = brCourses.readLine();

            while (line != null) {
                String[] line2 = line.split("\\|");
                courses.add(new Course(Integer.parseInt(line2[0]), line2[1], Integer.parseInt(line2[2])));
                line = brCourses.readLine();
            }

            line = brGrades.readLine();

            while (line != null) {
                String[] line2 = line.split("\\|");
                grades.add(new Grades(Integer.parseInt(line2[0]), Integer.parseInt(line2[1]), Double.parseDouble(line2[2])));
                line = brGrades.readLine();
            }

            line = brAttendance.readLine();

            while (line != null) {
                String[] line2 = line.split("\\|");
                attendances.add(new Attendance(Integer.parseInt(line2[0]), Integer.parseInt(line2[1]), line2[2]));
                line = brAttendance.readLine();
            }

            /// TODO 1 задание
            int maxCount = 0;
            Course maxCourse = null;
            for (Course course : courses) {
                System.out.println(course);
                Integer count = (int) attendances.stream()
                        .filter(o -> o.getCourseId() == course.getId())
                        .count();
                if (count > maxCount) {
                    maxCourse = course;
                    maxCount = count;
                }
                System.out.println(course.getName() + " " + count);
            }

            System.out.println(maxCourse.getName() + ": " + maxCount);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
