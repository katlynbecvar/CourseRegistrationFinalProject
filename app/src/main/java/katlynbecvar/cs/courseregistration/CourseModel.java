package katlynbecvar.cs.courseregistration;

public class CourseModel {
    private String course_name;
    private String course_number;
    private String course_instructor;
    private int credit_hour;
    private String student_id;
    private String course_name_text_edit;
    private String course_number_text_edit;
    private String instructor_text_edit;
    private String credit_hour_text_edit;



    public CourseModel(String course_name, String course_number, String course_instructor, int credit_hour) {
        this.course_name = course_name;
        this.course_number = course_number;
        this.course_instructor = course_instructor;
        this.credit_hour = credit_hour;
        this.student_id = student_id;
        this.course_name_text_edit = course_name_text_edit;
        this.course_number_text_edit = course_name_text_edit;
        this.instructor_text_edit = instructor_text_edit;
        this.credit_hour_text_edit = credit_hour_text_edit;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_number() {
        return course_number;
    }

    public void setCourse_number(String course_number) {
        this.course_number = course_number;
    }

    public String getCourse_instructor() {
        return course_instructor;
    }

    public void setCourse_instructor(String course_instructor) {
        this.course_instructor = course_instructor;
    }

    public int getCredit_hour() {
        return credit_hour;
    }

    public void setCredit_hour(int credit_hour) {
        this.credit_hour = credit_hour;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getCourse_name_text_edit() {
        return course_name_text_edit;
    }

    public void setCourse_name_text_edit(String course_name_text_edit) {
        this.course_name_text_edit = course_name_text_edit;
    }

    public String getCourse_number_text_edit() {
        return course_number_text_edit;
    }

    public void setCourse_number_text_edit(String course_number_text_edit) {
        this.course_number_text_edit = course_number_text_edit;
    }

    public String getInstructor_text_edit() {
        return instructor_text_edit;
    }

    public void setInstructor_text_edit(String instructor_text_edit) {
        this.instructor_text_edit = instructor_text_edit;
    }

    public String getCredit_hour_text_edit() {
        return credit_hour_text_edit;
    }

    public void setCredit_hour_text_edit(String credit_hour_text_edit) {
        this.credit_hour_text_edit = credit_hour_text_edit;
    }
}
