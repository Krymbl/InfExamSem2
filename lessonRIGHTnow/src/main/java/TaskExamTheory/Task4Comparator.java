package TaskExamTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task4Comparator {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student(403,"Богдан"));
        students.add(new Student(402,"Владик"));

        System.out.println(students.get(0).group + " " + students.get(1).group);
        Collections.sort(students, new CompGroup());
        System.out.println(students.get(0).group + " " + students.get(1).group);


    }

    public static class Student {
        private int group;
        private String name;

        public Student(int group, String name) {
            this.group = group;
            this.name = name;
        }
    }

    public static class CompGroup implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.group - o2.group;
        }
    }

}
