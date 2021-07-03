package katlynbecvar.cs.courseregistration;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.annotations.NotNull;

import java.util.ArrayList;

public class ViewScheduleAdapter extends FirebaseRecyclerAdapter<RegisterModel, ViewScheduleAdapter.ScheduleViewHolder>{
    ArrayList<ViewScheduleModel> viewScheduleModels;
    Context context;




    public ViewScheduleAdapter(FirebaseRecyclerOptions<RegisterModel> options, ViewScheduleActivity context) {
        super(options);
    }


    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       context = parent.getContext();
       LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_view_schedule_card_view, parent, false );
        return new ScheduleViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(ViewScheduleAdapter.ScheduleViewHolder holder, int position, RegisterModel model) {
        holder.courseInstructorTextView.setText(model.getCourseInstructor());
        holder.courseNameTextView.setText(model.getCourseName());
        holder.courseNumberTextView.setText(model.getCourseNumber());
        holder.creditHourTextView.setText(model.getCreditHour());
    }


    public static class ScheduleViewHolder extends RecyclerView.ViewHolder {

        TextView courseNameTextView, courseNumberTextView, courseInstructorTextView, creditHourTextView;
        public ScheduleViewHolder(View itemView){
            super(itemView);
            courseNameTextView = itemView.findViewById(R.id.course_name_text_view);
            courseNumberTextView = itemView.findViewById(R.id.course_number_text_view);
            courseInstructorTextView = itemView.findViewById(R.id.instructor_text_view);
            creditHourTextView = itemView.findViewById(R.id.credit_hour_text_view);
        }
    }
}
