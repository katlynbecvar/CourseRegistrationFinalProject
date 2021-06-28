package katlynbecvar.cs.courseregistration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    static ArrayList<CourseData> courseData;

    public static class CourseViewHolder extends RecyclerView.ViewHolder {

        TextView textViewCourseName;
        TextView textViewCourseNumber;
        TextView textViewInstructur;
        TextView textViewCreditHour;

        public CourseViewHolder(View itemView) {
            super(itemView);
            this.textViewCourseName = (TextView) itemView.findViewById(R.id.textViewCourseName);
            this.textViewCourseNumber = (TextView) itemView.findViewById(R.id.textViewCourseNumber);
            this.textViewInstructur = (TextView) itemView.findViewById(R.id.textViewInstructor);
            this.textViewCreditHour = (TextView) itemView.findViewById(R.id.textViewCreditHours);

        }
    }
    public CourseAdapter(ArrayList<CourseData> courseData){
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
        TextView textViewInstructor = holder.textViewInstructur;
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



