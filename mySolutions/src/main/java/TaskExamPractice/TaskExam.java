package TaskExamPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskExam {
    public static void main(String[] args) throws FileNotFoundException {
        String fileStudents = "students.txt";
        String fileGrades = "grades.txt";
        String fileCourse = "courses.txt";
        String fileAttendance = "attendance.txt";
        List<List<String>> students = new ArrayList<>();
        List<List<String>> grades = new ArrayList<>();
        List<List<String>> courses = new ArrayList<>();
        List<List<String>> attendance = new ArrayList<>();
        try (BufferedReader brS= new BufferedReader(new FileReader(fileStudents));
            BufferedReader brG= new BufferedReader(new FileReader(fileGrades));
            BufferedReader brC= new BufferedReader(new FileReader(fileCourse));
            BufferedReader brA= new BufferedReader(new FileReader(fileAttendance))){

            String line = brS.readLine();
            while (line!= null) {
                List<String> temp = Arrays.stream(line.split("\\|")).toList();
                students.add(temp);
                line = brS.readLine();
            }

            for(List<String> list : students) {
                System.out.println(list);
            }

            line = brG.readLine();
            while (line!= null) {
                List<String> temp = Arrays.stream(line.split("\\|")).toList();
                grades.add(temp);
                line = brS.readLine();
            }
            for(List<String> list : grades) {
                System.out.println(list);
            }

            line = brG.readLine();
            while (line!= null) {
                List<String> temp = Arrays.stream(line.split("\\|")).toList();
                grades.add(temp);
                line = brS.readLine();
            }
            for(List<String> list : grades) {
                System.out.println(list);
            }

            line = brC.readLine();
            while (line!= null) {
                List<String> temp = Arrays.stream(line.split("\\|")).toList();
                grades.add(temp);
                line = brS.readLine();
            }
            for(List<String> list : grades) {
                System.out.println(list);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
