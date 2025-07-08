package TaskExamPractice;


public class Student {
    private String lastName;
    private String firstName;
    private String middleName;
    private String group;
    private Integer age;

    public Student() {
    }

    public Student(String lastName, String firstName, String middleName, String group, Integer age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.group = group;
        this.age = age;
    }

    public String getLastName() {
        System.out.println(1);
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println(2);
    }

    public String getFirstName() {
        System.out.println(3);
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println(4);
        this.firstName = firstName;
    }

    public String getMiddleName() {
        System.out.println(5);
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        System.out.println(6);
    }

    public String getGroup() {
        System.out.println(7);
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                '}';
    }
}