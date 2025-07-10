package TaskExamTheory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TaskExam {

    public static void main(String[] args) {
        String fileStudents = "students.txt";
        String fileCourses = "courses.txt";
        String fileGrade = "grades.txt";
        String fileAttendance = "attendance.txt";

        List<List<String>> students = new ArrayList<>();
        List<List<String>> courses = new ArrayList<>();
        List<List<String>> grades = new ArrayList<>();
        List<List<String>> attendances = new ArrayList<>();


        try (BufferedReader brS = new BufferedReader(new FileReader(fileStudents));
             BufferedReader brC = new BufferedReader(new FileReader(fileCourses));
             BufferedReader brG = new BufferedReader(new FileReader(fileGrade));
             BufferedReader brA = new BufferedReader(new FileReader(fileAttendance))){


            String line = brS.readLine();

            while(line != null) {
                List<String> temp = Arrays.asList(line.split("\\|"));
                students.add(temp);
                line = brS.readLine();
            }

            line = brC.readLine();

            while(line != null) {
                List<String> temp = Arrays.asList(line.split("\\|"));
                courses.add(temp);
                line = brC.readLine();
            }

            line = brG.readLine();

            while(line != null) {
                List<String> temp = Arrays.asList(line.split("\\|"));
                grades.add(temp);
                line = brG.readLine();
            }

            line = brA.readLine();

            while(line != null) {
                List<String> temp = Arrays.asList(line.split("\\|"));
                attendances.add(temp);
                line = brA.readLine();
            }

///------------------------------------------------------------------------------
// TODO 1. Найти предмет, который посетили больше всего раз(т.е пометки о посещений)


            int max = 0;
            String maxCourse = null;
            for (List<String> currentCourse : courses) {
                String courseId = currentCourse.get(0);
                int count = (int) attendances.stream()
                        .filter(o -> o.get(1).equals(courseId))
                        .count();

                if( max < count) {
                    max = count;
                    maxCourse = currentCourse.get(1);
                }
            }
            System.out.println(maxCourse + ": " + max);
///------------------------------------------------------------------------------
// TODO 2. Найти группу, в которой хотя бы два студента были на всех предметах

            int coursesCount = courses.size();
            List<String> numberGroup = new ArrayList<>();
            for(List<String> currentStudent : students) {

                String studentId = currentStudent.get(0);
                int count = (int) attendances.stream()
                        .filter(o -> o.get(0).equals(studentId))
                        .map(o -> o.get(1))
                        .distinct()
                        .count();
                if (count == coursesCount) {
                    numberGroup.add(currentStudent.get(3));
                }

            }

            Set<String> setGroup = new HashSet<>();
            String correctGroup = "Нет такой группы";

            for(String currentGroup : numberGroup) {
                if (setGroup.contains(currentGroup)) {
                    correctGroup = currentGroup;
                } else {
                    setGroup.add(currentGroup);
                }
            }
            System.out.println(correctGroup);
///------------------------------------------------------------------------------
// TODO 3. Найти группы, у которых оценка по предмету больше 4.5

            Set<String> groupSet = new HashSet<>();
            for(List<String> currentStudent : students) {
                groupSet.add(currentStudent.get(3));
            }

            for(String group : groupSet) {

                List<String> listOfStudents = students.stream()
                        .filter(o -> o.get(3).equals(group))
                        .map(o -> o.get(0))
                                .toList();
                float countOfGroupStudents = listOfStudents.size();
                for(String currentStudent : listOfStudents) {
                    List<List<String>> greadesOfStudent = grades.stream()
                            .filter(o -> o.get(0).equals(currentStudent))
                            .toList();
                    System.out.println(currentStudent + greadesOfStudent);
                    for (List<String> )

                }

            }












        } catch (Exception e) {

        }
    }
}
