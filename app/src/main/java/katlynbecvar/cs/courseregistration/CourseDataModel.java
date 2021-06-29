package katlynbecvar.cs.courseregistration;

import java.util.List;

public class CourseDataModel {

    private String courseName;
    private String professor;
    private int creditHour;
    private int courseNumber;

    public CourseDataModel(String courseName, String professor, int creditHour, int courseNumber, List<String> courseList) {
        this.courseName = courseName;
        this.professor = professor;
        this.creditHour = creditHour;
        this.courseNumber = courseNumber;
    }

    public CourseDataModel(String s, int i, String s1, int i1) {
    }

}
