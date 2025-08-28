package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("StudentsHW.txt"));
             BufferedWriter bwTask1 = new BufferedWriter(new FileWriter("Students11-407.txt"));
             BufferedWriter bwTask2 = new BufferedWriter(new FileWriter("Students_grade89+.txt"));
             BufferedWriter bwTask3 = new BufferedWriter(new FileWriter("TheBestStudents.txt"));
             BufferedWriter bwTask4 = new BufferedWriter(new FileWriter("Groups.txt"));
             BufferedWriter bwTask5 = new BufferedWriter(new FileWriter("Names.txt"))) {

            /// TODO Считывание
            String line = br.readLine();
            while (line != null) {
                String[] line2 = line.split(", ");
                students.add(new Student(line2[0], Integer.parseInt(line2[1]), line2[2]));
                line = br.readLine();
            }

            ///  TODO Первое задание
            List<Student> students407 = students.stream()
                    .filter(o -> o.getGroup().equals("11-407"))
                    .toList();

            for (Student student : students407){
                bwTask1.write(student.getName() + ", " +  student.getGrade() + ", " + student.getGroup() + "\n");
            }

            ///  TODO Второе задание
            List<Student> students89 = students.stream()
                    .filter(o -> o.getGrade() > 89)
                    .toList();

            for (Student student : students89){
                bwTask2.write(student.getName() + ", " +  student.getGrade() + ", " + student.getGroup() + "\n");
            }

            ///  TODO Третье задание
            List<Student> students403 = students.stream()
                    .filter(o -> o.getGrade() > 60 & o.getGrade() < 90 & o.getGroup().equals("11-403"))
                    .toList();

            for (Student student : students403){
                bwTask3.write(student.getName() + ", " +  student.getGrade() + ", " + student.getGroup() + "\n");
            }

            ///  TODO Четвертое задание
            List<String> groups = students.stream()
                    .map( o -> o.getGroup())
                    .distinct()
                    .toList();

            for (String group : groups){
                bwTask4.write(group + "\n");
            }

            ///  TODO Пятое задание
            List<String> names = students.stream()
                    .map(o -> o.getName())
                    .distinct()
                    .toList();

            for (String name : names){
                bwTask5.write(name + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
