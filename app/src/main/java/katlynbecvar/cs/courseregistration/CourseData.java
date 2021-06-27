package katlynbecvar.cs.courseregistration;

import io.grpc.Server;

public class CourseData {

    static String[] courseNameArray = {"Applied Calculus", "Linear Algebra",
            "Discrete Mathematics", "Applied Probability and Statistics", "Introduction to Computer Science",
            "Programming Fundamentals", "Object-Oriented Programming", "Introduction to Networks",
            "Computer Organization", "Algorithms and Data Structures", "Operating Systems",
            "Computer Security", "Software Engineering", "Programming Languages", "Theory of Algorithms and Computation",
            "Software Systems Capstone Project", "Scientific Computing", "Applied Programming Languages",
            "Artificial Intelligence", "Video Game Programming 1", "Viedo Game Programming 2",
            "Computer Graphics Programming", ".NET Programming", "Web and Distributed Programming", "Database Systems",
            "Mobile Application Development", "Encryption", "Programming for Penetration Testing", "Programming for Digital Forensics",
            "Introduction to Unix", "Cloud Computing and Virtualization", "Client Server Computing"};


    static int[] courseNumberArray = {24000, 30500, 31000, 31400, 20000, 21000, 24500, 28100,
            30000, 34000, 35000, 42000, 44000, 46000, 46500, 49200, 31500, 36000, 47000,
            41000, 41500, 43000, 23000, 24700, 33000, 41700, 42500, 42700, 42800, 22000, 35500};

    static int[] creditHoursArray = {4,4,4,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};

    static String[] courseInstructorArray = {"Natalie Adams","Eric Chou","Dana Dominiak","Napoleon Garcia",
            "Cindy Howard","Sung Kim","Greg Manning","Lucien Ngalamou","Safwan Omari","Jason Perry","Mathias Plass","John Rinderer",
            "Michael Smith","Eric Spangler","Kayla Stephenson","Quinn Stratton","Piotr Szczurek","Thomas Szum","Natalie Adams","Eric Chou","Dana Dominiak","Napoleon Garcia",
            "Cindy Howard","Sung Kim","Greg Manning","Lucien Ngalamou","Safwan Omari","Jason Perry","Mathias Plass","John Rinderer",
            "Michael Smith"};

    public static String[] getCourseNameArray() {
        return courseNameArray;
    }

    public static void setCourseNameArray(String[] courseNameArray) {
        CourseData.courseNameArray = courseNameArray;
    }

    public static int[] getCourseNumberArray() {
        return courseNumberArray;
    }

    public static void setCourseNumberArray(int[] courseNumberArray) {
        CourseData.courseNumberArray = courseNumberArray;
    }

    public static int[] getCreditHoursArray() {
        return creditHoursArray;
    }

    public static void setCreditHoursArray(int[] creditHoursArray) {
        CourseData.creditHoursArray = creditHoursArray;
    }

    public static String[] getCourseInstructorArray() {
        return courseInstructorArray;
    }

    public static void setCourseInstructorArray(String[] courseInstructorArray) {
        CourseData.courseInstructorArray = courseInstructorArray;
    }

    public CourseData() {

    }
}
