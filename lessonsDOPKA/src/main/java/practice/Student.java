package practice;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String group;

    public Student(Integer id, String name, Integer age, String group) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
