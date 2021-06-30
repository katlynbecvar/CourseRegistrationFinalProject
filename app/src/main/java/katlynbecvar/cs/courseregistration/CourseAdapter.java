
package katlynbecvar.cs.courseregistration;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.annotations.NotNull;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder>{
    private Context context;
    private ArrayList<CourseModel> courseModelArrayList;

    public CourseAdapter(Context context, ArrayList<CourseModel> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @Override
    public CourseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CourseAdapter.ViewHolder holder, int position) {
        CourseModel courseModel = courseModelArrayList.get(position);
        holder.courseName.setText(courseModel.getCourse_name());
        holder.courseNumber.setText(courseModel.getCourse_number());
        holder.instructor.setText(courseModel.getCourse_instructor());
        holder.creditHour.setText(courseModel.getCredit_hour());

    }

    @Override
    public int getItemCount() {
        return courseModelArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView computerLogo;
        private TextView courseName, courseNumber, instructor, creditHour;

        public ViewHolder(View itemView){
            super(itemView);
            computerLogo = itemView.findViewById(R.id.comp_logo);
            courseName = itemView.findViewById(R.id.course_name);
            courseNumber.findViewById(R.id.course_number);
            instructor.findViewById(R.id.instructor);
            creditHour.findViewById(R.id.credit_hour);
        }
    }

}
