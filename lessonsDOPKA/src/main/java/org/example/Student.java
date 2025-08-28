package org.example;

public class Student {
    private String name;
    private Integer grade;
    private String group;

    public Student(String name, Integer grade, String group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", group='" + group + '\'' +
                '}';
    }
}
