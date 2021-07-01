
package katlynbecvar.cs.courseregistration;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


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
        /*holder.courseNumber.setText(courseModel.getCourse_number());
        holder.instructor.setText(courseModel.getCourse_instructor());
        holder.creditHour.setText(courseModel.getCredit_hour());*/

    }

    @Override
    public int getItemCount() {
        return courseModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView courseName;
        /*private TextView courseNumber;
        private TextView instructor;
        private TextView creditHour;*/

        public ViewHolder(View itemView){
            super(itemView);
            courseName = itemView.findViewById(R.id.course_name);
           /* courseNumber.findViewById(R.id.course_number);
            instructor.findViewById(R.id.instructor);
            creditHour.findViewById(R.id.credit_hour)*/;
        }
    }

}
