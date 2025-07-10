package TaskExamPractice;

public class Grades {
    private int studentid;
    private int courseId;
    private double Mark;

    public Grades(int studentid, int courseId, double Mark) {
        this.studentid = studentid;
        this.courseId = courseId;
        this.Mark = Mark;
    }

    public int getStudentid() {
        return studentid;
    }

    public int getCourseId() {
        return courseId;
    }

    public double getMark() {
        return Mark;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "studentid=" + studentid +
                ", courseId=" + courseId +
                ", Mark=" + Mark +
                '}';
    }
}
