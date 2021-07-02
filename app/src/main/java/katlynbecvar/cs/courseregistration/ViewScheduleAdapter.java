package katlynbecvar.cs.courseregistration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;

public class ViewScheduleAdapter extends FirebaseRecyclerAdapter<ViewScheduleActivity, ViewScheduleAdapter.ScheduleViewHolder>{
    ArrayList<ViewScheduleModel> viewScheduleModels;
    Context context;

    public ViewScheduleAdapter(FirebaseRecyclerOptions<ViewScheduleActivity> options, ViewScheduleActivity context) {
        super(options);
    }

    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       context = parent.getContext();
       LayoutInflater inflater = LayoutInflater.from(context);
        View view = LayoutInflater.from(context).inflate(R.layout.activity_view_schedule_card_view, parent, false );
        return new ScheduleViewHolder(view);
    }


    @Override
    protected void onBindViewHolder(ViewScheduleAdapter.ScheduleViewHolder holder, int position, ViewScheduleActivity model) {
        ViewScheduleModel viewScheduleModel = viewScheduleModels.get(position);
        holder.courseName.setText(viewScheduleModel.getCourseName());
        holder.courseInstructor.setText(viewScheduleModel.getCourseInstructor());
        holder.courseNumber.setText(viewScheduleModel.getCourseNumber());
        holder.creditHour.setText(viewScheduleModel.getCreditHour());

    }

    @Override
    public int getItemCount() {
        return viewScheduleModels.size();
    }

    public static class ScheduleViewHolder extends RecyclerView.ViewHolder {

        TextView courseName, courseNumber, courseInstructor, creditHour;
        public ScheduleViewHolder(View itemView){
            super(itemView);
            courseName = itemView.findViewById(R.id.course_name_text_view);
            courseNumber = itemView.findViewById(R.id.course_number_text_view);
            courseInstructor = itemView.findViewById(R.id.instructor_text_view);
            creditHour = itemView.findViewById(R.id.credit_hour_text_view);


        }

    }
}
