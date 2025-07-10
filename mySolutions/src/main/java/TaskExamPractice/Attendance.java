package TaskExamPractice;

public class Attendance {
    private int studentId;
    private int courseId;
    private String time;

    public Attendance(int studentId, int courseId, String time) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.time = time;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }


    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "studentId=" + studentId +
                ", courseId=" + courseId +
                ", time='" + time + '\'' +
                '}';
    }
}
