package katlynbecvar.cs.courseregistration;

import java.util.List;

public class CourseDataModel {

    private String courseName;
    private String professor;
    private int creditHour;
    private int courseNumber;

    public CourseDataModel(String s, int i, String s1, int i1) {
    }

    public String getCourseName() { return courseName; }

    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getProfessor() { return professor; }

    public void setProfessor(String professor) { this.professor = professor; }

    public int getCreditHour() { return creditHour; }

    public void setCreditHour(int creditHour) { this.creditHour = creditHour; }

    public int getCourseNumber() { return courseNumber; }

    public void setCourseNumber(int courseNumber) { this.courseNumber = courseNumber; }

    public CourseDataModel(String courseName, String professor, int creditHour, int courseNumber, List<String> courseList) {
        this.courseName = courseName;
        this.professor = professor;
        this.creditHour = creditHour;
        this.courseNumber = courseNumber;
    }

}
