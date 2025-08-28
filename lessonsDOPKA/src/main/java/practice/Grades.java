package practice;

public class Grades {
    private Integer studentid;
    private Integer courseId;
    private double mark;

    public Grades(Integer studentid, Integer courseId, double mark) {
        this.studentid = studentid;
        this.courseId = courseId;
        this.mark = mark;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "studentid=" + studentid +
                ", courseId=" + courseId +
                ", mark=" + mark +
                '}';
    }
}
