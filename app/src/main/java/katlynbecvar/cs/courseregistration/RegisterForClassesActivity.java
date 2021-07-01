/*
package katlynbecvar.cs.courseregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterForClassesActivity extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private String userId;
    private String ref;
    private CourseModel courseModel;
    private Button registerButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_for_classes);

        EditText studentIDTextEdit = (EditText)findViewById(R.id.student_id_text_edit);
        String studentIDEditText = studentIDTextEdit.getText().toString();

        EditText courseNameTextEdit = (EditText)findViewById(R.id.course_name_edit_text);
        String courseNameEditText = courseNameTextEdit.getText().toString();

        EditText instructorTextEdit = (EditText)findViewById(R.id.course_instructor_edit_text);
        String instructorEditText = instructorTextEdit.getText().toString();

        EditText courseNumberTextEdit = (EditText) findViewById(R.id.course_number_text_edit);
        String courseNumberEditText = courseNumberTextEdit.getText().toString();

        EditText creditHoursTextEdit = (EditText)findViewById(R.id.credit_hour_text_edit);
        String creditHourEditText = creditHoursTextEdit.getText().toString();

        registerButton = findViewById(R.id.registration_submit_button);

        userId = getIntent().getStringExtra("uid");

        if(ref != null){

        }else{
            registerButton.setOnClickListener(new OnRegisterButtonClick());
        }

        private void setUi(){
            if(courseModel != null){
                studentIDTextEdit.setText(courseModel.getStudent_id());
                courseNameTextEdit.setText(courseModel.getCourse_name_text_edit());
                instructorTextEdit.setText(courseModel.getInstructor_text_edit());
                courseNumberTextEdit.setText(courseModel.getCourse_number_text_edit());
                creditHoursTextEdit.setText(courseModel.getCredit_hour_text_edit());
                registerButton.setOnClickListener(new OnRegisterButtonClick);

            }

        }

        }

    }

}*/
