package katlynbecvar.cs.courseregistration;

public class Register {
    private String courseName, courseNumber, courseInstructor;
    private Integer creditHour;
    private String uid;

    public Register(){

    }

    public String getUid() { return uid; }

    public void setUid(String uid) { this.uid = uid; }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public Integer getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(Integer creditHour) {
        this.creditHour = creditHour;
    }

}
