package TaskExamPractice;

public class Courses {
    private int id;
    private String name;
    private int hours;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public Courses(int id, String name, int hours) {
        this.id = id;
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}
