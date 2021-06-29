package katlynbecvar.cs.courseregistration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    //can just pass array, or get array from datasource and create method setData... in adapter class
    //call method from view classes activity and then set data when recycler view is created i.e Course Rating Database/ToD0
    public static class CourseViewHolder extends RecyclerView.ViewHolder {

        TextView textViewCourseName;
        TextView textViewCourseNumber;
        TextView textViewInstructor;
        TextView textViewCreditHour;

        public CourseViewHolder(View itemView) {
            super(itemView);
            textViewCourseName = itemView.findViewById(R.id.textViewCourseName);
            textViewCourseNumber = itemView.findViewById(R.id.textViewCourseNumber);
            textViewInstructor =  itemView.findViewById(R.id.textViewInstructor);
            textViewCreditHour =  itemView.findViewById(R.id.textViewCreditHours);

        }
    }

    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_view_classes, parent, false);

        CourseViewHolder viewHolder = new CourseViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CourseAdapter.CourseViewHolder holder, int position) {
        //CourseData courseData = new CourseData(courseData));
        ArrayList<String> courseName = new ArrayList<String>();
        ArrayList<String> courseNumber = new ArrayList<String>();
        ArrayList<String> instructor = new ArrayList<String>();
        ArrayList<String> creditHours = new ArrayList<String>();


        TextView textViewCourseName = holder.textViewCourseName;
        TextView textViewCourseNumber = holder.textViewCourseNumber;
        TextView textViewInstructor = holder.textViewInstructor;
        TextView textViewCreditHours = holder.textViewCreditHour;

        textViewCourseName.setText(CourseData.getCourseNameArray()[position]);
        textViewCourseNumber.setText(CourseData.getCourseNumberArray()[position]);
        textViewInstructor.setText(CourseData.getCourseInstructorArray()[position]);
        textViewCreditHours.setText(CourseData.getCreditHoursArray()[position]);

    }


    @Override
    public int getItemCount() {

        return 0;
    }

}



