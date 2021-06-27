package katlynbecvar.cs.courseregistration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button viewClassButton;
    Button registerForClassButton;
    Button dropClassButton;
    Button viewScheduleButton;

    private static ArrayList<CourseDataModel> courseInfo;
    static View.OnClickListener myViewOnClickListener;
    private static RecyclerView recyclerView;
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager recyclerViewLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewOnClickListener = new myViewOnClickListener(this);
        recyclerView.setHasFixedSize(true);

        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        courseInfo = new ArrayList<CourseDataModel>();
        for (int i = 0; i < CourseData.courseNameArray.length; i++) {

            courseInfo.add(new CourseDataModel(
                    CourseData.courseNameArray[i],
                    CourseData.courseNumberArray[i],
                    CourseData.courseInstructorArray[i],
                    CourseData.creditHoursArray[i]
            ));
        }

        adapter = new CourseAdapter(courseInfo);
        recyclerView.setAdapter(adapter);


        //initialize buttons and set onClickListener
        viewClassButton = (Button)findViewById(R.id.view_classes_button);
        viewClassButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               Intent viewClassesIntent = new Intent(MainActivity.this, ViewClasses.class);
               startActivity(viewClassesIntent);
            }
        });


        registerForClassButton = (Button)findViewById(R.id.register_f0r_classes_button);
        registerForClassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerForClassIntent = new Intent(MainActivity.this, RegisterForClasses.class);
                startActivity(registerForClassIntent);
            }
        });


        dropClassButton = (Button)findViewById(R.id.drop_classes_button);
        dropClassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dropClassIntent = new Intent(MainActivity.this, DropClasses.class);
                startActivity(dropClassIntent);
            }
        });


        viewScheduleButton = (Button)findViewById(R.id.view_schedule_button);
        viewScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewScheduleIntent = new Intent(MainActivity.this, ViewSchedule.class);
                startActivity(viewScheduleIntent);
            }
        });


    }
}