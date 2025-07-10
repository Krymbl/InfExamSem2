package TaskExamPractice;

import java.io.*;
import java.util.*;

public class TaskExam {
    public static void main(String[] args) throws FileNotFoundException {
        String fileStudents = "students.txt";
        String fileGrades = "grades.txt";
        String fileCourse = "courses.txt";
        String fileAttendance = "attendance.txt";
        List<Student> students = new ArrayList<>();
        List<Grades> grades = new ArrayList<>();
        List<Courses> courses = new ArrayList<>();
        List<Attendance> attendance = new ArrayList<>();
        try (BufferedReader brS = new BufferedReader(new FileReader(fileStudents));
             BufferedReader brG = new BufferedReader(new FileReader(fileGrades));
             BufferedReader brC = new BufferedReader(new FileReader(fileCourse));
             BufferedReader brA = new BufferedReader(new FileReader(fileAttendance))) {

            String line = brS.readLine();
            while (line != null) {
                String[] line2 = line.split("\\|");
                students.add(new Student(Integer.parseInt(line2[0]), line2[1], Integer.parseInt(line2[2]), line2[3]));
                line = brS.readLine();
            }

            line = brG.readLine();
            while (line != null) {
                String[] line2 = line.split("\\|");
                grades.add(new Grades(Integer.parseInt(line2[0]), Integer.parseInt(line2[1]), Double.parseDouble(line2[2])));
                line = brG.readLine();
            }

            line = brA.readLine();
            while (line != null) {
                String[] line2 = line.split("\\|");
                attendance.add(new Attendance(Integer.parseInt(line2[0]), Integer.parseInt(line2[1]), line2[2]));
                line = brA.readLine();
            }

            line = brC.readLine();
            while (line != null) {
                String[] line2 = line.split("\\|");
                courses.add(new Courses(Integer.parseInt(line2[0]), line2[1], Integer.parseInt(line2[0])));
                line = brC.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(search(courses, attendance));
        ///  TODO 2. Найти группу, в которой хотя бы два студента были на всех предметах

        Set<String> set = new HashSet<>();
        for (Student currentStudent : students) {
            int count = (int) attendance.stream()
                    .filter(o -> o.getStudentId() == currentStudent.getId())
                    .map(o -> o.getCourseId())
                    .distinct()
                    .count();

            if (count == courses.size()) {
                if (set.contains(currentStudent.getGroupName())) {
                    System.out.println(currentStudent.getGroupName());
                    break;
                } else {
                    set.add(currentStudent.getGroupName());
                }
            }
        }

        /// TODO 3 Найти группы, у которых оценка по предмету больше 4.5

        Set<String> setOfGroups = new HashSet<>();

        for(Student student : students) {
            setOfGroups.add(student.getGroupName());
        }

        for(String group: setOfGroups) {

            List<Student> list = students.stream()
                    .filter(o -> o.getGroupName().equals(group))
                    .toList();
            int size = list.size();

            for(Courses course : courses) {
                Double finMark = 0.0;
                for (Student student : list) {
                    Double grades1 = grades.stream()
                            .filter(o -> o.getCourseId() == course.getId())
                            .filter(o -> o.getStudentid() == student.getId())
                                    .toList().get(0).getMark();
                    finMark += grades1;
                }

                finMark = finMark / size;
                if (finMark > 4.5) {
                    System.out.println(group + " " + course.getName() + " " + finMark);
                }
            }
        }
    }

        ///  TODO 1. Найти предмет, который посетили больше всего раз(т.е пометки о посещений)
        /// Вывести в виде "Название предмета: кол-во посещений".

        public static String search(List<Courses> courses, List<Attendance> attendance) {

            int max = 0;
            Courses courseMax = null;
            for (Courses currentCourse : courses) {
                int count = (int) attendance.stream()
                        .filter(o -> o.getCourseId() == currentCourse.getId())
                        .count();
                if (count > max) {
                    max = count;
                    courseMax = currentCourse;
                }
            }
            return courseMax.getName() + ": " + max;
        }




}
