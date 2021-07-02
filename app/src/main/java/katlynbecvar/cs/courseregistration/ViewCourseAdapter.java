
package katlynbecvar.cs.courseregistration;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class ViewCourseAdapter extends RecyclerView.Adapter<ViewCourseAdapter.ViewHolder>{
    private Context context;
    private ArrayList<ViewCourseModel> courseModelArrayList;

    public ViewCourseAdapter(Context context, ArrayList<ViewCourseModel> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @Override
    public ViewCourseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewCourseAdapter.ViewHolder holder, int position) {
        ViewCourseModel courseModel = courseModelArrayList.get(position);
        holder.courseName.setText(courseModel.getCourse_name());
        holder.courseNumber.setText(courseModel.getCourse_number());
        holder.instructor.setText(courseModel.getCourse_instructor());
        holder.creditHour.setText(Integer.toString(courseModel.getCredit_hour()));

    }

    @Override
    public int getItemCount() {
        return courseModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView courseName;
        private TextView courseNumber;
        private TextView instructor;
        private TextView creditHour;

        public ViewHolder(View itemView){
            super(itemView);
            courseName = itemView.findViewById(R.id.course_name);
            courseNumber = itemView.findViewById(R.id.course_number);
            instructor = itemView.findViewById(R.id.instructor);
            creditHour = itemView.findViewById(R.id.credit_hour);
        }
    }

}
