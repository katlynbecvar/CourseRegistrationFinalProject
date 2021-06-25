package katlynbecvar.cs.courseregistration;

public class CourseRegistration {

    private String courseName;
    private String professor;
    private int courseNumber;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public CourseRegistration(String courseName, String professor, int courseNumber) {
        this.courseName = courseName;
        this.professor = professor;
        this.courseNumber = courseNumber;
    }

    @Override
    public String toString() {
        return "CourseRegistration{" +
                "courseName='" + courseName + '\'' +
                ", professor='" + professor + '\'' +
                ", courseNumber=" + courseNumber +
                '}';
    }
}
