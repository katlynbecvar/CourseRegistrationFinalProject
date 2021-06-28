package katlynbecvar.cs.courseregistration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    static ArrayList<CourseData> courseData;

    //can just pass array, or get array from datasource and create method setData... in adapter class
    //call method from view classes activity and then set data when recycler view is created i.e Course Rating Database/ToD0
    public static class CourseViewHolder extends RecyclerView.ViewHolder {

        TextView textViewCourseName;
        TextView textViewCourseNumber;
        TextView textViewInstructor;
        TextView textViewCreditHour;

        public CourseViewHolder(View itemView) {
            super(itemView);
            this.textViewCourseName = (TextView) itemView.findViewById(R.id.textViewCourseName);
            this.textViewCourseNumber = (TextView) itemView.findViewById(R.id.textViewCourseNumber);
            this.textViewInstructor = (TextView) itemView.findViewById(R.id.textViewInstructor);
            this.textViewCreditHour = (TextView) itemView.findViewById(R.id.textViewCreditHours);

        }
    }
    public CourseAdapter(ArrayList<katlynbecvar.cs.courseregistration.CourseData> courseData){
        this.courseData = courseData;
    }

    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_view_classes, parent, false);
        view.setOnClickListener(MainActivity.myViewOnClickListener);

        CourseViewHolder viewHolder = new CourseViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CourseAdapter.CourseViewHolder holder, int position) {
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



