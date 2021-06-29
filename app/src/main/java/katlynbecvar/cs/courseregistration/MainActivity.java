package katlynbecvar.cs.courseregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button viewClassButton;
    Button registerForClassButton;
    Button dropClassButton;
    Button viewScheduleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialize buttons and set onClickListener
        viewClassButton = (Button)findViewById(R.id.view_classes_button);
        viewClassButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               Intent viewClassesIntent = new Intent(MainActivity.this, ViewClassesActivity.class);
               startActivity(viewClassesIntent);
            }
        });


        registerForClassButton = (Button)findViewById(R.id.register_f0r_classes_button);
        registerForClassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerForClassIntent = new Intent(MainActivity.this, RegisterForClassesActivity.class);
                startActivity(registerForClassIntent);
            }
        });


        dropClassButton = (Button)findViewById(R.id.drop_classes_button);
        dropClassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dropClassIntent = new Intent(MainActivity.this, DropClassesActivity.class);
                startActivity(dropClassIntent);
            }
        });


        viewScheduleButton = (Button)findViewById(R.id.view_schedule_button);
        viewScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewScheduleIntent = new Intent(MainActivity.this, ViewScheduleActivity.class);
                startActivity(viewScheduleIntent);
            }
        });


    }


}