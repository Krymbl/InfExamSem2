package practice;

public class Attendance {
    private Integer studentId;
    private Integer courseId;
    private String date;

    public Attendance(Integer studentId, Integer courseId, String date) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.date = date;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "studentId=" + studentId +
                ", courseId=" + courseId +
                ", date='" + date + '\'' +
                '}';
    }
}
